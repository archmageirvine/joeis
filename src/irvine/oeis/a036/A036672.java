package irvine.oeis.a036;

import irvine.math.group.AlternatingGroup;
import irvine.math.group.MultivariatePolynomialField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036672 Number of stereoisomers of acyclic hydrocarbons with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A036672 extends Sequence1 {

  // See Ronald C. Read, "The Enumeration of Acyclic Chemical Compounds"
  // in Chemical Applications of Graph Theory (A. T. Balaban editor),
  // particular Section 7.

  private static final MultivariatePolynomialField<Q> RING = new MultivariatePolynomialField<>(Rationals.SINGLETON, 3);
  private static final MultivariatePolynomial<Q> X = RING.monomial(Q.ONE, new int[] {1, 0, 0});
  private static final MultivariatePolynomial<Q> XZ = RING.monomial(Q.ONE, new int[] {1, 0, 1});
  private static final MultivariatePolynomial<Q> X2Z = RING.monomial(Q.ONE, new int[] {2, 0, 1});
  private static final MultivariatePolynomial<Q> X2ZH = RING.monomial(Q.HALF, new int[] {2, 0, 1});
  private static final int[] SUBS_SQUARE = {2, 2, 2};
  private static final int[] SUBS_CUBE = {3, 3, 3};
  private static final CycleIndex A4 = AlternatingGroup.create(4).cycleIndex();
  private MultivariatePolynomial<Q> mXY = RING.zero(); // Tracks xy / (1-xy) up to degree mN
  private MultivariatePolynomial<Q> mX2Y = RING.zero(); // Tracks x^2y / (1-x^2y^2) up to degree mN
  private MultivariatePolynomial<Q> mX2YH = RING.zero(); // Tracks (1/2)x^2y / (1-x^2y^2) up to degree mN
  private MultivariatePolynomial<Q> mX3Y2Q = RING.zero(); // Tracks (1/4)x^3y2 / (1-x^2y^2) up to degree mN
  private MultivariatePolynomial<Q> mX2YH2 = RING.zero(); // Tracks (1/2)x^2y / (1-x^2y^2)^2 up to degree mN
  private MultivariatePolynomial<Q> mX4Y3H2 = RING.zero(); // Tracks (1/2)x^4y^3 / (1-x^2y^2)^2 up to degree mN
  private MultivariatePolynomial<Q> mX2YQ = RING.zero(); // Tracks (1/4)x^2y / (1-xy) up to degree mN
  private MultivariatePolynomial<Q> mG = RING.one();
  private int mN = 0;

  private void stepExpansions() {
    mXY = RING.add(mXY, RING.monomial(Q.ONE, new int[] {mN, mN, 0}));
    if ((mN & 1) == 0) {
      mX2Y = RING.add(mX2Y, RING.monomial(Q.ONE, new int[] {mN, mN - 1, 0}));
      mX2YH = RING.add(mX2YH, RING.monomial(Q.HALF, new int[] {mN, mN - 1, 0}));
      mX2YQ = RING.add(mX2YQ, RING.monomial(Q.ONE_QUARTER, new int[] {mN, mN - 1, 0}));
      if (mN > 3) {
        mX4Y3H2 = RING.add(mX4Y3H2, RING.monomial(new Q((mN - 2) / 2, 2), new int[] {mN, mN - 1, 0}));
      }
      mX2YH2 = RING.add(mX2YH2, RING.monomial(new Q(mN / 2, 2), new int[] {mN, mN - 1, 0}));
    } else if (mN >= 3) {
      mX3Y2Q = RING.add(mX3Y2Q, RING.monomial(Q.ONE_QUARTER, new int[] {mN, mN - 1, 0}));
    }
  }

  private void stepG(final int[] degreeLimits) {
    // (7.5) in Read article
    final MultivariatePolynomial<Q> g3 = RING.pow(mG, 3, degreeLimits);
    final MultivariatePolynomial<Q> gs3 = mG.substitutePowers(SUBS_CUBE, degreeLimits);
    mG = RING.add(RING.one(),
      RING.multiply(RING.add(RING.add(RING.multiply(RING.add(g3, RING.multiply(gs3, Q.TWO)), Q.ONE_THIRD),
        RING.multiply(mXY, g3, degreeLimits)),
        RING.multiply(XZ, mG)),
        X, degreeLimits));
  }

  private MultivariatePolynomial<Q> l(final MultivariatePolynomial<Q> g, final int[] degreeLimits) {
    // l(x,y,z) p. 59 Balaban
    // Note the exact formula given at the bottom of p. 59 is apparently incorrect.
    // Instead we need (7.6)+(7.8)+(7.9)+(7.10)-(7.11)-(7.12)-(7.13)-(7.14)-(7.15)+(7.16),
    // but (7.9)=(7.13) so those terms cancel.
    // Other simplifications are also possible
    final MultivariatePolynomial<Q> g2s = g.substitutePowers(SUBS_SQUARE, degreeLimits);
    final MultivariatePolynomial<Q> g2 = RING.pow(g, 2, degreeLimits);
    final MultivariatePolynomial<Q> g4 = RING.pow(g, 4, degreeLimits);
    final MultivariatePolynomial<Q> g2s2 = RING.pow(g2s, 2, degreeLimits);
    final MultivariatePolynomial<Q> gm1 = RING.subtract(g, RING.one());
    final MultivariatePolynomial<Q> l6a = RING.multiply(A4.apply(g, degreeLimits), X, degreeLimits);
    final MultivariatePolynomial<Q> l6b = RING.multiply(g2, X2Z, degreeLimits);
    final MultivariatePolynomial<Q> g4p1g2s2 = RING.add(g4, g2s2);
    final MultivariatePolynomial<Q> g4p3g2s2 = RING.add(g4, RING.multiply(g2s2, Q.THREE));
    final MultivariatePolynomial<Q> l8 = RING.multiply(g4p1g2s2, mX2YH2, degreeLimits);
    final MultivariatePolynomial<Q> l10 = RING.multiply(g4p3g2s2, mX3Y2Q, degreeLimits);
    final MultivariatePolynomial<Q> l11 = RING.multiply(RING.subtract(RING.pow(gm1, 2, degreeLimits), gm1.substitutePowers(SUBS_SQUARE, degreeLimits)), Q.HALF);
    final MultivariatePolynomial<Q> l12 = RING.multiply(RING.subtract(g2, g2s), X2ZH, degreeLimits);
    final MultivariatePolynomial<Q> l14 = RING.multiply(g4p1g2s2, mX4Y3H2, degreeLimits);
    final MultivariatePolynomial<Q> l15 = RING.multiply(g4p3g2s2, mX2YQ, degreeLimits);
    final MultivariatePolynomial<Q> l16 = RING.multiply(g2s2, mX2Y, degreeLimits);
    return RING.add(RING.subtract(RING.subtract(RING.subtract(RING.subtract(RING.add(RING.add(RING.add(l6a, l6b), l8), l10), l11), l12), l14), l15), l16);
  }

  protected MultivariatePolynomial<Q> step() {
    final int[] degreeLimits = {++mN, Integer.MAX_VALUE, Integer.MAX_VALUE};
    stepExpansions();
    stepG(degreeLimits);
    //System.out.println("n=" + mN);
    //System.out.println("g=" + mG);
    final MultivariatePolynomial<Q> l = l(mG, degreeLimits);
    //System.out.println("l=" + l);
    return l.extract(0, mN);
  }

  @Override
  public Z next() {
    final MultivariatePolynomial<Q> ln = step();
    return ln.eval(Q.ONE, Q.ONE).toZ();
  }
}
