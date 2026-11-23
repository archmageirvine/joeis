package irvine.math.turing;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Checked compressed translated-cycle replay for Skelet #1, following BusyCoq/Skelet1.v.
 * @author Gregory Morse
 */
final class SkeletOne {

  private SkeletOne() {
  }

  private static final int[] RULES = {7, 15, 10, 9, 3, 14, 17, 4, -1, 11};
  private static final int X = 1, D = 2, P = 3, C0 = 4, C1 = 5, C2 = 6, C = 7;
  private static final int F0 = 8, F1 = 9, F2 = 10, F3 = 11, G0 = 12, G1 = 13, G2 = 14;
  private static final int FS = 15, GS = 16, HS = 17, LEFT = 18, RIGHT = 19;
  private static final BigInteger ZERO = BigInteger.ZERO, ONE = BigInteger.ONE;
  private static final BigInteger DECREASE = BigInteger.valueOf(53946), STRIDES = BigInteger.valueOf(215779);
  private static final String[] BLOCK = {"", "22", "21", "2", "232", "201", "42", "11",
    "432", "401", "62", "31", "2332", "2301", "252"};

  private static final class Tape {
    private final int mTag;
    private final BigInteger mCount;
    private final boolean mVariable;
    private final Tape mTail;
    // Exact bound with no X prefix supplied externally; null means no C
    // and a terminal P, hence every stride leaves this whole suffix alone.
    private final BigInteger mCapacity;

    Tape(final int tag, final BigInteger count, final boolean variable, final Tape tail) {
      this.mTag = tag;
      this.mCount = count;
      this.mVariable = variable;
      this.mTail = tail;
      switch (tag) {
        case P:
          mCapacity = tail == null ? null : ZERO;
          break;
        case D: case GS:
          mCapacity = bound(tail);
          break;
        case X:
          if (tag(tail) == C) {
            final BigInteger after = bound(tail.mTail);
            mCapacity = after == null ? count : count.min(after.shiftRight(2));
          } else {
            mCapacity = bound(tail);
          }
          break;
        default:
          mCapacity = ZERO;
          break;
      }
    }
  }

  private static final class Config {
    private final boolean mRight;
    private final Tape mL;
    private final Tape mR;

    Config(final boolean right, final Tape l, final Tape r) {
      this.mRight = right;
      this.mL = l;
      this.mR = r;
    }
  }

  private static int tag(final Tape t) {
    return t == null ? 0 : t.mTag;
  }

  private static BigInteger bound(final Tape t) {
    return t == null ? ZERO : t.mCapacity;
  }

  private static Tape put(final int tag, final Tape tail) {
    return new Tape(tag, ONE, false, tail);
  }

  private static Tape push(final int tag, BigInteger n, boolean variable, Tape tail) {
    if (n.signum() == 0 && !variable) {
      return tail;
    }
    if (tag(tail) == tag) {
      if (variable && tail.mVariable) {
        throw new IllegalStateException("Two copies of the affine counter");
      }
      n = n.add(tail.mCount);
      variable |= tail.mVariable;
      tail = tail.mTail;
    }
    if (n.signum() <= 0) {
      throw new IllegalStateException("Ambiguous counter at its zero boundary");
    }
    return new Tape(tag, n, variable, tail);
  }

  private static Tape xs(final long n, final Tape tail) {
    return push(X, BigInteger.valueOf(n), false, tail);
  }

  private static Tape dec(final Tape run) {
    return push(run.mTag, run.mCount.subtract(ONE), run.mVariable, run.mTail);
  }

  private static Tape form(final Tape tail, final int... codes) {
    Tape t = tail;
    for (int i = codes.length - 1; i >= 0; --i) {
      t = codes[i] < 0 ? xs(-codes[i], t) : put(codes[i], t);
    }
    return t;
  }

