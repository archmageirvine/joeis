package irvine.math;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

import irvine.math.z.Z;

/**
 * Exhaustive binary lambda calculus census for A333479, A333958 and A361211.
 *
 * Enumeration uses binary lambda syntax with zero-based de Bruijn indices.
 * Normal order first evaluates the necessary weak head and then normalizes
 * beneath lambdas and in arguments of a variable. All work/stack limits
 * produce "unknown". A repeated outstanding demand for the exact same term,
 * in the same mode, would make a finite deterministic derivation impossible.
 *
 * Only zero-unknown rows are independently classified.
 * @author Gregory Morse
 */
public final class BinaryLambdaCensus {

  private static final int ABS = -1;
  private static final int APP = -2;
  private static final int HOLE = -3;
  private static final int TAIL = -4;
  private static final int TOWER = -5;
  private static final int NEUTRAL = -6;
  private static final int RIGID = -7;
  private static final Term PAYLOAD = new Term(HOLE, null, null);
  private static final Term INPUT_TAIL = new Term(TAIL, null, null);
  private static final Term TOWER_MEMBER = new Term(TOWER, null, null);
  private static final Term NEUTRAL_PAYLOAD = new Term(NEUTRAL, null, null);
  private static final int MAX_DEPTH = 256;
  private static final int MAX_GRAPH = 384;
  private static final int MAX_PROOF_NODES = 4096;
  // Per-run reuse of checked subproofs; no sequence data are loaded.
  private static final Set<Term> NO_NORMAL_FORM = new HashSet<>();
  private static final Set<Term> SPINE_LOOPS = new HashSet<>();

  private static final class Term {
    final int mKind;
    final Term mLeft;
    final Term mRight;
    final int mHash;
    final int mNodes;

    Term(final int kind, final Term left, final Term right) {
      mKind = kind;
      mLeft = left;
      mRight = right;
      final int l = left == null ? 0 : left.mHash;
      final int r = right == null ? 0 : right.mHash;
      mHash = mix(Integer.rotateLeft(l * 0x9e3779b1, 13) + r * 0x85ebca6b + kind * 0xc2b2ae35);
      mNodes = Math.min(MAX_PROOF_NODES + 1,
        1 + (left == null ? 0 : left.mNodes) + (right == null ? 0 : right.mNodes));
    }

    private static int mix(int x) {
      x = (x ^ x >>> 16) * 0x7feb352d;
      x = (x ^ x >>> 15) * 0x846ca68b;
      return x ^ x >>> 16;
    }

    @Override
    public int hashCode() {
      return mHash;
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj) {
        return true;
      }
      if (!(obj instanceof Term)) {
        return false;
      }
      final Term t = (Term) obj;
      if (mHash != t.mHash || mKind != t.mKind || mNodes != t.mNodes) {
        return false;
      }
      if (mNodes > 512) {
        return sameTree(this, t, new IdentityHashMap<>());
      }
      return (mLeft == null || mLeft.equals(t.mLeft)) && (mRight == null || mRight.equals(t.mRight));
    }

