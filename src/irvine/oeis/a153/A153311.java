package irvine.oeis.a153;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A153311 Triangle read by rows: T(n,k) = [x^k] P(n) where P(0) = 2, P(1) = 3+x, P(2) = 2+14*x+2*x^2, and P(n) = (x+1) * (P(n-1) + 3^(n-2) * (x + x^floor(n/2) + x^(n-2))).
 * @author Sean A. Irvine
 */
public class A153311 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X1 = Polynomial.create(1, 1);
  private int mN = 0;
  private int mM = -1;
  private Polynomial<Z> mP = Polynomial.create(2);

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      if (++mN == 1) {
        mP = Polynomial.create(3, 3);
      } else if (mN == 2) {
        mP = Polynomial.create(2, 14, 2);
      } else {
        final Z t = Z.THREE.pow(mN - 2);
        mP = RING.multiply(RING.add(mP, RING.monomial(t, 1), RING.monomial(t, mN / 2), RING.monomial(t, mN - 2)), X1);
      }
      mM = 0;
    }
    return mP.coeff(mM);
  }
}