  private static final int[] F = {-10344, D, -7640, C2};
  private static final int[] G = {-300, D, -30826, D, -72142, D, -3076, D, -1538, D};
  private static final int[] H = {-1537, D, C1, -3075, D, C1, -72141, D, C1, -30825, D, C1, -299, D, C1};
  private static final int[] J = {D, C2, -95, C0, -7713, D, D, -1866, C1, -13231, D, -6197, C,
    -11066, D, -7279, C0, -10524, D, -7550, C2, -10389, D, -7618, C1,
    -10355, D, -7635, C, -10347, D, -7639, C, -10345, D, -7640, C1};
  private static final Tape K = form(null, -7639, D, -10347, C, -7635, D, -10355, C, -7619, D, -10387, C,
    -7555, D, -10515, C, -7299, D, -11027, C, -6275, D, -13075, C, -2179, D, D, -7088, C, -1, C, -3849, P);
  private static final Tape ONLY_P = put(P, null);
  private static final Tape CYCLE_LEFT = put(LEFT, null);
  private static final Tape J_TEMPLATE = form(null, J);

  private static Tape dropX(final Tape tape) {
    if (tag(tape) == X) {
      return dec(tape);
    }
    return form(dec(tape), -299, D, -30826, D, -72142, D, -3076, D, -1538, D);
  }

  private static boolean hasX(final Tape tape) {
    return tag(tape) == X || tag(tape) == GS;
  }

  private static Config simple(final Config c) {
    final Tape l = c.mL, r = c.mR;
    if (c.mRight) {
      switch (tag(r)) {
        case 0:
          if (tag(l) == X) {
            return new Config(false, dec(l), form(null, C, -1, P));
          }
          return tag(l) == D ? new Config(false, l.mTail, xs(1, null)) : null;
        case X: return new Config(true, push(X, r.mCount, r.mVariable, l), r.mTail);
        case D: return new Config(true, put(D, l), r.mTail);
        case GS: return new Config(true, push(GS, r.mCount, false, l), r.mTail);
        case C:
          switch (tag(l)) {
            case X: return new Config(true, put(C0, dec(l)), r.mTail);
            case D: return new Config(true, xs(1, put(P, l.mTail)), r.mTail);
            case C0: return new Config(true, put(G0, l.mTail), r.mTail);
            case C2: return new Config(true, put(F0, l.mTail), r.mTail);
            default: return null;
          }
        case P:
          final Tape s = r.mTail;
          switch (tag(s)) {
            case 0: return new Config(false, l, r);
            case X: return new Config(true, push(X, s.mCount, s.mVariable, l), put(P, s.mTail));
            case C: return hasX(s.mTail) ? new Config(false, l, form(dropX(s.mTail), P, D, P)) : null;
            case P: return new Config(true, xs(1, l), s.mTail);
            case D:
              final Tape t = s.mTail;
              switch (tag(t)) {
                case X: return new Config(true, form(l, D, C1), put(P, dec(t)));
                case D: return hasX(t.mTail) ? new Config(true, form(l, D, C1, C2), dropX(t.mTail)) : null;
                case C: return hasX(t.mTail) ? new Config(true, form(l, D, G1), put(P, dropX(t.mTail))) : null;
                case P: return new Config(true, form(l, D, C1), t.mTail);
                case GS: return new Config(true, push(HS, t.mCount, false, l), form(t.mTail, P, D));
                default: return null;
              }
            default: return null;
          }
        default: return null;
      }
    }
    switch (tag(l)) {
      case 0:
        return tag(r) == C && hasX(r.mTail) ? new Config(true, form(null, D, C1), put(P, dropX(r.mTail))) : null;
      case X: return new Config(false, l.mTail, push(X, l.mCount, l.mVariable, r));
      case D: case P: case C: return new Config(false, l.mTail, put(l.mTag, r));
      case C0: return new Config(true, xs(1, put(C1, l.mTail)), r);
      case C1: return new Config(true, put(C2, l.mTail), r);
      case C2: return new Config(true, xs(1, put(C, l.mTail)), r);
      case F0: return new Config(true, xs(1, put(F1, l.mTail)), r);
      case F1: return new Config(true, put(F2, l.mTail), r);
      case F2: return new Config(true, xs(1, put(F3, l.mTail)), r);
      case F3: return tag(l.mTail) == X ? new Config(true, form(dec(l.mTail), D, C1, P), r) : null;
      case G0: return new Config(true, xs(1, put(G1, l.mTail)), r);
      case G1: return new Config(true, put(G2, l.mTail), r);
      case G2: return new Config(true, form(l.mTail, -1, D, P), r);
      case GS: return new Config(false, l.mTail, push(GS, l.mCount, false, r));
      default: return null;
    }
  }