    private static boolean sameTree(final Term a, final Term b, final Map<Term, Set<Term>> seen) {
      if (a == b) {
        return true;
      }
      if (a.mHash != b.mHash || a.mKind != b.mKind || a.mNodes != b.mNodes) {
        return false;
      }
      // Substitution shares subtrees. Compare each actual pair once, not
      // once per occurrence in its possibly enormous unfolded tree.
      if (a.mNodes > 512 && !seen.computeIfAbsent(a, k -> java.util.Collections.newSetFromMap(new IdentityHashMap<>())).add(b)) {
        return true;
      }
      return (a.mLeft == null || sameTree(a.mLeft, b.mLeft, seen))
        && (a.mRight == null || sameTree(a.mRight, b.mRight, seen));
    }
  }

  // A finite beta reduct has a normal form iff the original has one, by
  // confluence. Try alternative reducts only after normal order hits a limit.
  private static void reductions(final Term t, final Normalizer worker, final int height, final Consumer<Term> out) {
    reductions(t, worker, height, out, false);
  }

  private static void reductions(final Term t, final Normalizer worker, final int height, final Consumer<Term> out,
                                 final boolean useEta) {
    worker.charge(height);
    if (t.mKind == ABS) {
      if (useEta && etaRedex(t, worker, height + 1)) {
        out.accept(worker.substitute(t.mLeft.mLeft, PAYLOAD, 0, height + 1));
      }
      reductions(t.mLeft, worker, height + 1, b -> out.accept(new Term(ABS, b, null)), useEta);
    } else if (t.mKind == APP) {
      reductions(t.mLeft, worker, height + 1, l -> out.accept(new Term(APP, l, t.mRight)), useEta);
      reductions(t.mRight, worker, height + 1, r -> out.accept(new Term(APP, t.mLeft, r)), useEta);
      if (t.mLeft.mKind == ABS) {
        out.accept(worker.substitute(t.mLeft.mLeft, t.mRight, 0, height + 1));
      }
    }
  }

  private static void proveDivergence(final Term original) {
    proveDivergence(original, true);
  }

  private static void proveDivergence(final Term original, final boolean allowEta) {
    if (selfApplicationProof(original)
      || divergenceGraph(original, false, 96, false) || divergenceGraph(original, true, MAX_GRAPH, false)
      || symbolicallyDiverges(original) || headLasso(original) || towerDiverges(original)
      || symbolicHeadPump(original) || rigidPump(original)
      || allowEta && (etaHeadDiverges(original) || divergenceGraph(original, false, 320, true))) {
      throw CYCLE;
    }
  }

  private static Term abs(final Term body) {
    return new Term(ABS, body, null);
  }

  private static boolean applicativeHead(Term t, final long allowed) {
    while (t.mKind == APP) {
      if (delayedOperand(t, allowed)) {
        return true;
      }
      t = t.mLeft;
    }
    return false;
  }

  private static boolean delayedOperand(Term t, final long allowed) {
    if (t.mKind == APP) {
      // An already-applied core cannot be rescued by a new argument:
      // exposed lambdas are vacuous in its core, and a rigid head
      // still demands the same divergent child.
      return delayedOperand(t.mLeft, allowed) && (t.mLeft.mKind == APP || delayedOperand(t.mRight, allowed));
    }
    if (t.mKind >= 0) {
      return t.mKind < Long.SIZE && (allowed & 1L << t.mKind) != 0;
    }
    int binders = 0;
    while (t.mKind == ABS) {
      ++binders;
      t = t.mLeft;
    }
    return binders > 0 && binders < Long.SIZE && (allowed << binders >>> binders) == allowed
      && applicativeHead(t, (allowed << binders) | 1L << (binders - 1));
  }

  private static boolean guardedApplication(final Term t) {
    return t.mKind == APP && t.mLeft.mKind >= 1 && applicativeHead(t.mRight, 1L);
  }

  private static boolean delayedSelfApplication(Term t) {
    final Term x = new Term(0, null, null);
    final Term y = new Term(1, null, null);
    final Term identity = abs(x);
    final Term z = new Term(2, null, null);
    while (t.mKind == APP) {
      if (t.mLeft.mKind == ABS && t.mRight.mKind == ABS) {
        final Term a = t.mRight.mLeft;
        final boolean self = t.mLeft.equals(t.mRight);
        if (self && a.equals(app(x, abs(app(y, app(x, app(x, abs(y)))))))) {
          // A X=X W(X), W(U)V=U(V H(V)), H(V)=V K(V).
          // Close the grammar under application and H as well as
          // A and W. For a head A, H returns its original operand;
          // for a head W(U), H on original operand D returns U D.
          // Thus evaluation of H(D) stays in the grammar. Applying
          // A or W to any grammar term returns an application again.
          // A finite head evaluation of an application would require
          // a strictly shorter one of its next application.
          return true;
        }
        final Term h = app(x, abs(y));
        final Term h2 = app(x, h);
        if (self && (a.equals(app(x, abs(app(h2, y))))
          || a.equals(app(x, abs(app(h, app(y, x))))))) {
          // A X = X W(X). Close the grammar A | W(F) | F F
          // under G(U,V)=U K(V). G(A,V) returns V.
          // For W(U) V = (V(V K(V)))U, G(W(U),V) returns V U.
          // For W(U) V = (V K(V))(U V), it returns V G(U,V).
          // Here V is the original operand of the K, regardless
          // of reductions on the left. Both outputs are in the
          // grammar, and applying either A or W creates an app.
          return true;
        }
        if (self && a.equals(app(x, abs(app(y, app(app(x, identity), y)))))) {
          // A X=X W(X), W(U)V=U((V I)U). Write P=A A,
          // T_1=W(A), T_2=W(T_1), S=(T_1 T_1)A.
          // P ->head* T_1 T_2 ->* A S, since T_2 I ->* T_1 T_1.
          // T_1 T_1 ->* A(P A), since T_1 I ->* P.
          // Thus S forces P on its head, and A S forces S.
          return true;
        }
        if (self && a.equals(app(x, app(x, abs(app(x, app(x, abs(z)))))))) {
          // A X=X(X W(X)), W(U)V=V(V K(U)).
          // Let T_i=W^i(A), R=A T_1. T_1 T_2 ->* T_2 A
          // -> A(A K(T_1)) ->* R. Then R -> T_1(T_1 T_2)
          // ->* T_1 R -> R(R K(A)). A A first forces R.
          return true;
        }
        final Term rightWrap = abs(app(y, h));
        if (self && (a.equals(app(x, app(x, rightWrap))) || a.equals(app(app(x, rightWrap), x)))) {
          // W(U)V=U H(V), H(V)=V K(V). With T_i=W^i(A),
          // Q=H(T_2) satisfies Q ->head* A H(H(K(T_2)))
          // ->* A Q, and A Q always forces Q again.
          // For A X=X(X W(X)), A A forces A T_1, which reaches
          // A H(T_1 T_2) and forces T_1 T_2 -> A Q.
          // For A X=X W(X) X, A A forces A T_1, and A T_1
          // reaches T_1 T_2 T_1 ->* A Q T_1.
          return true;
        }
        if (self && a.equals(app(x, app(x, abs(abs(app(x, app(z, x)))))))) {
          // A X=X(X K(J(X))), J(U)V=V(U V), T_i=J^i(A).
          // A A reaches A T_1. For i>0, A T_i reaches
          // T_i(T_i K(T_(i+1))) ->* T_i T_(i+1).
          // T_p T_q with p,q>0 demands T_(p-1) T_q on its
          // head spine, by two J steps. It lands on A T_(i+1).
          // See the corresponding tower derivation in Tromp's BB.txt.
          return true;
        }
        if (self && a.equals(app(app(app(x, abs(y)), abs(y)), app(x, x)))) {
          // A X=X K(X) K(X)(X X). Put C=K(A), D=K(C).
          // A C ->* A D A and A D ->* A C. This is a positive
          // head-spine loop, which A A reaches via A C C(A A).
          return true;
        }
        if (self && a.equals(app(app(x, abs(app(x, app(x, abs(z))))), x))) {
          // A X=X W(X) X, W(U)V=V(V K(U)).
          // T_i=W^i(A). A A reaches T_1 T_2 A.
          // T_1 T_2 -> T_2(T_2 K(A)) ->* T_2 A
          // -> A(A K(T_1)) ->* A T_1 -> T_1 T_2 T_1.
          // In the penultimate step A K(T_1) ->* T_1 K(T_1)
          // ->* T_1. The loop adds an inert trailing argument.
          return true;
        }
        if (self && a.mKind == APP && a.mLeft.mKind == APP && a.mLeft.mLeft.mKind == 0 && a.mLeft.mRight.mKind >= 1) {
          final Term kx = abs(y);
          if (a.mRight.equals(app(x, kx)) || a.mRight.equals(app(x, app(x, kx)))) {
            // A X = X r H^m(X), where H(X)=X K(X) only at the
            // innermost step: the tail is X K(X) or X(X K(X)).
            // A K(A) reduces to A A (the constant drops r).
            // In the first case P=A A reaches rigid r with P
            // among its demanded arguments. In the second case
            // P exposes A P as a demanded child, and A P uses
            // P as its head, exposing that same child again.
            return true;
          }
        }
        if (self && a.equals(abs(app(app(y, app(identity, y)), abs(y))))) {
          // A X Y = X (I X) K(Y). Under the lambda of A A,
          // or after any input V, its body reduces to A A K(V).
          // Thus the same computation remains needed on the spine.
          return true;
        }
        if (self && a.equals(abs(app(app(y, app(identity, y)), app(x, x))))) {
          // A X Y = X(I X)(Y Y). P=A A exposes its lambda
          // and P V ->* P(V V) for every V, because I A -> A.
          return true;
        }
        if (self && a.equals(abs(abs(app(z, app(app(z, z), x)))))) {
          // A X Y Z = X((X X) Z). With P=A A and T(U)=A(P U),
          // (P U) V ->head* T(V), so T(U) exposes two lambdas
          // whose body head-reduces to T((P U)(P U) Z).
          // P starts by exposing two lambdas over T(Z).
          return true;
        }
        if (self && a.equals(abs(app(y, app(y, app(app(y, y), x)))))) {
          // A X Y = X(X((X X)Y)). T=(A A)V -> A(A T).
          // The resulting lambda's body has an applied A T at
          // its head; (A T)W -> T(T((T T)W)). Hence each advance
          // demands T anew, under a fresh lambda or more arguments.
          return true;
        }
        if (self && a.equals(abs(app(y, app(app(y, app(y, y)), x))))) {
          // A X Y=X((X(X X))Y). Put P=A A and S(V)=A P V.
          // S(V) reaches P((P(P P))V), then A S((P(P P))V).
          // A S(W) exposes a lambda whose body forces S(W)
          // on its head spine. P starts by demanding A S(Y).
          return true;
        }
        if (self && a.equals(abs(app(app(y, abs(app(z, x))), abs(y))))) {
          // A X Y = X(E(X)) K(Y), E(U)=lambda v. U v.
          // P(i,j,V)=E^i(A) E^j(A) V. Peel E^i and unfold A:
          // P(i,j,V) ->* P(j,j+1,K(V)) by head steps.
          return true;
        }
        if (self && a.equals(abs(app(app(y, app(abs(z), x)), abs(y))))) {
          // A X Y = X(K(X)Y) K(Y). In P V, P=A A,
          // the inner K(A)V is a beta-redex returning A.
          // It returns to P K(V) after positive head progress.
          return true;
        }
        final Term flip = abs(abs(app(x, app(y, x))));
        final Term twist = abs(abs(app(y, app(x, y))));
        if (self && a.equals(app(app(x, twist), x))) {
          // T X Y=X(Y X); A X=X T X. Set U=T T, V=T U, L=U V,
          // C=T V U T, G=U U T, and F=A U T.
          // U T -> V, V T -> L, so L -> T(V T) ->* T L.
          // Consequently L Z ->* L(Z L), with positive head progress.
          // C ->* V L T ->* U(L U)T ->* (L U)T[T((L U)T)].
          // G ->* T C, so any G Z forces C and then an applied L.
          // F ->* U(U U)T ->* G(T G); A A ->* T F. Its
          // exposed lambda must normalize F on the head spine.
          return true;
        }
        if (self && a.equals(app(x, app(x, flip)))) {
          // T X Y = Y(X Y); B X=X(X T). T_0=T, T_(n+1)=T T_n.
          // B T -> T_2 and T_2 T -> T_3; B B reaches T_2 T_3.
          // T_i T_j (i>1,j>0) ->head* T_(i-1) T_j with
          // trailing arguments, using the rule twice.
          // T_1 T_j ->head* T_j T_(j+1), so the right rank grows.
          return true;
        }
        if (self && a.equals(app(app(x, flip), x))) {
          // T X Y = Y(X Y); C X=X T X; S_0=C, S_(i+1)=T S_i.
          // With D=T T, C T ->head* T D. For j>0, the rule
          // twice peels S_i S_j to S_(i-1) S_j plus arguments;
          // three uses likewise peel S_i T S_j to S_(i-1) T S_j.
          // The base C T S_j ->head* D S_j [S_(j-1)(D S_j)].
          // Therefore C S_j lands on D S_j, and D S_j ->head*
          // S_j S_(j+1) lands on D S_(j+1). C C starts at
          // C S_1 with two trailing args after ten head steps.
          // The symbolic stages are the BB35Spine re-entry proof.
          return true;
        }
        if (self && a.mKind == ABS && a.mLeft.mKind == APP && a.mLeft.mLeft.mKind >= 2
          && a.mLeft.mRight.equals(app(y, app(y, y)))) {
          // A x y = r(x(x x)) for rigid r. With T = A(A A),
          // A A -> lambda _. r T, and T ->* lambda _. r(r T).
          // The repeated demand for T cannot be erased by extra
          // applications: after the constant lambda its head is r.
          return true;
        }
        if (self && a.equals(app(app(x, identity), abs(app(x, app(y, x)))))) {
          // A X = X I W(X), W(U) V = V(U V). For C in the
          // grammar A | W(C) | I C, all C I head-reduce to W(I),
          // and C V forces V onto the spine. A C therefore leads
          // to W(C)(I W(C)); W(C) D leads to D(C D), forcing
          // the pair C D back to its head; I C merely delays.
          // This is the invariant of BB35Reentry in a9lim/blam.
          return true;
        }
        if (self && a.equals(app(x, abs(app(x, app(app(y, identity), x)))))) {
          // A X = X W(X), W(U) V = V((U I)V). For F = A | W(F),
          // A I ->* W(I), and W(C) I ->* I for every C in F
          // by induction. Thus W(C) D reduces to D(D D) if C=A,
          // or D D otherwise; D always forces its argument.
          return true;
        }
        if (self && a.equals(app(x, abs(app(app(x, identity), app(y, x)))))) {
          // W(U) V = (V I)(U V). Every D I in the A,W grammar
          // reaches W(I): for W(C) I the next demand is C I.
          // W(C) D reaches W(I)(C D), which forces the pair C D.
          return true;
        }
        if (self && a.equals(app(x, abs(app(app(app(x, identity), y), x))))) {
          // W(U) V = V I U V. Every D I reaches W(I), because
          // W(C) I ->* C I. W(I) I ->* I, so W(I) C ->*
          // W(I) I C ->* C. W(C) D consequently reaches C D.
          return true;
        }
        if (self && a.equals(app(x, abs(app(y, app(x, abs(abs(z)))))))) {
          // W(U) V = U H(V), H(V)=V K(K(V)). Let T_j=W^j(A).
          // T_j V ->head* A H^j(V). H removes one K when its
          // argument has head K. Thus H(T_2) ->* A T_2 and
          // H(T_3) ->* A H(T_3), a positive head-spine cycle
          // after one more head step. A A reaches A H(T_2),
          // then forces A T_2, which reaches A H(H(T_3)) and
          // forces H(T_3) on its spine.
          return true;
        }
        if (self && a.equals(app(x, abs(app(y, app(x, abs(y))))))) {
          // A X = X W(X), W(U) V = U H(V), H(V) = V K(V).
          // Let T=H(W(W(A))). A A head-reduces to A T. And T
          // head-reduces to A H(H(K(W(W(A))))), whose inner H(K(U))
          // contracts to U, giving A T. One more head step puts T
          // on the spine with a trailing argument.
          return true;
        }
        if (self && a.equals(app(x, abs(app(x, app(y, app(x, abs(y)))))))) {
          // A X=X W(X), W(U) V=V(U H(V)), H(V)=V K(V).
          // For C in the grammar A | W(C), C K(C) ->* C,
          // since the head is a constant when C=A or W(U).
          // W(C) D therefore reaches D(C D); every D forces
          // its input onto the spine, restoring the pair C D.
          return true;
        }
        if (t.mLeft.mLeft.equals(app(x, abs(y))) && a.equals(app(app(x, x), abs(app(x, y))))) {
          // B X = X X J(X), J(U) V = V U. Put Q_i = J^i(K(B)).
          // The input B K(B) reaches B Q_1. Q_i Q_i head-reduces
          // to Q_(i-1) Q_(i-1), so B Q_i ->head* B Q_(i+1).
          return true;
        }
        if (t.mLeft.mLeft.equals(app(app(x, x), abs(app(x, y)))) && a.equals(t.mLeft)) {
          // Same reversal-tower invariant, already at B K(B).
          return true;
        }
        if (self && a.mKind == APP && a.mNodes <= 128
          && (applicativeHead(a, 1L) || guardedApplication(a))) {
          // F is generated by A, applications, and the delayed
          // constructors recognized recursively above. Applying
          // either A or a constructor to a member of F returns a
          // fresh application prefix in F, possibly with trailing
          // arguments and under lambdas vacuous in that prefix.
          // Substituting extra inputs can only change the trailing
          // arguments; a new constructor captures only members of F.
          // A may also put its result under a rigid free head.
          // Its argument is then demanded for full normal form,
          // regardless of any trailing arguments at the head.
          return true;
        }
      }
      t = t.mLeft;
    }
    return false;
  }

  // Closed self-application proof schemas. These test syntax, not an
  // input-size cutoff or an expected term count. A productive descent
  // underneath lambdas or a variable head requires an infinite normal form.
  private static boolean selfApplicationProof(final Term t) {
    if (delayedSelfApplication(t)) {
      return true;
    }
    if (t.mKind != APP || t.mLeft.mKind != ABS || t.mRight.mKind != ABS) {
      return false;
    }
    final Term v0 = new Term(0, null, null);
    final Term v1 = new Term(1, null, null);
    final Term v2 = new Term(2, null, null);
    final Term duplicator = app(v0, v0);
    final Term a = t.mRight.mLeft;
    if (t.mLeft.equals(t.mRight) && a.equals(abs(app(v0, app(app(v1, v1), app(v1, v0)))))) {
      // A X Y=Y((X X)(X Y)). A A exposes under its lambda
      // a rigid Y applied to P(Y), where P(U)=(A A)(A U).
      // P(U) ->head* (A U)P(A U) ->head P(A U) with an
      // extra argument. Inductively the argument cannot normalize.
      return true;
    }
    if (t.mLeft.mLeft.equals(app(duplicator, v0))) {
      // A x y = (x y)(x y), T_0=A, T_(i+1)=A T_i.
      // A A T_i ->* T_(i+1) T_(i+1) ->* A A T_(i+1) with
      // extra trailing arguments. Each unfolding before the milestone is
      // a spine reduction, so all previous trailing arguments are inert.
      // See the BB34Spine proof at github.com/a9lim/blam.
      final Term xy = app(v1, v0);
      if (a.equals(abs(app(xy, xy)))) {
        return true;
      }
      final Term j = abs(app(v0, v1));
      if (a.equals(abs(app(app(v0, v1), j))) || a.equals(abs(app(xy, j)))) {
        // Put J(U)V=V U and T_i=J^i(B). Each pair of positive
        // towers drops both indices by one in two head steps.
        // The input triples B, reaching B T_0 T_1.
        // For B X Y = Y X J(Y), B T_i T_j (0<=i<j) lands on
        // B T_(j-i-1) T_(j+1). For B X Y = X Y J(Y), it lands
        // on B T_(j-i) T_(j+1). Both preserve the inequality.
        return true;
      }
      if (a.equals(abs(app(app(app(v0, abs(v2)), v0), v0)))) {
        // B X Y=Y K(X) Y Y. The triple B starts with B K(B) B B.
        // B K^i(B) B -> B K^(i+1)(B) B B, so peeling the
        // operator always re-enters the same family with fresh debt.
        return true;
      }
      if (a.equals(abs(app(app(v0, abs(v1)), xy)))) {
        // B X Y=H(Y)(X Y), H(V)=V K(V). With P=B B, U=B K(P),
        // B B B ->* H(P) B ->* P U B. Also U P ->* H(P) P
        // ->* P U P, and P U -> H(U)(B U) ->* (U P)(B U).
        // So P U returns to its head spine with more arguments.
        return true;
      }
      final Term hy = app(v0, abs(v1));
      if (a.equals(abs(app(app(v0, hy), v1)))) {
        // B X Y=Y H(Y) X, T_i=H^i(B), C_i=K(T_i).
        // T_i is B C_0 ... C_(i-1). B C_0 C_i ->* T_i C_0
        // ->* B C_0, inductively cancelling smaller C_j's.
        // Thus B C_0 T_n -> T_n T_(n+1) C_0 ->* B C_0
        // T_(n+1) C_0. B B B reaches B C_0 T_2 T_1.
        return true;
      }
      if (a.equals(abs(app(app(v0, v1), hy))) || a.equals(abs(app(xy, hy)))) {
        // Derive and replay the two finite spine certificates,
        // contracting only beta-redexes with an unused binder
        // between counted head steps.
        final Term b = t.mRight;
        final Term t1 = app(b, abs(b));
        final Term t2 = app(t1, abs(t1));
        final Term t3 = app(t2, abs(t2));
        final Term goal = a.equals(abs(app(app(v0, v1), hy))) ? app(app(b, b), t2) : app(app(b, t3), t3);
        return entersHead(t, goal, 48) && entersHead(goal, goal, 48);
      }
      return false;
    }
    if (!t.mLeft.mLeft.equals(duplicator)) {
      return false;
    }
    if (a.equals(abs(app(v0, app(v1, app(v1, abs(v2))))))) {
      // A x y = y(x(x K(x))), K(x) = lambda _. x.
      // A K(A) ->* J = lambda b. b A; J K(J) ->* J;
      // J J -> J A -> A A. Thus A A ->* lambda y. y(lambda b. b(A A)).
      return true;
    }
    if (a.equals(abs(app(v1, abs(app(v1, app(v2, v0))))))) {
      // A x y = x(lambda z. y(x z)). Let F contain A and all wrappers
      // W(r,C) = lambda z. r(C z), for a rigid ambient variable r and C in F.
      // W(r,C) V -> r(C V). A W(r,C) ->* lambda y. r(C W(y,W(r,C))).
      // A A -> lambda y. A W(y,A). Hence every pair U V with U,V in F
      // exposes a further pair under a binder or rigid head. BB34Compose
      // in github.com/a9lim/blam certifies the open-variable form.
      return true;
    }
    if (a.equals(abs(app(v1, abs(app(app(v2, v0), v1)))))) {
      // A x y = x H(x,y), H(U,V) = lambda z. (U z) V.
      // A A reaches lambda y z. A H(H(A,y),z) y. For U a nonempty stack of
      // H wrappers over A with innermost second argument y, A U y ->
      // U H(U,y); peeling U yields A H(U,y) y with trailing arguments.
      // This preserves the innermost y and grows the stack indefinitely.
      return true;
    }
    // A x = x W(x), W(U) = lambda y z. y(U y), T_j=W^j(A).
    // Define P(i,j) = T_j (T_i T_j), j>=1, and K(M)=lambda _.M.
    // P(i,j) ->* K(P(i-1,j)) for i>0, by peeling T_i and dropping an
    // argument of the resulting constant lambda. P(0,j) ->* K(P(j-1,j+1)),
    // using A T_j -> T_j T_(j+1). A A ->* K(P(0,2)). All T_j are closed.
    return a.equals(app(v0, abs(abs(app(v1, app(v2, v1))))));
  }

  private static boolean closed(final Term t, final int depth) {
    if (t.mKind >= 0) {
      return t.mKind < depth;
    }
    if (t.mKind == ABS) {
      return closed(t.mLeft, depth + 1);
    }
    if (t.mKind == APP) {
      return closed(t.mLeft, depth) && closed(t.mRight, depth);
    }
    // A tower marker stands for a closed term. An unrestricted hole,
    // on the other hand, must not be a base term or a wrapper.
    return t.mKind == TOWER || t.mKind <= RIGID;
  }

  // Fixed ambient variables can be made atoms for the proof search.
  // Unlike a local de Bruijn index, an atom cannot be captured or moved
  // by a binder. The proof decodes each atom as its distinct free name.
  private static Term freezeFree(final Term t, final int depth) {
    if (t.mKind >= 0) {
      return t.mKind < depth ? t : new Term(RIGID - (t.mKind - depth), null, null);
    }
    if (t.mKind == ABS) {
      final Term b = freezeFree(t.mLeft, depth + 1);
      return b == t.mLeft ? t : new Term(ABS, b, null);
    }
    if (t.mKind == APP) {
      final Term l = freezeFree(t.mLeft, depth);
      final Term r = freezeFree(t.mRight, depth);
      return l == t.mLeft && r == t.mRight ? t : app(l, r);
    }
    return t;
  }

  private static int markers(final Term t) {
    return t.mKind == TOWER ? 1 : t.mKind == ABS ? markers(t.mLeft)
      : t.mKind == APP ? markers(t.mLeft) + markers(t.mRight) : 0;
  }

  private static void wrappers(final Term t, final Set<Term> found) {
    if (t.mKind == ABS || t.mKind == APP) {
      final int holes = markers(t);
      if (holes > 0 && holes <= 2 && closed(t, 0)) {
        found.add(t);
      }
      wrappers(t.mLeft, found);
      if (t.mKind == APP) {
        wrappers(t.mRight, found);
      }
    }
  }

  private static Term app(final Term l, final Term r) {
    return new Term(APP, l, r);
  }

  private static final class TowerGrammar {
    final List<Term> mProductions;
    final Map<Term, Boolean> mMembership = new HashMap<>();
    private int mFuel = 150_000;

    TowerGrammar(final Term base, final Term wrapper, final Term other, final boolean applications) {
      final List<Term> rules = new ArrayList<>();
      rules.add(base);
      rules.add(wrapper);
      if (other != null && !other.equals(wrapper)) {
        rules.add(other);
      }
      if (applications) {
        rules.add(app(TOWER_MEMBER, TOWER_MEMBER));
      }
      mProductions = List.copyOf(rules);
    }

    boolean accepts(final Term t) {
      if (t.mKind == TOWER) {
        return true;
      }
      if (mFuel <= 0 || t.mNodes > MAX_PROOF_NODES) {
        return false;
      }
      final Boolean cached = mMembership.get(t);
      if (cached != null) {
        return cached;
      }
      if (t.equals(mProductions.get(0))) {
        return true;
      }
      for (int i = 1; i < mProductions.size(); ++i) {
        if (accepts(mProductions.get(i), t)) {
          remember(t, true);
          return true;
        }
      }
      remember(t, false);
      return false;
    }

    void remember(final Term t, final boolean value) {
      if (mMembership.size() < 32_768) {
        mMembership.put(t, value);
      }
    }

    boolean accepts(final Term pattern, final Term t) {
      // This is a proof search cap. A missed match cannot certify a loop.
      if (--mFuel <= 0) {
        return false;
      }
      if (pattern.mKind == TOWER) {
        return accepts(t);
      }
      return pattern.mKind == t.mKind && (pattern.mKind >= 0 || pattern.mKind <= RIGID
        || accepts(pattern.mLeft, t.mLeft) && (pattern.mKind != APP || accepts(pattern.mRight, t.mRight)));
    }

    List<Term> split(final Term t) {
      if (t.mKind == TOWER) {
        return mProductions;
      }
      if (t.mKind == ABS) {
        final List<Term> out = new ArrayList<>();
        for (final Term b : split(t.mLeft)) {
          out.add(new Term(ABS, b, null));
        }
        return out;
      }
      if (t.mKind == APP) {
        final List<Term> out = new ArrayList<>();
        final List<Term> right = split(t.mRight);
        for (final Term l : split(t.mLeft)) {
          for (final Term r : right) {
            out.add(app(l, r));
          }
        }
        return out;
      }
      return List.of(t);
    }
  }

  /**
   * The marker in a pattern denotes any finite tree generated by a closed
   * base and closed wrappers. Splitting each occurrence independently covers
   * every instantiation. The rank argument is the same as checkPump, but
   * grammar membership replaces the unrestricted one-hole test.
   */
  private static boolean towerCase(final TowerGrammar grammar, final Term pattern, final Term start,
                                   final boolean beta) {
    final Set<Term> pendingLoose = new HashSet<>();
    final Set<Term> pendingStrict = new HashSet<>();
    final Queue<Term> loose = new ArrayDeque<>();
    final Queue<Term> strict = new ArrayDeque<>();
    loose.add(start);
    pendingLoose.add(start);
    while (!strict.isEmpty() || !loose.isEmpty()) {
      final boolean progressed = !strict.isEmpty();
      final Term t = progressed ? strict.remove() : loose.remove();
      if (progressed && grammar.accepts(pattern, t)) {
        return true;
      }
      for (final Term v : strictSuccessors(t)) {
        if (v.mNodes > MAX_PROOF_NODES) {
          continue;
        }
        if (grammar.accepts(pattern, v)) {
          return true;
        }
        if (pendingStrict.size() < 72 && pendingStrict.add(v)) {
          strict.add(v);
        }
      }
      if (beta) {
        final Queue<Term> queue = progressed ? strict : loose;
        final Set<Term> seen = progressed ? pendingStrict : pendingLoose;
        try {
          reductions(t, new Normalizer(96), 0, v -> {
            if (v.mNodes > MAX_PROOF_NODES) {
              return;
            }
            if (progressed && grammar.accepts(pattern, v)) {
              throw CYCLE;
            }
            if (seen.size() < (progressed ? 72 : 16) && seen.add(v)) {
              queue.add(v);
            }
          });
        } catch (final Verdict v) {
          if (v == CYCLE) {
            return true;
          }
          if (v != LIMIT) {
            throw v;
          }
        }
      }
    }
    return false;
  }

  private static boolean towerProof(final TowerGrammar grammar, final Term pattern) {
    for (final Term split : grammar.split(pattern)) {
      if (!towerCase(grammar, pattern, split, false) && !towerCase(grammar, pattern, split, true)) {
        return false;
      }
    }
    return true;
  }

  private static boolean hasHeadPrefix(final TowerGrammar grammar, final Term pattern, Term t) {
    while (t.mKind == APP) {
      if (grammar.accepts(pattern, t)) {
        return true;
      }
      t = t.mLeft;
    }
    return false;
  }

  private static Term weakStep(final Term t, final Normalizer worker, final int height) {
    worker.charge(height);
    if (t.mKind != APP) {
      return null;
    }
    if (t.mLeft.mKind == ABS) {
      return worker.substitute(t.mLeft.mLeft, t.mRight, 0, height + 1);
    }
    final Term l = weakStep(t.mLeft, worker, height + 1);
    return l == null ? null : app(l, t.mRight);
  }

  // A weak-head contraction is a spine contraction and remains one
  // through any added trailing arguments. Other beta contractions lift
  // through those arguments as ordinary beta steps. A repeating path
  // with infinitely many spine contractions contradicts hypernormalization.
  private static boolean headReturn(final Term start, final Predicate<Term> returns) {
    try {
      final Term first = weakStep(start, new Normalizer(512), 0);
      if (first == null || first.mKind != APP || first.mNodes > MAX_PROOF_NODES) {
        return false;
      }
      final Set<Term> seen = new HashSet<>();
      final Queue<Term> queue = new PriorityQueue<>(Comparator.comparingInt(u -> u.mNodes));
      seen.add(first);
      queue.add(first);
      for (int explored = 0; explored < 192 && !queue.isEmpty(); ++explored) {
        final Term t = queue.remove();
        if (returns.test(t)) {
          return true;
        }
        try {
          reductions(t, new Normalizer(320), 0, u -> {
            if (u.mKind == APP && u.mNodes <= MAX_PROOF_NODES) {
              if (returns.test(u)) {
                throw CYCLE;
              }
              if (seen.size() < 512 && seen.add(u)) {
                queue.add(u);
              }
            }
          });
        } catch (final Verdict v) {
          if (v == CYCLE) {
            return true;
          }
          if (v != LIMIT) {
            throw v;
          }
        }
      }
    } catch (final Verdict v) {
      if (v != LIMIT) {
        throw v;
      }
    }
    return false;
  }

  private static boolean hasSpineLoop(Term t) {
    if (SPINE_LOOPS.isEmpty()) {
      return false;
    }
    while (t.mKind == APP) {
      if (SPINE_LOOPS.contains(t)) {
        return true;
      }
      t = t.mLeft;
    }
    return false;
  }

  private static boolean headLasso(Term t) {
    while (t.mKind == ABS) {
      t = t.mLeft;
    }
    for (int i = 0; i < 5 && t != null && t.mKind == APP; ++i) {
      final Term seed = t;
      if (hasSpineLoop(seed)) {
        return true;
      }
      if (headReturn(seed, candidate -> {
        for (Term u = candidate; u.mKind == APP; u = u.mLeft) {
          if (u.equals(seed)) {
            return true;
          }
        }
        return false;
      })) {
        if (closed(seed, 0) && SPINE_LOOPS.size() < 4096) {
          SPINE_LOOPS.add(seed);
        }
        return true;
      }
      t = nextLeftmost(t);
    }
    return false;
  }

  private static boolean matchesHead(Term t, final Term pattern) {
    while (t.mKind == APP) {
      if (matches(pattern, t, 0)) {
        return true;
      }
      t = t.mLeft;
    }
    return false;
  }

  private static boolean headPump(final Term pattern) {
    final Normalizer worker = new Normalizer(384);
    Term t = pattern;
    try {
      for (int i = 0; i < 18; ++i) {
        t = weakStep(t, worker, 0);
        if (t == null || t.mNodes > MAX_PROOF_NODES) {
          return false;
        }
        if (matchesHead(t, pattern)) {
          return true;
        }
      }
    } catch (final Verdict v) {
      if (v != LIMIT) {
        throw v;
      }
    }
    return false;
  }

  private static boolean symbolicHeadPump(final Term original) {
    final Set<Term> reached = new HashSet<>();
    final Set<Term> tried = new HashSet<>();
    final Queue<Term> queue = new ArrayDeque<>();
    reached.add(original);
    queue.add(original);
    while (!queue.isEmpty()) {
      final Term t = queue.remove();
      for (Term prefix = t; prefix.mKind == APP; prefix = prefix.mLeft) {
        if (prefix.mLeft.mKind == APP) {
          final Term pattern = app(prefix.mLeft, PAYLOAD);
          if (tried.add(pattern) && headPump(pattern)) {
            if (prefix.mNodes <= 256 && SPINE_LOOPS.size() < 4096) {
              SPINE_LOOPS.add(prefix);
            }
            return true;
          }
        }
      }
      for (final Term u : strictSuccessors(t)) {
        if (u.mNodes <= 256 && reached.size() < 24 && reached.add(u)) {
          queue.add(u);
        }
      }
    }
    return false;
  }

  // A finite weak-head sequence to another member in function position
  // lifts through any trailing arguments. A proper already present left
  // prefix can also be used: for a term with a WHNF, its prefix takes at
  // most as many weak steps, and has strictly smaller input size.
  private static boolean towerHeadProof(final TowerGrammar grammar, final Term pattern) {
    return towerHeadProof(grammar, List.of(pattern));
  }

  private static boolean headInFamily(final TowerGrammar grammar, final List<Term> patterns, final Term t) {
    return patterns.stream().anyMatch(pattern -> hasHeadPrefix(grammar, pattern, t));
  }

  private static boolean towerHeadProof(final TowerGrammar grammar, final List<Term> patterns) {
    for (final Term pattern : patterns) {
      for (final Term start : grammar.split(pattern)) {
        if (!towerHeadCase(grammar, patterns, start)) {
          return false;
        }
      }
    }
    return true;
  }

  private static boolean towerHeadCase(final TowerGrammar grammar, final List<Term> patterns, Term t) {
      if (t.mKind == APP && headInFamily(grammar, patterns, t.mLeft)) {
        return true;
      }
      final Normalizer worker = new Normalizer(480);
      try {
        for (int i = 0; i < 24; ++i) {
          t = weakStep(t, worker, 0);
          if (t == null || t.mNodes > MAX_PROOF_NODES) {
            break;
          }
          if (headInFamily(grammar, patterns, t)) {
            return true;
          }
        }
      } catch (final Verdict v) {
        if (v != LIMIT) {
          throw v;
        }
      }
      return false;
  }

  private static boolean towerDiverges(final Term original) {
    Term t = original;
    while (t.mKind == ABS) {
      t = t.mLeft; // A lambda body must normalize.
    }
    t = freezeFree(t, 0);
    if (t.mKind != APP || t.mRight.mKind != ABS || !closed(t.mRight, 0)) {
      return false;
    }
    final Term base = t.mRight;
    final Set<Term> ws = new LinkedHashSet<>();
    wrappers(new Normalizer(320).substitute(base.mLeft, TOWER_MEMBER, 0, 0), ws);
    if (ws.isEmpty()) {
      return false;
    }
    final List<Term> landings = new ArrayList<>();
    final Set<Term> reached = new HashSet<>();
    landings.add(t);
    reached.add(t);
    for (int i = 0; i < landings.size(); ++i) {
      for (final Term u : strictSuccessors(landings.get(i))) {
        if (u.mNodes <= 512 && landings.size() < 32 && reached.add(u)) {
          landings.add(u);
        }
      }
    }
    if (doubleDelay(base) && reached.contains(app(base, base))) {
      return true;
    }
    final List<Term> options = new ArrayList<>(ws);
    final List<Term> patterns = List.of(app(TOWER_MEMBER, TOWER_MEMBER),
      app(base, TOWER_MEMBER), app(TOWER_MEMBER, base),
      app(app(TOWER_MEMBER, TOWER_MEMBER), TOWER_MEMBER));
    for (int i = 0; i < options.size(); ++i) {
      for (int j = i; j < options.size(); ++j) {
        final TowerGrammar grammar = new TowerGrammar(base, options.get(i), options.get(j), false);
        for (final Term pattern : patterns) {
          if (landings.stream().anyMatch(u -> grammar.accepts(pattern, u)) && towerProof(grammar, pattern)) {
            return true;
          }
          if (landings.stream().anyMatch(u -> hasHeadPrefix(grammar, pattern, u)) && towerHeadProof(grammar, pattern)) {
            rememberHeadLandings(landings, grammar, List.of(pattern));
            return true;
          }
        }
      }
    }
    final Term pair = app(TOWER_MEMBER, TOWER_MEMBER);
    for (final Term wrapper : options) {
      final TowerGrammar grammar = new TowerGrammar(base, wrapper, null, true);
      if (landings.stream().anyMatch(u -> hasHeadPrefix(grammar, pair, u)) && towerHeadProof(grammar, pair)) {
        rememberHeadLandings(landings, grammar, List.of(pair));
        return true;
      }
    }
    for (final Term wrapper : options) {
      final TowerGrammar grammar = new TowerGrammar(replaceTower(wrapper, base), wrapper, null, false);
      if (landings.stream().anyMatch(u -> hasHeadPrefix(grammar, pair, u)) && towerHeadProof(grammar, pair)) {
        rememberHeadLandings(landings, grammar, List.of(pair));
        return true;
      }
    }
    // Some towers start at a constant abstraction over the original
    // function. The recurring control state then has two shapes.
    final Term constant = new Term(ABS, base, null);
    final List<Term> controls = List.of(app(base, TOWER_MEMBER), app(app(TOWER_MEMBER, TOWER_MEMBER), TOWER_MEMBER));
    for (final Term wrapper : options) {
      final TowerGrammar grammar = new TowerGrammar(constant, wrapper, null, false);
      if (landings.stream().anyMatch(u -> headInFamily(grammar, controls, u)) && towerHeadProof(grammar, controls)) {
        rememberHeadLandings(landings, grammar, controls);
        return true;
      }
    }
    return false;
  }

  private static Term replaceTower(final Term t, final Term value) {
    if (t.mKind == TOWER) {
      return value;
    }
    if (t.mKind == ABS) {
      return new Term(ABS, replaceTower(t.mLeft, value), null);
    }
    return t.mKind == APP ? app(replaceTower(t.mLeft, value), replaceTower(t.mRight, value)) : t;
  }

  // For A = lambda x. x (x (lambda y z. x y)), put K(U)=lambda z.U,
  // W(U)=lambda y z.U y, T_0=A, T_(i+1)=W(T_i); all are closed.
  // Then T_i V ->* K^i(A V) for closed V, by induction on i.
  // For i>=1:
  // A T_i -> T_i (T_i T_(i+1))
  //       ->* K^i(A (K^i(A T_(i+1))))
  //       ->* K^(2i-1)(A T_(i+1)).
  // The last contraction is A Q -> Q (Q W(Q)) and K drops its argument.
  // A A -> A (A T_1) -> (A T_1)((A T_1) W(A T_1)) ->* A T_2,
  // using the i=1 case. A normal form of A A would therefore give
  // normal forms of strictly decreasing size for A T_2, A T_3, ...
  private static boolean doubleDelay(final Term a) {
    final Term body = a.mLeft;
    if (body.mKind != APP || body.mLeft.mKind != 0 || body.mRight.mKind != APP
      || body.mRight.mLeft.mKind != 0) {
      return false;
    }
    final Term w = body.mRight.mRight;
    return w.mKind == ABS && w.mLeft.mKind == ABS && w.mLeft.mLeft.mKind == APP
      && w.mLeft.mLeft.mLeft.mKind == 2 && w.mLeft.mLeft.mRight.mKind == 1;
  }

  private static void rememberHeadLandings(final List<Term> landings, final TowerGrammar grammar,
                                           final List<Term> patterns) {
    for (final Term t : landings) {
      if (t.mKind == APP && t.mNodes <= 288 && SPINE_LOOPS.size() < 4096 && headInFamily(grammar, patterns, t)) {
        SPINE_LOOPS.add(t);
      }
    }
  }

  // A hole can stand for any payload, but it cannot refer to binders
  // surrounding it in the template. This is what makes substitution
  // and shifts on an uninspected symbolic hole capture-safe.
  private static boolean avoidsBinders(final Term t, final int binders, final int inner) {
    if (binders == 0 || t.mKind == HOLE || t.mKind == NEUTRAL || t.mKind <= RIGID) {
      return true;
    }
    if (t.mKind >= 0) {
      return t.mKind < inner || t.mKind - inner >= binders;
    }
    if (t.mKind == ABS) {
      return avoidsBinders(t.mLeft, binders, inner + 1);
    }
    return avoidsBinders(t.mLeft, binders, inner) && avoidsBinders(t.mRight, binders, inner);
  }

  private static boolean matches(final Term pattern, final Term t, final int depth) {
    if (pattern.mKind == HOLE) {
      return avoidsBinders(t, depth, 0);
    }
    if (pattern.mKind == NEUTRAL) {
      return hasNeutralHead(t, depth) && avoidsBinders(t, depth, 0);
    }
    return pattern.mKind == t.mKind && (pattern.mKind >= 0
      || matches(pattern.mLeft, t.mLeft, depth + (pattern.mKind == ABS ? 1 : 0))
        && (pattern.mKind != APP || matches(pattern.mRight, t.mRight, depth)));
  }

  private static boolean hasNeutralHead(Term t, final int depth) {
    while (t.mKind == APP) {
      t = t.mLeft;
    }
    return t.mKind >= depth || t.mKind == NEUTRAL || t.mKind <= RIGID;
  }

  // In a rigid-headed term the arguments must normalize, even if they
  // are never evaluated when seeking just a weak head normal form.
  // A neutral-hole template preserves that head for all instantiations.
  private static boolean rigidPump(final Term original) {
    final Set<Term> seen = new HashSet<>();
    final Set<Term> tried = new HashSet<>();
    final Queue<Term> pending = new ArrayDeque<>();
    final Term root = renameFree(original);
    pending.add(root);
    seen.add(root);
    while (!pending.isEmpty()) {
      final Term t = pending.remove();
      if (t.mKind == APP) {
        if (hasNeutralHead(t.mRight, 0)) {
          final Term pattern = app(t.mLeft, NEUTRAL_PAYLOAD);
          if (tried.add(pattern) && checkPump(pattern)) {
            return true;
          }
        }
        if (t.mLeft.mKind == APP && hasNeutralHead(t.mLeft.mRight, 0)) {
          final Term pattern = app(app(t.mLeft.mLeft, NEUTRAL_PAYLOAD), t.mRight);
          if (tried.add(pattern) && checkPump(pattern)) {
            return true;
          }
        }
      }
      for (final Term u : strictSuccessors(t)) {
        if (u.mNodes <= 512 && seen.size() < 40) {
          final Term v = renameFree(u);
          if (seen.add(v)) {
            pending.add(v);
          }
        }
      }
    }
    return false;
  }

  private static Term generalize(final Term a, final Term b, final int depth) {
    if (a.equals(b)) {
      return a;
    }
    if (a.mKind == b.mKind && a.mKind < 0) {
      final Term l = generalize(a.mLeft, b.mLeft, depth + (a.mKind == ABS ? 1 : 0));
      if (l != null) {
        final Term r = a.mKind == ABS ? null : generalize(a.mRight, b.mRight, depth);
        if (a.mKind == ABS || r != null) {
          return new Term(a.mKind, l, r);
        }
      }
    }
    return avoidsBinders(a, depth, 0) && avoidsBinders(b, depth, 0) ? PAYLOAD : null;
  }

  private static Term nextLeftmost(final Term t) {
    try {
      return leftmost(t, new Normalizer(320), 0);
    } catch (final Verdict v) {
      if (v == LIMIT) {
        return null;
      }
      throw v;
    }
  }

  private static List<Term> strictSuccessors(final Term t) {
    final List<Term> list = new ArrayList<>();
    demandChildren(t, list::add);
    final Term next = nextLeftmost(t);
    if (next != null) {
      list.add(next);
    }
    return list;
  }

  // Starting from a template, find a finite, uniform path back into the
  // family. Any strict step decreases a normalizable member's rank, so
  // there is no finite normal form for any member of a recurrent family.
  private static boolean checkPump(final Term pattern) {
    final Set<Term> seen = new HashSet<>();
    final Queue<Term> queue = new ArrayDeque<>();
    seen.add(pattern);
    queue.add(pattern);
    while (!queue.isEmpty()) {
      for (final Term t : strictSuccessors(queue.remove())) {
        if (t.mNodes > MAX_PROOF_NODES) {
          continue;
        }
        final Term u = renameFree(t);
        if (matches(pattern, u, 0)) {
          return true;
        }
        if (seen.size() < 24 && seen.add(u)) {
          queue.add(u);
        }
      }
    }
    return false;
  }

  private static boolean checkPumpWithReductions(final Term pattern) {
    final Set<Term> seen = new HashSet<>();
    final Queue<Term> queue = new ArrayDeque<>();
    // Generated from strict descendants only, so every queued state
    // already has a strictly decreasing path from the pattern.
    for (final Term t : strictSuccessors(pattern)) {
      if (t.mNodes > MAX_PROOF_NODES) {
        continue;
      }
      final Term u = renameFree(t);
      if (seen.add(u)) {
        queue.add(u);
      }
    }
    final Consumer<Term> offer = t -> {
      if (t.mNodes > MAX_PROOF_NODES) {
        return;
      }
      final Term u = renameFree(t);
      if (matches(pattern, u, 0)) {
        throw CYCLE;
      }
      if (seen.size() < 32 && seen.add(u)) {
        queue.add(u);
      }
    };
    while (!queue.isEmpty()) {
      final Term t = queue.remove();
      if (matches(pattern, t, 0)) {
        return true;
      }
      strictSuccessors(t).forEach(offer);
      try {
        reductions(t, new Normalizer(192), 0, offer);
      } catch (final Verdict v) {
        if (v == CYCLE) {
          return true;
        }
        if (v != LIMIT) {
          throw v;
        }
      }
    }
    return false;
  }

  private static boolean symbolicallyDiverges(final Term original) {
    final List<Term> examples = new ArrayList<>();
    final Set<Term> reached = new HashSet<>();
    final Set<Term> tried = new HashSet<>();
    examples.add(original);
    reached.add(original);
    for (int i = 0; i < examples.size() && i < 48; ++i) {
      final Term current = examples.get(i);
      for (int j = Math.max(0, i - 16); j < i; ++j) {
        final Term t = examples.get(j);
        if (t.mKind == current.mKind && t.mKind < 0) {
          final Term pattern = generalize(t, current, 0);
          if (pattern != null && pattern.mKind != HOLE && tried.add(pattern) && checkPump(pattern)) {
            return true;
          }
        }
      }
      for (final Term successor : strictSuccessors(current)) {
        if (successor.mNodes > MAX_PROOF_NODES) {
          continue;
        }
        final Term next = renameFree(successor);
        if (examples.size() < 48 && reached.add(next)) {
          examples.add(next);
        }
      }
    }
    // Attempt arbitrary beta steps only after cheaper all-strict checks.
    for (final Term pattern : tried) {
      try {
        if (checkPumpWithReductions(pattern)) {
          return true;
        }
      } catch (final Verdict v) {
        if (v == CYCLE) {
          return true;
        }
        throw v;
      }
    }
    return false;
  }

  private static boolean divergenceGraph(final Term original, final boolean useDemands, final int maxGraph,
                                         final boolean useEta) {
    final Set<Term> seen = new HashSet<>();
    final Set<Term> testedHeads = new HashSet<>();
    final Queue<Term> queue = new ArrayDeque<>();
    final Map<Term, List<Term>> edges = new HashMap<>();
    final Map<Term, List<Term>> demands = new HashMap<>();
    final Term root = renameFree(original);
    seen.add(root);
    queue.add(root);
    while (!queue.isEmpty()) {
      final Term t = queue.remove();
      if (!useEta && (NO_NORMAL_FORM.contains(t) || hasSpineLoop(t) || selfApplicationProof(t))) {
        return true;
      }
      if (!useEta) {
        for (Term h = t; h.mKind == APP; h = h.mLeft) {
          if (h.mNodes <= 128 && h.mLeft.mKind == ABS && h.mLeft.equals(h.mRight)
            && testedHeads.add(h) && headEmbeds(h)) {
            return true;
          }
        }
      }
      if (!useDemands && !useEta && t != root) {
        try {
          new Normalizer(2500).normalSize(t, 0);
          return false;
        } catch (final Verdict v) {
          if (v == CYCLE) {
            return true;
          }
          if (v != LIMIT) {
            throw v;
          }
        }
      }
      final List<Term> outgoing = new ArrayList<>();
      edges.put(t, outgoing);
      final List<Term> needed = new ArrayList<>();
      demands.put(t, needed);
      try {
        reductions(t, new Normalizer(512), 0, next -> offer(next, seen, queue, outgoing, maxGraph), useEta);
      } catch (final Verdict v) {
        if (v != LIMIT) {
          throw v;
        }
      }
      if (useDemands) {
        demandChildren(t, child -> {
          if (offer(child, seen, queue, outgoing, maxGraph)) {
            needed.add(renameFree(child));
          }
        });
      }
    }
    for (final Term t : edges.keySet()) {
      for (final Term needed : demands.get(t)) {
        if (reaches(needed, t, edges)) {
          return true;
        }
      }
      try {
        final Normalizer worker = new Normalizer(512);
        final Term next = useEta ? spine(t, worker, 0) : leftmost(t, worker, 0);
        if (next != null && next.mNodes <= MAX_PROOF_NODES && reaches(renameFree(next), t, edges)) {
          return true;
        }
        if (!useEta && !useDemands && t.mKind == APP) {
          final Term headStep = spine(t, worker, 0);
          if (headStep != null && headStep.mNodes <= MAX_PROOF_NODES
            && reaches(renameFree(headStep), t, edges, true)) {
            return true;
          }
        }
      } catch (final Verdict v) {
        if (v != LIMIT) {
          throw v;
        }
      }
    }
    return false;
  }

  // A focused search on the actual self-application, not the arbitrary
  // arguments that may have been appended outside its head computation.
  private static boolean headEmbeds(final Term target) {
    try {
      final Term first = spine(target, new Normalizer(512), 0);
      final Queue<Term> queue = new PriorityQueue<>(Comparator.comparingInt(u -> u.mNodes));
      final Set<Term> seen = new HashSet<>();
      queue.add(first);
      seen.add(first);
      final Term small = squashIdentities(first);
      Term fast = small;
      for (int steps = 0; fast != null && fast.mKind == APP && fast.mNodes <= 512 && steps < 8; ++steps) {
        if (onHeadSpine(target, fast)) {
          return true;
        }
        fast = spine(fast, new Normalizer(512), 0);
      }
      if (seen.add(small)) {
        queue.add(small);
      }
      final Term shorter = shortenSpines(first);
      if (seen.add(shorter)) {
        queue.add(shorter);
      }
      int fuel = 96;
      while (!queue.isEmpty() && fuel-- > 0) {
        final Term t = queue.remove();
        if (onHeadSpine(target, t)) {
          return true;
        }
        reductions(t, new Normalizer(512), 0, u -> {
          if (u.mNodes <= 512 && seen.size() < 384 && seen.add(u)) {
            queue.add(u);
          }
        }, false);
      }
    } catch (final Verdict ex) {
      if (ex != LIMIT) {
        throw ex;
      }
    }
    return false;
  }

  private static Term constReduce(final Term t, final Normalizer worker, final int depth) {
    worker.charge(depth);
    if (t.mKind != APP) {
      return t;
    }
    final Term l = constReduce(t.mLeft, worker, depth + 1);
    if (l.mKind == ABS && !mentions(l.mLeft, 0, worker, depth + 1)) {
      return constReduce(worker.substitute(l.mLeft, t.mRight, 0, depth + 1), worker, depth + 1);
    }
    final Term r = constReduce(t.mRight, worker, depth + 1);
    return l == t.mLeft && r == t.mRight ? t : app(l, r);
  }

  private static boolean entersHead(final Term start, final Term goal, final int limit) {
    try {
      Term t = start;
      for (int i = 0; i < limit && t != null && t.mKind == APP && t.mNodes <= 4096; ++i) {
        final Normalizer worker = new Normalizer(20000);
        t = spine(t, worker, 0);
        if (t == null) {
          return false;
        }
        t = constReduce(t, worker, 0);
        if (onHeadSpine(goal, t)) {
          return true;
        }
      }
    } catch (final Verdict ex) {
      if (ex != LIMIT) {
        throw ex;
      }
    }
    return false;
  }

  private static boolean identity(final Term t) {
    return t.mKind == ABS && t.mLeft.mKind == 0;
  }

  private static boolean identityTree(final Term t) {
    return t.mKind == APP ? identityTree(t.mLeft) && identityTree(t.mRight)
      : t.mKind == 0 || identity(t);
  }

  private static Term squashIdentities(final Term t) {
    if (t.mKind != APP) {
      return t;
    }
    final Term l = squashIdentities(t.mLeft);
    final Term r = squashIdentities(t.mRight);
    if (identity(l)) {
      return r;
    }
    if (l.mKind == ABS && identity(r) && identityTree(l.mLeft)) {
      return r; // Substituting I gives an applicative tree of I only.
    }
    return l == t.mLeft && r == t.mRight ? t : app(l, r);
  }

  private static Term shortenSpines(final Term t) {
    if (t.mKind != APP || t.mNodes > 512) {
      return t;
    }
    final Term l = shortenSpines(t.mLeft);
    final Term r = shortenSpines(t.mRight);
    Term best = l == t.mLeft && r == t.mRight ? t : app(l, r);
    try {
      Term trial = best;
      final Normalizer worker = new Normalizer(512);
      for (int n = 0; n < 12 && trial != null && trial.mKind == APP && trial.mNodes <= 512; ++n) {
        trial = spine(trial, worker, 0);
        if (trial != null && trial.mNodes < best.mNodes) {
          best = trial;
        }
      }
    } catch (final Verdict ex) {
      if (ex != LIMIT) {
        throw ex;
      }
    }
    return best;
  }

  private static boolean mentions(final Term t, final int i, final Normalizer worker, final int height) {
    worker.charge(height);
    return t.mKind >= 0 ? t.mKind == i : t.mKind == ABS
      ? mentions(t.mLeft, i + 1, worker, height + 1)
      : mentions(t.mLeft, i, worker, height + 1) || mentions(t.mRight, i, worker, height + 1);
  }

  private static boolean etaRedex(final Term t, final Normalizer worker, final int height) {
    return t.mKind == ABS && t.mLeft.mKind == APP && t.mLeft.mRight.mKind == 0
      && !mentions(t.mLeft.mLeft, 0, worker, height + 1);
  }

  private static Term etaShrink(final Term t, final Normalizer worker, final int height) {
    worker.charge(height);
    if (t.mKind == ABS) {
      final Term basis = etaShrink(t.mLeft, worker, height + 1);
      final Term u = basis == t.mLeft ? t : new Term(ABS, basis, null);
      return etaRedex(u, worker, height + 1) ? worker.substitute(u.mLeft.mLeft, PAYLOAD, 0, height + 1) : u;
    }
    if (t.mKind == APP) {
      final Term l = etaShrink(t.mLeft, worker, height + 1);
      final Term r = etaShrink(t.mRight, worker, height + 1);
      return l == t.mLeft && r == t.mRight ? t : app(l, r);
    }
    return t;
  }

  private static boolean etaHeadDiverges(final Term original) {
    // Only an infinite head/spine beta trace is allowed here. After an eta
    // contraction, a general beta non-normalization flag is not used.
    try {
      Term t = etaShrink(original, new Normalizer(500), 0);
      if (t == original) {
        return false;
      }
      final Normalizer worker = new Normalizer(1400);
      for (int i = 0; i < 32; ++i) {
        final Term head = worker.weakHead(t, 0, false);
        if (head.mKind != ABS) {
          return false;
        }
        t = head.mLeft;
      }
    } catch (final Verdict v) {
      if (v == CYCLE) {
        return true;
      }
      if (v != LIMIT) {
        throw v;
      }
    }
    return false;
  }

  // Only head-spine contractions are marked strict when using beta-eta.
  // This is a subrelation of the hypernormalizing spine strategy
  // (van Oostrom & Toyama, Example 38). A beta-normal form can always
  // be eta-normalized, so an infinite spine cycle excludes a beta NF.
  private static Term spine(final Term t, final Normalizer worker, final int height) {
    worker.charge(height);
    if (t.mKind == ABS) {
      if (etaRedex(t, worker, height + 1)) {
        return worker.substitute(t.mLeft.mLeft, PAYLOAD, 0, height + 1);
      }
      final Term b = spine(t.mLeft, worker, height + 1);
      return b == null ? null : new Term(ABS, b, null);
    }
    if (t.mKind == APP) {
      if (t.mLeft.mKind == ABS) {
        return worker.substitute(t.mLeft.mLeft, t.mRight, 0, height + 1);
      }
      final Term l = spine(t.mLeft, worker, height + 1);
      return l == null ? null : new Term(APP, l, t.mRight);
    }
    return null;
  }

  private static boolean offer(final Term t, final Set<Term> seen, final Queue<Term> queue, final List<Term> outgoing,
                                final int maxGraph) {
    if (t.mNodes > MAX_PROOF_NODES) {
      return false;
    }
    final Term next = renameFree(t);
    if (!seen.contains(next)) {
      if (seen.size() >= maxGraph) {
        return false;
      }
      seen.add(next);
      queue.add(next);
    }
    outgoing.add(next);
    return true;
  }

  private static BigInteger church(final Term t, final Normalizer worker, final int height) {
    worker.charge(height);
    if (t.mKind == ABS && t.mLeft.mKind == ABS) {
      int n = 0;
      Term body = t.mLeft.mLeft;
      while (body.mKind == APP && body.mLeft.mKind == 1) {
        body = body.mRight;
        ++n;
      }
      return n > 0 && body.mKind == 0 ? BigInteger.valueOf(n) : null;
    }
    if (t.mKind == APP) {
      final BigInteger a = church(t.mLeft, worker, height + 1);
      if (a != null) {
        final BigInteger b = church(t.mRight, worker, height + 1);
        // For positive Church numbers, C_a C_b beta-reduces to C_(b^a).
        if (BigInteger.ONE.equals(b)) {
          return b;
        }
        if (b != null && a.bitLength() <= 12 && (long) b.bitLength() * a.intValueExact() <= 4096) {
          return b.pow(a.intValueExact());
        }
      }
      if (t.mLeft.mKind == ABS) {
        return church(worker.substitute(t.mLeft.mLeft, t.mRight, 0, height + 1), worker, height + 1);
      }
    }
    return null;
  }

  private static BigInteger churchSize(final Term original) {
    Term t = original;
    final Normalizer worker = new Normalizer(1600);
    try {
      for (int i = 0; i < 16 && t != null; ++i) {
        Term body = t;
        for (int extra = 0; ; extra += 2) {
          final BigInteger n = church(body, worker, 0);
          if (n != null) {
            // lambda lambda f^n x: both binders, n applications and
            // n occurrences of index 1 (encoded as 110), then index 0.
            return n.multiply(BigInteger.valueOf(5)).add(BigInteger.valueOf(6L + extra));
          }
          if (body.mKind != ABS) {
            break;
          }
          body = body.mLeft;
        }
        t = leftmost(t, worker, 0);
      }
    } catch (final Verdict v) {
      if (v != LIMIT) {
        throw v;
      }
    }
    return null;
  }

  private static Term renameFree(final Term t) {
    return renameFree(t, 0, new HashMap<>());
  }

  // An injective relabeling of free variables preserves the number of LO
  // steps and the node count of a normal form (not its binary bit length).
  private static Term renameFree(final Term t, final int depth, final Map<Integer, Integer> names) {
    if (t.mKind == HOLE || t.mKind == TOWER || t.mKind == NEUTRAL) {
      return t;
    }
    if (t.mKind >= 0) {
      if (t.mKind < depth) {
        return t;
      }
      final int k = depth + names.computeIfAbsent(t.mKind - depth, ignored -> names.size());
      return k == t.mKind ? t : new Term(k, null, null);
    }
    if (t.mKind == ABS) {
      final Term body = renameFree(t.mLeft, depth + 1, names);
      return body == t.mLeft ? t : new Term(ABS, body, null);
    }
    final Term left = renameFree(t.mLeft, depth, names);
    final Term right = renameFree(t.mRight, depth, names);
    return left == t.mLeft && right == t.mRight ? t : new Term(APP, left, right);
  }

  private static void demandChildren(final Term t, final Consumer<Term> out) {
    if (t.mKind == ABS) {
      out.accept(t.mLeft);
    } else if (t.mKind == APP) {
      Term head = t;
      while (head.mKind == APP) {
        head = head.mLeft;
      }
      if (head.mKind >= 0 || head.mKind == NEUTRAL || head.mKind <= RIGID) {
        for (Term a = t; a.mKind == APP; a = a.mLeft) {
          out.accept(a.mRight);
        }
      }
    }
  }

  private static Term leftmost(final Term t, final Normalizer worker, final int height) {
    worker.charge(height);
    if (t.mKind == HOLE || t.mKind == TOWER || t.mKind == NEUTRAL) {
      // An arbitrary payload could hide the actual leftmost redex or
      // change the outcome of the scan. No progress can be certified.
      throw LIMIT;
    }
    if (t.mKind == ABS) {
      final Term b = leftmost(t.mLeft, worker, height + 1);
      return b == null ? null : new Term(ABS, b, null);
    }
    if (t.mKind == APP) {
      if (t.mLeft.mKind == ABS) {
        return worker.substitute(t.mLeft.mLeft, t.mRight, 0, height + 1);
      }
      final Term l = leftmost(t.mLeft, worker, height + 1);
      if (l != null) {
        return new Term(APP, l, t.mRight);
      }
      final Term r = leftmost(t.mRight, worker, height + 1);
      return r == null ? null : new Term(APP, t.mLeft, r);
    }
    return null;
  }

  // If a reduct can return to itself with at least one leftmost-outermost
  // step, it has no beta normal form: see van Oostrom and Toyama,
  // Normalisation by Random Descent, FSCD 2016, Example 51 (lambda-beta).
  // Each needed child (inside a lambda or an argument to a variable)
  // also strictly decreases (remaining LO steps, normal form node count)
  // lexicographically. Beta reductions do not increase this pair.
  // An arbitrary beta cycle without such an edge is NOT evidence.
  private static boolean reaches(final Term from, final Term to, final Map<Term, List<Term>> edges) {
    return reaches(from, to, edges, false);
  }

  // A beta reduction cannot increase finite weak-head reduction length:
  // contract the same head redex and commute internal contractions to
  // their residuals (which may be copied or erased). A head step itself
  // costs one. Also, evaluation of T U cannot have smaller weak-head
  // cost than T. Thus T ->head S ->beta* T U1 ... Uk is a divergence
  // certificate, including k=0. Only the beta-only graph can use it.
  private static boolean reaches(final Term from, final Term to, final Map<Term, List<Term>> edges,
                                 final boolean onSpine) {
    final Set<Term> seen = new HashSet<>();
    final Queue<Term> pending = new ArrayDeque<>();
    seen.add(from);
    pending.add(from);
    while (!pending.isEmpty()) {
      final Term t = pending.remove();
      if (t.equals(to)) {
        return true;
      }
      if (onSpine && onHeadSpine(to, t)) {
        return true;
      }
      for (final Term u : edges.getOrDefault(t, List.of())) {
        if (seen.add(u)) {
          pending.add(u);
        }
      }
    }
    return false;
  }

  private static boolean onHeadSpine(final Term target, Term t) {
    while (t.mKind == APP && t.mNodes >= target.mNodes) {
      if (t.mNodes == target.mNodes && renameFree(t).equals(target)) {
        return true;
      }
      t = t.mLeft;
    }
    return false;
  }

  private final long[][] population;

  private BinaryLambdaCensus(final int maxSize) {
    population = new long[maxSize + 1][maxSize + 2];
    for (int size = 2; size <= maxSize; ++size) {
      for (int depth = 0; depth < population[size].length; ++depth) {
        long count = depth >= size - 1 ? 1 : 0;
        count = Math.addExact(count, count(size - 2, depth + 1));
        for (int i = 2; i <= size - 4; ++i) {
          count = Math.addExact(count, Math.multiplyExact(count(i, depth), count(size - i - 2, depth)));
        }
        population[size][depth] = count;
      }
    }
  }

  private long count(final int size, final int depth) {
    return population[size][Math.min(depth, population[size].length - 1)];
  }

  private void terms(final int size, final int depth, final Consumer<Term> out) {
    if (count(size, depth) == 0) {
      return;
    }
    if (depth >= size - 1) {
      out.accept(new Term(size - 2, null, null));
    }
    terms(size - 2, depth + 1, b -> out.accept(new Term(ABS, b, null)));
    for (int i = 2; i <= size - 4; ++i) {
      final int remainder = size - i - 2;
      if (count(remainder, depth) != 0) {
        terms(i, depth, l -> terms(remainder, depth, r -> out.accept(new Term(APP, l, r))));
      }
    }
  }

  private static final class Verdict extends RuntimeException {
    Verdict() {
      super(null, null, false, false);
    }
  }

  private static final Verdict LIMIT = new Verdict();
  private static final Verdict CYCLE = new Verdict();
  private static final Verdict NEED_BIT = new Verdict();
  private static final Verdict RETURNS_TAIL = new Verdict();

  private static final class Normalizer {
    private final Set<Term> mWeak = new HashSet<>();
    private final Set<Term> mFull = new HashSet<>();
    private final Map<Term, Long> mNormalSizes;
    private final Map<Term, Term> mHeads;
    private final Map<Term, Term> mAppliedHeads;
    private final Map<MemoKey, Term> mShifts;
    private final Map<MemoKey, Term> mReplacements;
    private int mFuel;

    private static final class MemoKey {
      private final Term mFirst;
      private final Term mSecond;
      private final int mA;
      private final int mB;

      private MemoKey(final Term first, final Term second, final int a, final int b) {
        mFirst = first;
        mSecond = second;
        mA = a;
        mB = b;
      }

      @Override
      public int hashCode() {
        return 31 * (31 * (31 * System.identityHashCode(mFirst) + System.identityHashCode(mSecond)) + mA) + mB;
      }

      @Override
      public boolean equals(final Object obj) {
        if (!(obj instanceof MemoKey)) {
          return false;
        }
        final MemoKey key = (MemoKey) obj;
        return mFirst == key.mFirst && mSecond == key.mSecond && mA == key.mA && mB == key.mB;
      }
    }

    Normalizer(final int budget) {
      this(budget, false);
    }

    Normalizer(final int budget, final boolean memoize) {
      mFuel = budget;
      mNormalSizes = memoize ? new HashMap<>() : null;
      mHeads = memoize ? new HashMap<>() : null;
      mAppliedHeads = memoize ? new HashMap<>() : null;
      mShifts = memoize ? new HashMap<>() : null;
      mReplacements = memoize ? new HashMap<>() : null;
    }

    private void charge(final int height) {
      if (--mFuel < 0 || height > (mNormalSizes == null ? MAX_DEPTH : 1536)) {
        throw LIMIT;
      }
    }

    private Term shift(final Term t, final int by, final int cut, final int height) {
      charge(height);
      if (by == 0) {
        return t;
      }
      if (mShifts == null) {
        return shiftDirect(t, by, cut, height);
      }
      final MemoKey key = new MemoKey(t, null, by, cut);
      final Term old = mShifts.get(key);
      if (old != null) {
        return old;
      }
      final Term result = shiftDirect(t, by, cut, height);
      mShifts.put(key, result);
      return result;
    }

    private Term shiftDirect(final Term t, final int by, final int cut, final int height) {
      if (t.mKind == HOLE || t.mKind == TAIL || t.mKind == TOWER || t.mKind == NEUTRAL || t.mKind <= RIGID) {
        return t;
      }
      if (t.mKind >= 0) {
        return t.mKind < cut ? t : new Term(t.mKind + by, null, null);
      }
      if (t.mKind == ABS) {
        return new Term(ABS, shift(t.mLeft, by, cut + 1, height + 1), null);
      }
      return new Term(APP, shift(t.mLeft, by, cut, height + 1), shift(t.mRight, by, cut, height + 1));
    }

    private Term substitute(final Term t, final Term argument, final int depth, final int height) {
      charge(height);
      if (mReplacements == null) {
        return substituteDirect(t, argument, depth, height);
      }
      final MemoKey key = new MemoKey(t, argument, depth, 0);
      final Term old = mReplacements.get(key);
      if (old != null) {
        return old;
      }
      final Term result = substituteDirect(t, argument, depth, height);
      mReplacements.put(key, result);
      return result;
    }

    private Term substituteDirect(final Term t, final Term argument, final int depth, final int height) {
      if (t.mKind == HOLE || t.mKind == TAIL || t.mKind == TOWER || t.mKind == NEUTRAL || t.mKind <= RIGID) {
        return t;
      }
      if (t.mKind >= 0) {
        if (t.mKind == depth) {
          return depth == 0 ? argument : shift(argument, depth, 0, height + 1);
        }
        return t.mKind < depth ? t : new Term(t.mKind - 1, null, null);
      }
      if (t.mKind == ABS) {
        return new Term(ABS, substitute(t.mLeft, argument, depth + 1, height + 1), null);
      }
      return new Term(APP, substitute(t.mLeft, argument, depth, height + 1),
        substitute(t.mRight, argument, depth, height + 1));
    }

    private Term weakHead(final Term t, final int height, final boolean applied) {
      charge(height);
      if (mHeads == null || t.mKind != APP) {
        return weakHeadDirect(t, height, applied);
      }
      final Map<Term, Term> mem = applied ? mAppliedHeads : mHeads;
      final Term old = mem.get(t);
      if (old != null) {
        return old;
      }
      final Term result = weakHeadDirect(t, height, applied);
      mem.put(t, result);
      return result;
    }

    private Term weakHeadDirect(final Term t, final int height, final boolean applied) {
      if (t.mKind == TAIL) {
        throw applied ? NEED_BIT : RETURNS_TAIL;
      }
      if (t.mKind == HOLE) {
        throw LIMIT;
      }
      if (t.mKind != APP) {
        return t;
      }
      if (!mWeak.add(t)) {
        throw CYCLE;
      }
      try {
        final Term function = weakHead(t.mLeft, height + 1, true);
        if (function.mKind == ABS) {
          return weakHead(substitute(function.mLeft, t.mRight, 0, height + 1), height + 1, applied);
        }
        return function == t.mLeft ? t : new Term(APP, function, t.mRight);
      } finally {
        mWeak.remove(t);
      }
    }

    private long normalSize(final Term t, final int height) {
      charge(height);
      if (NO_NORMAL_FORM.contains(t) || t.mKind == APP && hasSpineLoop(t)) {
        throw CYCLE;
      }
      if (mNormalSizes != null) {
        final Long cached = mNormalSizes.get(t);
        if (cached != null) {
          return cached;
        }
      }
      if (!mFull.add(t)) {
        throw CYCLE;
      }
      try {
        final long size = countNormal(t, height);
        if (mNormalSizes != null) {
          mNormalSizes.put(t, size);
        }
        return size;
      } finally {
        mFull.remove(t);
      }
    }

    private long countNormal(final Term t, final int height) {
      final Term hnf = weakHead(t, height + 1, false);
      if (hnf.mKind == ABS) {
        return Math.addExact(2, normalSize(hnf.mLeft, height + 1));
      }
      long size = 0;
      Term head = hnf;
      while (head.mKind == APP) {
        charge(height);
        size = Math.addExact(size, Math.addExact(2, normalSize(head.mRight, height + 1)));
        head = head.mLeft;
      }
      return Math.addExact(size, head.mKind + 2L);
    }
  }

  private static final class Program {
    final Term mPrefix;
    final long mData;
    final int mBits;
    final boolean mMinimal;

    Program(final Term prefix, final long data, final int bits, final boolean minimal) {
      mPrefix = prefix;
      mData = data;
      mBits = bits;
      mMinimal = minimal;
    }

    Term apply(final Term tail) {
      Term input = tail;
      for (int b = 0; b < mBits; ++b) {
        final int bit = (int) ((mData >>> b) & 1);
        final Term value = new Term(ABS, new Term(ABS, new Term(1 - bit, null, null), null), null);
        input = new Term(ABS, new Term(APP, new Term(APP, new Term(0, null, null), value), input), null);
      }
      return new Term(APP, mPrefix, input);
    }
  }

  // Extend a prefix only when the normalizer demands another bit, or
  // when the verifier leaves it undecided. A tail inside a necessary
  // output position cannot become finite by appending more input cells.
  /** Enumerate self-delimiting BLC programs in order of encoded size. */
  public static final class InputSearch {
    private final int mLast;
    private final int mBudget;
    private final boolean mShowUnknown;
    private final BinaryLambdaCensus mCensus;
    private List<Program> mExtensions = List.of();
    private int mSize;

    /** Construct a search for the published sizes 1 through 32. */
    public InputSearch() {
      this(32, 30000, false);
    }

    private InputSearch(final int last, final int budget, final boolean showUnknown) {
      if (last < 1 || last > 32 || budget < 1) {
        throw new IllegalArgumentException("Invalid input census bound");
      }
      mLast = last;
      mBudget = budget;
      mShowUnknown = showUnknown;
      mCensus = new BinaryLambdaCensus(last);
    }

    private long[] advance() {
      if (mSize == mLast) {
        throw new UnsupportedOperationException("Only the published BLC input sizes are supported");
      }
      final int n = ++mSize;
      final List<Program> next = new ArrayList<>();
      final long[] totals = new long[5];
      final boolean extend = n < mLast;
      final Consumer<Program> eval = p -> {
        ++totals[0];
        try {
          final long size = new Normalizer(mBudget).normalSize(p.apply(INPUT_TAIL), 0);
          if (p.mMinimal) {
            ++totals[1];
            totals[4] = Math.max(totals[4], size);
          } else {
            ++totals[3];
            if (mShowUnknown) {
              printInputHoldout(p, "shorter prefix not decided", size);
            }
          }
        } catch (final Verdict v) {
          if (v == NEED_BIT || v == LIMIT) {
            final boolean proven = v == NEED_BIT;
            if (!proven) {
              try {
                proveDivergence(p.apply(PAYLOAD), false);
              } catch (final Verdict proof) {
                if (proof == CYCLE) {
                  return;
                }
                throw proof;
              }
            }
            ++totals[proven ? 2 : 3];
            if (!proven && mShowUnknown) {
              printInputHoldout(p, "normalization undecided", -1);
            }
            if (next.size() >= 2500000) {
              throw new IllegalStateException("input frontier limit: no exact count");
            }
            if (extend) {
              next.add(new Program(p.mPrefix, p.mData << 1, p.mBits + 1, p.mMinimal && proven));
              next.add(new Program(p.mPrefix, (p.mData << 1) | 1, p.mBits + 1, p.mMinimal && proven));
            }
          } else if (v != CYCLE && v != RETURNS_TAIL) {
            throw v;
          }
        }
      };
      mCensus.terms(n, 0, t -> eval.accept(new Program(t, 0, 0, true)));
      mExtensions.forEach(eval);
      mExtensions = next;
      return totals;
    }

    /**
     * Compute the next exact maximum, rejecting any undecided program.
     * @return maximum normal-form bit length at the next input size
     */
    public long nextMaximum() {
      synchronized (BinaryLambdaCensus.class) {
        final long[] totals = advance();
        if (totals[3] != 0) {
          throw new IllegalStateException(totals[3] + " unresolved programs at size " + mSize);
        }
        return totals[4];
      }
    }
  }

  private static void inputBusyBeaver(final int last, final int budget, final boolean strict, final boolean showUnknown) {
    final InputSearch search = new InputSearch(last, budget, showUnknown);
    System.out.println("size candidates normalized need-bit unknown max");
    for (int n = 1; n <= last; ++n) {
      final long[] totals = search.advance();
      System.out.printf("%d %d %d %d %d %d%n", n, totals[0], totals[1], totals[2], totals[3], totals[4]);
      if (strict && totals[3] != 0) {
        throw new IllegalStateException("Incomplete input census at " + n);
      }
    }
  }

  private static void printInputHoldout(final Program p, final String reason, final long size) {
    final StringBuilder code = new StringBuilder();
    binary(p.mPrefix, code);
    final int prefixSize = code.length();
    for (int j = p.mBits - 1; j >= 0; --j) {
      code.append((p.mData >>> j) & 1);
    }
    System.out.printf("UNKNOWN %d %d %s %s %d%n", code.length(), prefixSize, code, reason, size);
  }

  private static boolean normal(final Term t) {
    if (t.mKind == ABS) {
      return normal(t.mLeft);
    }
    return t.mKind != APP || t.mLeft.mKind != ABS && normal(t.mLeft) && normal(t.mRight);
  }

  private static void binary(final Term t, final StringBuilder b) {
    if (t.mKind >= 0) {
      b.append("1".repeat(t.mKind + 1)).append('0');
    } else {
      b.append(t.mKind == ABS ? "00" : "01");
      binary(t.mLeft, b);
      if (t.mKind == APP) {
        binary(t.mRight, b);
      }
    }
  }

  private static final class Row {
    long mTotal;
    long mInNormalForm;
    long mNormalized;
    long mDiverged;
    long mUnknown;
    BigInteger mMax = BigInteger.ZERO;
    final int mBudget;
    final boolean mShowUnknown;

    Row(final int budget, final boolean showUnknown) {
      mBudget = budget;
      mShowUnknown = showUnknown;
    }

    void accept(final Term t) {
      ++mTotal;
      if (normal(t)) {
        ++mInNormalForm;
      }
      boolean attemptedProof = false;
      try {
        final long size;
        try {
          size = new Normalizer(mBudget).normalSize(t, 0);
        } catch (final Verdict v) {
          if (v != LIMIT) {
            throw v;
          }
          final BigInteger symbolicSize = churchSize(t);
          if (symbolicSize != null) {
            recordNormalized(symbolicSize);
            return;
          }
          attemptedProof = true;
          proveDivergence(t);
          recordNormalized(BigInteger.valueOf(new Normalizer(150000, true).normalSize(t, 0)));
          return;
        }
        recordNormalized(BigInteger.valueOf(size));
      } catch (final Verdict v) {
        if (v == CYCLE) {
          ++mDiverged;
          if (attemptedProof && NO_NORMAL_FORM.size() < 8192) {
            NO_NORMAL_FORM.add(t);
          }
        } else if (v == LIMIT) {
          markUnknown(t);
        } else {
          throw v;
        }
      } catch (final ArithmeticException | StackOverflowError e) {
        markUnknown(t);
      }
    }

    void recordNormalized(final BigInteger size) {
      mMax = mMax.max(size);
      ++mNormalized;
    }

    void markUnknown(final Term t) {
      ++mUnknown;
      if (mShowUnknown) {
        final StringBuilder b = new StringBuilder();
        binary(t, b);
        System.out.println("UNKNOWN " + b);
      }
    }
  }

  private static Row closedRow(final int size) {
    if (size < 1 || size > 36) {
      throw new UnsupportedOperationException("Only the published 1-36 bit range is supported");
    }
    final BinaryLambdaCensus census = new BinaryLambdaCensus(size);
    final Row row = new Row(30000, false);
    census.terms(size, 0, row::accept);
    if (row.mTotal != census.count(size, 0) || row.mNormalized + row.mDiverged + row.mUnknown != row.mTotal) {
      throw new IllegalStateException("Incomplete closed-term enumeration");
    }
    if (row.mUnknown != 0) {
      throw new IllegalStateException("Only " + row.mNormalized + " normalizing terms and " + row.mUnknown + " unresolved");
    }
    return row;
  }

  /**
   * Find the maximum normal-form size by classifying every closed term.
   * @param size binary program size
   * @return the verified maximum
   */
  public static synchronized Z maximum(final int size) {
    return new Z(closedRow(size).mMax.toString());
  }

  /**
   * Count closed terms which have a normal form, classifying every term.
   * @param size binary program size
   * @return the verified normalizer count
   */
  public static synchronized long normalizingCount(final int size) {
    return closedRow(size).mNormalized;
  }

  private static Term parse(final String bits, final int[] index) {
    final int k = index[0];
    if (bits.charAt(k) == '0') {
      index[0] += 2;
      return bits.charAt(k + 1) == '0' ? abs(parse(bits, index)) : app(parse(bits, index), parse(bits, index));
    }
    while (bits.charAt(index[0]) == '1') {
      ++index[0];
    }
    final int variable = index[0] - k - 1;
    ++index[0];
    return new Term(variable, null, null);
  }

  /**
   * Run the opt-in binary lambda verification.
   * @param args census options and bounds
   */
  public static void main(final String[] args) {
    if ("--maximum".equals(args[0])) {
      if (args.length != 2) {
        throw new IllegalArgumentException("Usage: --maximum size (no supplied counts)");
      }
      final int size = Integer.parseInt(args[1]);
      final Row row = closedRow(size);
      System.out.printf("size=%d terms=%d normalizing=%d diverging=%d unresolved=%d maximum=%s%n",
        size, row.mTotal, row.mNormalized, row.mDiverged, row.mUnknown, row.mMax);
      return;
    }
    if ("--term".equals(args[0])) {
      if (!args[1].matches("[01]+")) {
        throw new IllegalArgumentException("Invalid binary term");
      }
      final int[] index = {0};
      final Term term = parse(args[1], index);
      if (index[0] != args[1].length() || !closed(term, 0)) {
        throw new IllegalArgumentException("Not a closed binary term");
      }
      try {
        System.out.println(new Normalizer(Integer.parseInt(args[2]), true).normalSize(term, 0));
      } catch (final Verdict v) {
        System.out.println(v == CYCLE ? "proved divergence" : "unresolved");
      }
      return;
    }
    if ("--bb2".equals(args[0]) || "--strict-bb2".equals(args[0])) {
      inputBusyBeaver(Integer.parseInt(args[1]), Integer.parseInt(args[2]), "--strict-bb2".equals(args[0]), args.length > 3);
      return;
    }
    final int first = Integer.parseInt(args[0]);
    final int last = Integer.parseInt(args[1]);
    final int budget = Integer.parseInt(args[2]);
    final BinaryLambdaCensus census = new BinaryLambdaCensus(last);
    System.out.println("size total normal normalized diverged unknown max");
    for (int n = first; n <= last; ++n) {
      final Row row = new Row(budget, args.length > 3);
      census.terms(n, 0, row::accept);
      if (row.mTotal != census.count(n, 0) || row.mNormalized + row.mDiverged + row.mUnknown != row.mTotal) {
        throw new IllegalStateException("incomplete enumeration at size " + n);
      }
      System.out.printf("%d %d %d %d %d %d %d%n", n, row.mTotal, row.mInNormalForm, row.mNormalized,
        row.mDiverged, row.mUnknown, row.mMax);
    }
  }
}
