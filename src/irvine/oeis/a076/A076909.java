package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import irvine.math.group.MultivariatePolynomialField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.UnimplementedSequence;

/**
 * A076909 Coefficients of 4-point function in dimension 4.
 * @author Sean A. Irvine
 */
public class A076909 extends Sequence0 implements UnimplementedSequence {

  // I got to here after a lot of effort, so didn't want to throw it all away.
  // However, it seems my MultivariatePolynomial's simply do not have sufficient backing
  // to do the ideal reduction wanted here.

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>("q", Rationals.SINGLETON);
  private static final Q KO = new Q(1, 216);
  private static final Q T10 = new Q(1, 36);
  private static final Q T20 = Q.NEG_ONE;
  private static final Q T81 = new Q(49, 18);

  private ArrayList<Polynomial<Q>> mPose;
  private int mN = -1;

  /** Construct the sequence. */
  public A076909() {
    // todo remove this double list creation
    mPose = new ArrayList<>(List.of(
      Polynomial.create(T10, new Q(60).multiply(KO).divide(T10.square()).divide(new Q(49)).multiply(T81)),
      Polynomial.create(T20, new Q(-162).multiply(T20).multiply(KO).divide(T10.pow(3)).divide(new Q(49)).multiply(T81)),
      Polynomial.create(T10.multiply(T20), new Q(-66).multiply(T20).multiply(KO).divide(T10.square()).divide(new Q(7)).multiply(T81)),
      Polynomial.create(T10.negate().divide(new Q(36).multiply(KO)), new Q(16).divide(new Q(147).multiply(T10.square())).multiply(T81)),
      Polynomial.create(T10.square().negate().divide(new Q(12).multiply(KO)), new Q(45).divide(new Q(49).multiply(T10)).multiply(T81)),
      Polynomial.create(Q.ZERO, new Q(3888).multiply(T10.pow(3)).multiply(KO).divide(new Q(49)).multiply(T81)),
      Polynomial.create(T10.square().negate().divide(new Q(1296).multiply(T20).multiply(KO.square())), Q.ONE.divide(new Q(1512).multiply(T10).multiply(T20).multiply(KO)).multiply(T81)),
      Polynomial.create(T10.pow(3).negate().divide(new Q(36).multiply(KO)), T81)
    ));
  }

  private Polynomial<Q> computeY(final int n) {
    final Polynomial<Q> pose1 = mPose.get(0);
    final Polynomial<Q> pose3 = mPose.get(2);
    final Polynomial<Q> pose6 = mPose.get(5);

    final Polynomial<Q> pose3Pow4 = RING.pow(pose3, 4, n);
    final Polynomial<Q> denom = RING.subtract(RING.pow(pose1, 6, n), pose6);
    final Polynomial<Q> inverse = RING.series(RING.one(), denom, n);
    final Polynomial<Q> result = RING.multiply(pose3Pow4, inverse, n);
    return RING.multiply(result, new Q(1, 216));
  }

