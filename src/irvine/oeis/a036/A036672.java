package irvine.oeis.a036;

import irvine.math.group.AlternatingGroup;
import irvine.math.group.MultivariatePolynomialField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036672 Number of stereoisomers of acyclic hydrocarbons with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A036672 implements Sequence {

  private static final MultivariatePolynomialField<Q> RING = new MultivariatePolynomialField<>(Rationals.SINGLETON, 3);
  private static final MultivariatePolynomial<Q> X = RING.monomial(Q.ONE, new int[] {1, 0, 0});
  private static final MultivariatePolynomial<Q> XZ = RING.monomial(Q.ONE, new int[] {1, 0, 1});
  private static final MultivariatePolynomial<Q> X2ZD2 = RING.monomial(Q.HALF, new int[] {2, 0, 1});
  private static final int[] SUBS_SQUARE = {2, 2, 2};
  private static final int[] SUBS_CUBE = {3, 3, 3};
  private static final CycleIndex A4 = AlternatingGroup.create(4).cycleIndex();
  private MultivariatePolynomial<Q> mXY = RING.zero(); // Tracks xy / (1-xy) up to degree mN
  private MultivariatePolynomial<Q> mX2YH = RING.zero(); // Tracks (1/2)x^2y / (1-x^2y^2) up to degree mN
  private MultivariatePolynomial<Q> mX2YQ = RING.zero(); // Tracks (1/4)x^2y / (1-xy) up to degree mN
  private MultivariatePolynomial<Q> mG = RING.one();
  private int mN = 0;

  private void stepExpansions() {
    mXY = RING.add(mXY, RING.monomial(Q.ONE, new int[] {mN, mN, 0}));
    if ((mN & 1) == 0) {
      mX2YH = RING.add(mX2YH, RING.monomial(Q.HALF, new int[] {mN, mN - 1, 0}));
    }
    if (mN > 1) {
      mX2YQ = RING.add(mX2YQ, RING.monomial(Q.ONE_QUARTER, new int[] {mN, mN - 1, 0}));
    }
  }

  private void stepG(final int[] degreeLimits) {
    // (7.5) in Balaban
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
    final MultivariatePolynomial<Q> g2s = g.substitutePowers(SUBS_SQUARE, degreeLimits);
    final MultivariatePolynomial<Q> g4 = RING.pow(g, 4, degreeLimits);
    final MultivariatePolynomial<Q> g2s2 = RING.pow(g2s, 2, degreeLimits);
    final MultivariatePolynomial<Q> gm1 = RING.subtract(g, RING.one());
    return RING.subtract(RING.subtract(RING.add(RING.add(
      RING.multiply(A4.apply(g, degreeLimits), X, degreeLimits),
      RING.multiply(RING.subtract(RING.pow(g, 2, degreeLimits), g2s), X2ZD2, degreeLimits)),
      RING.multiply(RING.add(g4, RING.multiply(g2s2, Q.THREE)), mX2YH, degreeLimits)),
      RING.multiply(RING.add(g4, RING.multiply(g2s2, Q.THREE)), mX2YQ, degreeLimits)),
      RING.multiply(RING.subtract(RING.pow(gm1, 2, degreeLimits), gm1.substitutePowers(SUBS_SQUARE, degreeLimits)), Q.HALF)
      );
  }

  @Override
  public Z next() {
    final int[] degreeLimits = {++mN, Integer.MAX_VALUE, Integer.MAX_VALUE};
    stepExpansions();
    stepG(degreeLimits);
    System.out.println("n=" + mN);
    System.out.println("g=" + mG);
    final MultivariatePolynomial<Q> l = l(mG, degreeLimits);
    System.out.println("l=" + l);
    final MultivariatePolynomial<Q> ln = l.extract(0, mN); // [x^n] l(x,y,z)
    //System.out.println("prev=" + l.extract(0, mN - 1));
    System.out.println(ln);
    return ln.eval(Q.ONE, Q.ONE).toZ();
  }
}
