package irvine.oeis.a076;

import java.util.ArrayList;
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

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076909 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>("q", Rationals.SINGLETON);
  private static final Q KO = new Q(1, 216);
  private static final Q T10 = new Q(1, 36);
  private static final Q T20 = Q.NEG_ONE;
  private static final Q T81 = new Q(49, 18);

  private ArrayList<Polynomial<Q>> mPose;
  private int mN = -1;

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

  private Polynomial<Q> dt1(final Polynomial<Q> t1, final Polynomial<Q> t2, final Polynomial<Q> t3, final Polynomial<Q> t6) {
    return RING.multiply(RING.subtract(RING.pow(t1, 6), t6), RING.subtract(t3, RING.multiply(t1, t2)));
  }

  private Polynomial<Q> dt2(final Polynomial<Q> t1, final Polynomial<Q> t2, final Polynomial<Q> t3,
                            final Polynomial<Q> t4, final Polynomial<Q> t6, final Polynomial<Q> t8) {
    final Polynomial<Q> term1 = RING.multiply(
      RING.multiply(RING.pow(t3, 2, 2), new Q(1296).multiply(KO).multiply(KO)),
      RING.multiply(t4, t8));
    final Polynomial<Q> term2 = RING.multiply(RING.pow(t1, 6, 2), RING.pow(t2, 2, 2));
    final Polynomial<Q> term3 = RING.multiply(RING.pow(t2, 2, 2), t6);
    return RING.subtract(RING.subtract(term1, term2), term3);
  }

  private Polynomial<Q> dt3(final Polynomial<Q> t1, final Polynomial<Q> t2, final Polynomial<Q> t3,
                            final Polynomial<Q> t5, final Polynomial<Q> t6, final Polynomial<Q> t8) {
    final Polynomial<Q> term1 = RING.multiply(
      RING.multiply(RING.pow(t3, 2, 2), new Q(1296).multiply(KO).multiply(KO)),
      RING.multiply(t5, t8));
    final Polynomial<Q> term2 = RING.multiply(RING.multiply(RING.pow(t1, 6, 2), t2), t3);
    final Polynomial<Q> term3 = RING.multiply(RING.multiply(t2, t3), t6);
    return RING.add(RING.subtract(term1, RING.multiply(term2, Q.THREE)), RING.multiply(term3, Q.THREE));
  }

  private Polynomial<Q> dt4(final Polynomial<Q> t1, final Polynomial<Q> t2, final Polynomial<Q> t3,
                            final Polynomial<Q> t4, final Polynomial<Q> t6, final Polynomial<Q> t7, final Polynomial<Q> t8) {
    final Polynomial<Q> term1 = RING.multiply(
      RING.multiply(RING.pow(t3, 2, 2), new Q(1296).multiply(KO).multiply(KO)),
      RING.multiply(t7, t8));
    final Polynomial<Q> term2 = RING.multiply(RING.multiply(RING.pow(t1, 6, 2), t2), t4);
    final Polynomial<Q> term3 = RING.multiply(RING.multiply(t2, t4), t6);
    return RING.subtract(RING.subtract(RING.negate(term1), term2), RING.negate(term3));
  }

  private Polynomial<Q> dt5(final Polynomial<Q> t1, final Polynomial<Q> t2, final Polynomial<Q> t3,
                            final Polynomial<Q> t4, final Polynomial<Q> t5, final Polynomial<Q> t6, final Polynomial<Q> t8) {
    final Polynomial<Q> term1 = RING.multiply(
      RING.multiply(RING.multiply(t3, RING.pow(t5, 2, 2)), new Q(1296).multiply(KO).multiply(KO)),
      t8);
    final Polynomial<Q> term2 = RING.multiply(RING.multiply(RING.multiply(RING.pow(t1, 6, 2), t2), t5), Q.FOUR);
    final Polynomial<Q> term3 = RING.multiply(RING.multiply(RING.multiply(RING.pow(t1, 6, 2), t3), t4), Q.TWO);
    final Polynomial<Q> term4 = RING.multiply(RING.multiply(RING.multiply(RING.pow(t1, 4, 2), t3), t8), Q.FIVE);
    final Polynomial<Q> term5 = RING.multiply(RING.multiply(RING.multiply(t2, t5), t6), Q.FOUR);
    final Polynomial<Q> term6 = RING.multiply(RING.multiply(RING.multiply(t3, t4), t6), Q.TWO);

    final Polynomial<Q> numerator = RING.subtract(RING.subtract(RING.add(term1, term4), term2), term3);
    final Polynomial<Q> sum = RING.add(numerator, RING.add(term5, term6));
    return RING.multiply(sum, new Q(1, 2));
  }

  private Polynomial<Q> dt6(final Polynomial<Q> t1, final Polynomial<Q> t2, final Polynomial<Q> t3,
                            final Polynomial<Q> t6) {
    final Polynomial<Q> dis = RING.subtract(RING.pow(t1, 6, 2), t6);
    return RING.multiply(dis, RING.multiply(RING.multiply(t2, t6), new Q(-6)));
  }

  private Polynomial<Q> dt7(final Polynomial<Q> t1, final Polynomial<Q> t3, final Polynomial<Q> t4, final Polynomial<Q> t6) {
    final Polynomial<Q> dis = RING.subtract(RING.pow(t1, 6, 2), t6);
    final Polynomial<Q> numerator = RING.subtract(RING.multiply(RING.pow(t4, 2, 2), new Q(1296).multiply(KO).multiply(KO)), RING.pow(t1, 2, 2));
    return RING.multiply(dis, RING.divide(numerator, new Q(2592).multiply(KO).multiply(KO)));
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

  private ArrayList<Polynomial<Q>> qExpansionStep(final List<MultivariatePolynomial<Polynomial<Q>>> vecfield, final ArrayList<Polynomial<Q>> pose, final int n, final Q a) {
    final int vars = pose.size();
    final MultivariatePolynomialField<Polynomial<Q>> ring = new MultivariatePolynomialField<>(RING, vars);
    final List<MultivariatePolynomial<Polynomial<Q>>> poseLifted = new ArrayList<>();
    for (int i = 0; i < vars; ++i) {
      final int[] powers0 = new int[vars];
      final int[] powers1 = new int[vars];
      powers1[i] = 1;
      MultivariatePolynomial<Polynomial<Q>> p = new MultivariatePolynomial<>(RING, vars, new int[][] {powers0, powers1}, List.of(pose.get(i), RING.monomial(Q.ONE, n)));
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
    return null;
  }

  private MultivariatePolynomial<Polynomial<Q>> diffAndShiftQ(final MultivariatePolynomial<Polynomial<Q>> poly) {
    final MultivariatePolynomial<Polynomial<Q>> result = new MultivariatePolynomial<>(RING, poly.numberVariables());
    for (Map.Entry<MultivariatePolynomial.Term, Polynomial<Q>> term : poly.entrySet()) {
      Polynomial<Q> deriv = RING.diff(term.getValue());  // derivative w.r.t. q
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