  private static final MultivariatePolynomialField<Polynomial<Q>> MULTI = new MultivariatePolynomialField<>(RING, 8);
  private static final MultivariatePolynomial<Polynomial<Q>> DIS = new MultivariatePolynomial<>(RING, 8, new int[][] {{6, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 1, 0, 0}}, List.of(RING.one(), RING.negate(RING.one())));
  private static final MultivariatePolynomial<Polynomial<Q>> DT1 =
    DIS.multiply(new MultivariatePolynomial<>(RING, 8,
      new int[][] {
        {1, 1, 0, 0, 0, 0, 0, 0},  // t₁·t₂
        {0, 0, 1, 0, 0, 0, 0, 0}   // t₃
      },
      List.of(RING.negate(RING.one()), RING.one())
    ));
  private static final MultivariatePolynomial<Polynomial<Q>> DT2 =
    new MultivariatePolynomial<>(RING, 8,
      new int[][] {
        {0, 0, 2, 1, 0, 0, 0, 1}, // t₃²·t₄·t₈
        {6, 2, 0, 0, 0, 0, 0, 0}, // t₁⁶·t₂²
        {0, 2, 0, 0, 0, 1, 0, 0}, // t₂²·t₆
      },
      List.of(
        RING.monomial(KO.pow(2).multiply(1296), 0), // c₄ = ko²
        RING.negate(RING.one()),
        RING.one()
      )
    );
  private static final MultivariatePolynomial<Polynomial<Q>> DT3 =
    new MultivariatePolynomial<>(RING, 8,
      new int[][] {
        {0, 0, 2, 0, 1, 0, 0, 1}, // t₃²·t₅·t₈
        {6, 1, 1, 0, 0, 0, 0, 0}, // t₁⁶·t₂·t₃
        {0, 1, 1, 0, 0, 1, 0, 0}, // t₂·t₃·t₆
      },
      List.of(
        RING.monomial(KO.pow(2).multiply(1296), 0), // c₄ = ko²
        RING.monomial(new Q(-3), 0),
        RING.monomial(new Q(3), 0)
      )
    );
  private static final MultivariatePolynomial<Polynomial<Q>> DT4 =
    new MultivariatePolynomial<>(RING, 8,
      new int[][] {
        {0, 0, 2, 0, 0, 0, 1, 1}, // t₃²·t₇·t₈
        {6, 1, 0, 1, 0, 0, 0, 0}, // t₁⁶·t₂·t₄
        {0, 1, 0, 1, 0, 1, 0, 0}, // t₂·t₄·t₆
      },
      List.of(
        RING.monomial(KO.pow(2).multiply(-1296), 0), // c₄ = ko²
        RING.negate(RING.one()),
        RING.one()
      )
    );
  private static final MultivariatePolynomial<Polynomial<Q>> DT5_NUMERATOR =
    new MultivariatePolynomial<>(RING, 8,
      new int[][] {
        {0, 0, 1, 0, 2, 0, 0, 1}, // t₃·t₅²·t₈
        {6, 1, 0, 0, 1, 0, 0, 0}, // t₁⁶·t₂·t₅
        {6, 0, 1, 1, 0, 0, 0, 0}, // t₁⁶·t₃·t₄
        {4, 0, 1, 0, 0, 0, 0, 1}, // t₁⁴·t₃·t₈
        {0, 1, 0, 0, 1, 1, 0, 0}, // t₂·t₅·t₆
        {0, 0, 1, 1, 0, 1, 0, 0}  // t₃·t₄·t₆
      },
      List.of(
        RING.monomial(KO.pow(2).multiply(1296), 0), // c₄ = ko²
        RING.monomial(new Q(-4), 0),
        RING.monomial(new Q(-2), 0),
        RING.monomial(new Q(5), 0),
        RING.monomial(new Q(4), 0),
        RING.monomial(new Q(2), 0)
      )
    );

  private static final MultivariatePolynomial<Polynomial<Q>> DT5 =
    MULTI.multiply(DT5_NUMERATOR, RING.monomial(Q.HALF, 0));
  private static final MultivariatePolynomial<Polynomial<Q>> DT6 =
    DIS.multiply(
      new MultivariatePolynomial<>(RING, 8,
        new int[][] {{0, 1, 0, 0, 0, 1, 0, 0}}, // t₂·t₆
        List.of(RING.monomial(new Q(-6), 0))
      )
    );
  private static final MultivariatePolynomial<Polynomial<Q>> DT7 =
    MULTI.multiply(DIS.multiply(
      new MultivariatePolynomial<>(RING, 8,
        new int[][] {
          {0, 0, 0, 2, 0, 0, 0, 0}, // t₄²
          {2, 0, 0, 0, 0, 0, 0, 0}  // t₁²
        },
        List.of(
          RING.monomial(KO.pow(2).multiply(1296), 0), // c₄ = ko²
          RING.negate(RING.one())
        )
      )), RING.monomial(new Q(1, 2592).divide(KO.pow(2)), 0)
    );
  private static final MultivariatePolynomial<Polynomial<Q>> DT8 =
    new MultivariatePolynomial<>(RING, 8,
      new int[][] {
        {6, 1, 0, 0, 0, 0, 0, 1}, // t₁⁶·t₂·t₈
        {5, 0, 1, 0, 0, 0, 0, 1}, // t₁⁵·t₃·t₈
        {0, 1, 0, 0, 0, 1, 0, 1}  // t₂·t₆·t₈
      },
      List.of(
        RING.monomial(new Q(-3), 0),
        RING.monomial(new Q(3), 0),
        RING.monomial(new Q(3), 0)
      )
    );

  private MultivariatePolynomial<Polynomial<Q>> diffAndShiftQ(final MultivariatePolynomial<Polynomial<Q>> poly) {
    final MultivariatePolynomial<Polynomial<Q>> result = new MultivariatePolynomial<>(RING, poly.numberVariables());
    for (Map.Entry<MultivariatePolynomial.Term, Polynomial<Q>> term : poly.entrySet()) {
      final Polynomial<Q> deriv = RING.diff(term.getValue());  // derivative w.r.t. q
      result.put(term.getKey(), deriv.shift(1));
    }
    return result;
  }

  private MultivariatePolynomial<Polynomial<Q>> selectCoeff(final MultivariatePolynomial<Polynomial<Q>> poly) {
    final MultivariatePolynomial<Polynomial<Q>> res = new MultivariatePolynomial<>(RING, poly.numberVariables());
    for (final Map.Entry<MultivariatePolynomial.Term, Polynomial<Q>> e : poly.entrySet()) {
      res.add(e.getKey(), RING.monomial(e.getValue().coeff(2), 0));
    }
    return res;
  }