  private static final class CannotStride extends RuntimeException {
    CannotStride() {
      super(null, null, false, false);
    }
  }

  private static final CannotStride NO_STRIDE = new CannotStride();

  private static Tape stride(final Tape r, final BigInteger n, BigInteger xs, boolean variable, final int depth) {
    if (depth > 1536) {
      throw NO_STRIDE;
    }
    if (bound(r) == null) {
      return push(X, xs, variable, r);
    }
    Tape t = r;
    if (tag(t) == X) {
      xs = xs.add(t.mCount);
      if (variable && t.mVariable) {
        throw new IllegalStateException("Two copies of the stride variable");
      }
      variable |= t.mVariable;
      t = t.mTail;
    }
    switch (tag(t)) {
      case P:
        if (t.mTail == null) {
          return push(X, xs, variable, ONLY_P);
        }
        break;
      case D: case GS:
        final Tape tail = stride(t.mTail, n, ZERO, false, depth + 1);
        return push(X, xs, variable, t.mTag == D ? put(D, tail) : push(GS, t.mCount, false, tail));
      case C:
        if (xs.compareTo(n) >= (variable ? 1 : 0)) {
          return push(X, xs.subtract(n), variable,
            put(C, push(X, n.shiftLeft(1), false, stride(t.mTail, n.shiftLeft(2), ZERO, false, depth + 1))));
        }
        break;
      case RIGHT:
        final BigInteger used = t.mCount.add(n);
        if (used.compareTo(STRIDES) < 0) {
          return push(X, xs, variable, new Tape(RIGHT, used, false, null));
        }
        break;
      default:
        break;
    }
    throw NO_STRIDE;
  }

  private static boolean equalTape(Tape a, Tape b) {
    while (a != b) {
      if (a == null || b == null || a.mTag != b.mTag || a.mVariable != b.mVariable || !a.mCount.equals(b.mCount)) {
        return false;
      }
      a = a.mTail;
      b = b.mTail;
    }
    return true;
  }

  private static boolean equalConf(final Config a, final Config b) {
    return a != null && a.mRight == b.mRight && equalTape(a.mL, b.mL) && equalTape(a.mR, b.mR);
  }

  private static Config unit(final Config c, final boolean symbolic) {
    final BigInteger capacity = bound(c.mR);
    if (c.mRight && (symbolic || capacity == null || capacity.signum() > 0)) {
      try {
        return new Config(false, c.mL, stride(c.mR, ONE, ZERO, false, 0));
      } catch (final CannotStride ignored) {
        // The guarded stride does not apply; try a proved local transition.
      }
    }
    return simple(c);
  }

  private static Config full(final Config c) {
    if (c.mRight && tag(c.mL) == D && tag(c.mL.mTail) == C1 && tag(c.mL.mTail.mTail) == X) {
      final Tape counter = c.mL.mTail.mTail;
      if (!counter.mVariable && counter.mCount.compareTo(DECREASE) > 0) {
        Tape endpoint = counter.mTail, suffix = J_TEMPLATE;
        while (suffix != null && endpoint != null && suffix.mTag == endpoint.mTag && suffix.mCount.equals(endpoint.mCount)) {
          endpoint = endpoint.mTail;
          suffix = suffix.mTail;
        }
        if (suffix == null) {
          BigInteger k = counter.mCount.subtract(ONE).divide(DECREASE);
          final BigInteger max = bound(c.mR);
          if (max != null) {
            k = k.min(max.divide(STRIDES));
          }
          if (k.signum() > 0) {
            try {
              final Tape tail = stride(c.mR, k.multiply(STRIDES), ZERO, false, 0);
              final Tape left = form(push(FS, k, false, endpoint), J);
              return new Config(true, form(push(X, counter.mCount.subtract(k.multiply(DECREASE)), false, left), D, C1),
                push(GS, k, false, tail));
            } catch (final CannotStride ignored) {
              // A failed acceleration never classifies a machine.
            }
          }
        }
      }
    }
    return unit(c, false);
  }