  private ArrayList<Polynomial<Q>> qExpansionStep(final List<MultivariatePolynomial<Polynomial<Q>>> vecfield, final ArrayList<Polynomial<Q>> pose, final int n, final Q a) {
    final int vars = pose.size();
    final MultivariatePolynomialField<Polynomial<Q>> ring = new MultivariatePolynomialField<>(RING, vars);
    final ArrayList<MultivariatePolynomial<Polynomial<Q>>> poseLifted = new ArrayList<>();
    for (int i = 0; i < vars; ++i) {
      final int[] powers0 = new int[vars];
      final int[] powers1 = new int[vars];
      powers1[i] = 1;
      final MultivariatePolynomial<Polynomial<Q>> p = new MultivariatePolynomial<>(RING, vars, new int[][] {powers0, powers1}, List.of(pose.get(i), RING.monomial(Q.ONE, n)));
      poseLifted.add(p);
    }
    System.out.println("poseLifted=" + poseLifted);

    final List<MultivariatePolynomial<Polynomial<Q>>> vecfieldSubstituted = new ArrayList<>();
    final List<MultivariatePolynomial<Polynomial<Q>>> denomvSubstituted = new ArrayList<>();

    for (int i = 0; i < vars; ++i) {
      MultivariatePolynomial<Polynomial<Q>> denom = DIS;
      for (int j = 0; j < vars; ++j) {
        denom = ring.substitute(denom, poseLifted.get(j), j);
      }
      denomvSubstituted.add(denom);
    }

    System.out.println("vecfield-pre=" + vecfield);
    for (int i = 0; i < vars; ++i) {
      MultivariatePolynomial<Polynomial<Q>> vfs = vecfield.get(i);
      for (int j = 0; j < vars; ++j) {
        vfs = ring.substitute(vfs, poseLifted.get(j), j);
      }
      vecfieldSubstituted.add(vfs);
    }

    System.out.println("dis=" + DIS);
    System.out.println("denomvSubstituted=" + denomvSubstituted.get(0));
    System.out.println("vecfieldSubstituted=" + vecfieldSubstituted.get(0));

    final List<MultivariatePolynomial<Polynomial<Q>>> vecfieldRes = new ArrayList<>();
    for (int i = 0; i < vars; ++i) {
      // First, differentiate pose[i] with respect to q
      final MultivariatePolynomial<Polynomial<Q>> dPose = diffAndShiftQ(poseLifted.get(i));
      // Multiply by denomvSubstituted[i]
      final MultivariatePolynomial<Polynomial<Q>> term = ring.multiply(denomvSubstituted.get(i), dPose);
      // Multiply entire term by a (c_2 in Singular)
      final MultivariatePolynomial<Polynomial<Q>> scaledTerm = ring.multiply(term, RING.monomial(a, 0));
      // Subtract vecfieldSubstituted[i]
      final MultivariatePolynomial<Polynomial<Q>> numer = ring.subtract(scaledTerm, vecfieldSubstituted.get(i));
      if (i == 0) {
        System.out.println("numer=" + numer);
      }
      final MultivariatePolynomial<Polynomial<Q>> substituted = selectCoeff(numer);
      vecfieldRes.add(substituted);
    }

    System.out.println("vecfieldRes=" + vecfieldRes.get(0));
    ArrayList<MultivariatePolynomial<Polynomial<Q>>> poseCurrent = poseLifted;
    for (int k = 2; k <= 10; ++k) {
      poseCurrent = reducePose(ring, poseCurrent, vecfieldRes);
    }

    System.out.println("Final reduced: " + poseCurrent);
    return null;
  }

//  private boolean containsTiVars(final List<MultivariatePolynomial<Polynomial<Q>>> pose) {
//    for (MultivariatePolynomial<Polynomial<Q>> p : pose) {
//      for (MultivariatePolynomial.Term t : p.keySet()) {
//        if (t.sumExponents() != 0) {
//          return true;
//        }
//      }
//    }
//    return false;
//  }

  private List<MultivariatePolynomial<Polynomial<Q>>> std(final List<MultivariatePolynomial<Polynomial<Q>>> ideal) {
    return ideal;
  }

  private boolean divides(final MultivariatePolynomial.Term a, final MultivariatePolynomial.Term b) {
    for (int i = 0; i < a.numberOfVariables(); ++i) {
      if (a.get(i) > b.get(i)) {
        return false;
      }
    }
    return true;
  }

  private int[] subtractExponents(final MultivariatePolynomial.Term a, final MultivariatePolynomial.Term b) {
    final int[] r = new int[a.numberOfVariables()];
    for (int i = 0; i < a.numberOfVariables(); ++i) {
      r[i] = a.get(i) - b.get(i);
    }
    return r;
  }