  private static Tape opaque(final BigInteger spent) {
    return new Tape(RIGHT, spent, false, null);
  }

  private static boolean proveUniCycle() {
    final Config goal = new Config(true, form(push(X, ONE, true, form(form(CYCLE_LEFT, F), J)), D, C1), form(opaque(STRIDES), G));
    Config c = new Config(true, form(push(X, DECREASE.add(ONE), true, form(CYCLE_LEFT, J)), D, C1), opaque(ZERO));
    for (int i = 0; i < 8192 && c != null; ++i) {
      if (c.mRight && tag(c.mR) == RIGHT && c.mR.mCount.compareTo(STRIDES) < 0) {
        Config after = new Config(false, c.mL, opaque(STRIDES));
        for (int j = 0; j < 8192 && after != null; ++j, after = simple(after)) {
          if (equalConf(after, goal)) {
            return true;
          }
        }
      }
      c = unit(c, true);
    }
    return false;
  }

  private static boolean proveFinalCycle() {
    Config c = new Config(true, put(C0, CYCLE_LEFT), K);
    final Config goal = new Config(true, put(C0, form(CYCLE_LEFT, F)), K);
    for (int i = 0; i < 2048 && c != null; ++i) {
      c = full(c);
      if (equalConf(c, goal)) {
        return true;
      }
    }
    return false;
  }

  static boolean closes(final int[] rules) {
    if (!Arrays.equals(rules, RULES)) {
      return false;
    }
    try {
      if (!localRewrites()) {
        System.out.println("INCONCLUSIVE Skelet #1 local proof");
        return false;
      }
      if (!proveUniCycle()) {
        System.out.println("INCONCLUSIVE Skelet #1 parametric cycle");
        return false;
      }
      if (!proveFinalCycle()) {
        System.out.println("INCONCLUSIVE Skelet #1 final translated cycle");
        return false;
      }
      Config c = new Config(true, put(C1, null), ONLY_P);
      final long start = System.nanoTime();
      for (int i = 0; i < 88_000_000 && c != null; ++i) {
        if (i != 0 && i % 5_000_000 == 0) {
          System.out.printf(java.util.Locale.ROOT, "Skelet #1: %,d compressed steps in %.2f s%n", i, (System.nanoTime() - start) / 1e9);
        }
        if (c.mRight && tag(c.mL) == C0 && equalTape(c.mR, K)) {
          System.out.printf(java.util.Locale.ROOT, "Skelet #1: translated cycle after %,d checked compressed steps in %.3f s%n",
            i, (System.nanoTime() - start) / 1e9);
          return true;
        }
        c = full(c);
      }
    } catch (final IllegalStateException ex) {
      System.out.println("INCONCLUSIVE Skelet #1: " + ex.getMessage());
    }
    return false;
  }

  static boolean recheck() {
    return closes(RULES);
  }

  private static boolean localRewrites() {
    final Tape u = CYCLE_LEFT, v = opaque(ZERO);
    final Config[] check = {
      new Config(true, xs(1, u), null), new Config(true, put(D, u), null),
      new Config(true, u, xs(1, v)), new Config(true, u, put(D, v)),
      new Config(true, xs(1, u), put(C, v)), new Config(true, put(D, u), put(C, v)),
      new Config(true, put(C0, u), put(C, v)), new Config(true, put(C2, u), put(C, v)),
      new Config(true, u, ONLY_P), new Config(true, u, form(v, P, -1)),
      new Config(true, u, form(v, P, C, -1)), new Config(true, u, form(v, P, P)),
      new Config(true, u, form(v, P, D, -1)), new Config(true, u, form(v, P, D, D, -1)),
      new Config(true, u, form(v, P, D, C, -1)), new Config(true, u, form(v, P, D, P)),
      new Config(false, null, form(v, C, -1)), new Config(false, xs(1, u), v),
      new Config(false, put(D, u), v), new Config(false, put(P, u), v),
      new Config(false, put(C, u), v), new Config(false, put(C0, u), v),
      new Config(false, put(C1, u), v), new Config(false, put(C2, u), v),
      new Config(false, put(F0, u), v), new Config(false, put(F1, u), v),
      new Config(false, put(F2, u), v), new Config(false, form(u, F3, -1), v),
      new Config(false, put(G0, u), v), new Config(false, put(G1, u), v),
      new Config(false, put(G2, u), v),
    };
    for (int i = 0; i < check.length; ++i) {
      final Config before = check[i], after = simple(before);
      if (after == null || !ShiftOverflow.rawPath(RULES, position(before), position(after))) {
        System.out.println("Skelet #1 primitive rewrite " + i + " failed");
        return false;
      }
    }
    final int[] gLeft = G.clone();
    for (int i = 0; i < G.length / 2; ++i) {
      gLeft[i] = G[G.length - 1 - i];
      gLeft[G.length - 1 - i] = G[i];
    }
    final Tape gl = form(u, gLeft), gr = form(v, G);
    if (!stepsTo(new Config(true, u, gr), new Config(true, gl, v))
      || !stepsTo(new Config(false, gl, v), new Config(false, u, gr))
      || !stepsTo(new Config(true, u, form(gr, P, D)), new Config(true, form(u, H), form(v, P, D)))) {
      System.out.println("Skelet #1 packed block rewrite failed");
      return false;
    }
    return ShiftOverflow.rawPath(RULES, new ShiftOverflow.Position(0, true, "!", "!"),
      new ShiftOverflow.Position(0, true, bits(put(C1, null), true), bits(ONLY_P, false)));
  }

  private static ShiftOverflow.Position position(final Config c) {
    return new ShiftOverflow.Position(c.mRight ? 0 : 2, c.mRight, bits(c.mL, true),
      (c.mRight ? "" : "10") + bits(c.mR, false));
  }

  private static boolean stepsTo(Config c, final Config goal) {
    for (int i = 0; i < 64 && c != null; ++i) {
      c = simple(c);
      if (equalConf(c, goal)) {
        return true;
      }
    }
    return false;
  }

  private static String bits(Tape tape, final boolean left) {
    final StringBuilder out = new StringBuilder();
    for (; tape != null; tape = tape.mTail) {
      if (tape.mTag == LEFT || tape.mTag == RIGHT) {
        return out.append(tape.mTag == LEFT ? "U" : "V").toString();
      }
      final String code = left ? new StringBuilder(BLOCK[tape.mTag]).reverse().toString() : BLOCK[tape.mTag];
      for (int r = 0; r < tape.mCount.intValueExact(); ++r) {
        for (int i = 0; i < code.length(); ++i) {
          out.append("1".repeat(code.charAt(i) - '0')).append('0');
        }
      }
    }
    return out.append('!').toString();
  }

  // Correctness of stride: for one pass, X, D and GS can be moved to
  // the left, the suffix processed, and those same words moved back.
  // The terminal P turns the head. At X^a C with a>=1, the primitive
  // rule changes X C into C0; the four recursive turns in order are
  // processed with C01, C12, C23 and then move-left through C. This
  // reduces the left X run by one and grows the following run by two.
  // Their carried suffix receives four strides. Induct on the number
  // of C blocks and then on the number of non-C blocks. The n-step
  // formula is the additive composition of this one-step formula:
  // before each C its X count is X + 2*prior_n - current_n so each
  // checked run-length guard remains true at all intermediate passes
  // (at adjacent C's current_n=4*prior_n). An opaque RIGHT in the
  // proof represents s^spent(r), where the caller witnesses all T
  // strides through r. The variable X counter stands for u+c,u>=0;
  // only guaranteed-positive branches and affine updates are used.
  // Repeating the verified single uni-cycle preserves its left match:
  // it appends F outside that match and puts G in front of the old
  // right side. Strides commute with any initial G prefix. That makes
  // the single-cycle proof applicable k times under both guards, with
  // no probing of the opaque tail and no expansion of the large runs.
}