  private MultivariatePolynomial.Term leadingTerm(final MultivariatePolynomial<Polynomial<Q>> p) {
    // Naively pick term with highest total degree (not lex order for now)
    return p.keySet().stream()
      .max(Comparator.comparingInt(MultivariatePolynomial.Term::sumExponents))
      .orElseThrow();
  }

  private MultivariatePolynomial<Polynomial<Q>> reduceTiStub(final int i, final List<MultivariatePolynomial<Polynomial<Q>>> ideal) {
    final int vars = ideal.get(0).numberVariables();
    final MultivariatePolynomialField<Polynomial<Q>> ring = new MultivariatePolynomialField<>(RING, vars);

    // Start with t_i
    MultivariatePolynomial<Polynomial<Q>> ti = ring.var(i);

    boolean reduced = true;
    while (reduced) {
      reduced = false;
      for (final MultivariatePolynomial<Polynomial<Q>> g : ideal) {
        if (g.isZero()) {
          continue;
        }

        final MultivariatePolynomial.Term ltG = leadingTerm(g); // Pick some leading term
        final MultivariatePolynomial.Term ltTi = leadingTerm(ti);

        if (divides(ltG, ltTi)) {
          // Compute monomial quotient
          final int[] quotientExponents = subtractExponents(ltTi, ltG);

          final Polynomial<Q> coeffNumer = ti.get(ltTi);
          final Polynomial<Q> coeffDenom = g.get(ltG);
          if (coeffDenom.degree() > 0) {
            throw new UnsupportedOperationException("Non-scalar leading coefficient in ideal generator.");
          }

          final Q denomScalar = coeffDenom.coeff(0);
          final Polynomial<Q> coeffQuotient = RING.multiply(coeffNumer, denomScalar.reciprocal());
          //Polynomial<Q> coeffQuotient = ti.get(ltTi).divide(g.get(ltG));

          // Multiply g by the quotient monomial and subtract from ti
          final MultivariatePolynomial<Polynomial<Q>> reduction = ring.multiply(g,
            new MultivariatePolynomial<>(RING, vars,
              new int[][] {quotientExponents},
              List.of(coeffQuotient)));
          ti = ring.subtract(ti, reduction);
          reduced = true;
          break; // Restart the loop
        }
      }
    }

    System.out.println("ti=" + ti);
    return ti;
  }

  private ArrayList<MultivariatePolynomial<Polynomial<Q>>> reducePose(
    final MultivariatePolynomialField<Polynomial<Q>> ring,
    ArrayList<MultivariatePolynomial<Polynomial<Q>>> pose,
    final List<MultivariatePolynomial<Polynomial<Q>>> vecfield1) {
    final int vars = pose.size();

    // Create an ideal = list of polynomials to reduce against
    List<MultivariatePolynomial<Polynomial<Q>>> ideal = new ArrayList<>();
    //ideal.add(ring.zero());
    ideal.addAll(vecfield1);

    ideal = std(ideal); // Singular code does Grobner reduction in this method

    boolean changed;
    int safety = 0;
    do {
      changed = false;
      final ArrayList<MultivariatePolynomial<Polynomial<Q>>> reducedTi = new ArrayList<>();
      for (int i = 0; i < vars; ++i) {
        final MultivariatePolynomial<Polynomial<Q>> reduced = reduceTiStub(i, ideal);
        reducedTi.add(reduced);
      }
      System.out.println("Reduced: " + reducedTi);

      final ArrayList<MultivariatePolynomial<Polynomial<Q>>> updatedPose = new ArrayList<>();
      for (int i = 0; i < vars; ++i) {
        // pose[i] is a MultivariatePolynomial with t_i inside
        // reducedTi[i] is a MultivariatePolynomial representing t_i = f(t_others, q)
        final MultivariatePolynomial<Polynomial<Q>> updated = ring.substitute(pose.get(i), reducedTi.get(i), i);
        updatedPose.add(updated);
        if (!updated.equals(pose.get(i))) {
          changed = true;
        }
      }
      pose = updatedPose;
      ++safety;
    } while (changed && safety < 10);
    System.out.println("UpdatePose: " + pose);
    return pose;
  }


  @Override
  public Z next() {
    if (++mN > 1) {
      mPose = qExpansionStep(List.of(DT1, DT2, DT3, DT4, DT5, DT6, DT7, DT8), mPose, mN, Q.SIX);
    }
    System.out.println("n=" + mN);
    System.out.println("pose=" + mPose);
    final Polynomial<Q> y = computeY(mN);
    System.out.println("y=" + y);
    return y.coeff(mN).toZ();
  }
}