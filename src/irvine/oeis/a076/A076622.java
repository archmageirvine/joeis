package irvine.oeis.a076;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076622 Coefficient of x^a(n) in (x-1)*(x-2)*...*(x-n) is the largest one (not in absolute value).
 * @author Sean A. Irvine
 */
public class A076622 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private long mN = 0;
  private Polynomial<Z> mA = RING.one();

  @Override
  public Z next() {
    mA = RING.multiply(mA, Polynomial.create(--mN, 1));
    Z max = Z.ZERO;
    int maxK = 0;
    for (int k = 0; k <= mA.degree(); ++k) {
      final Z c = mA.coeff(k);
      if (c.compareTo(max) > 0) {
        max = c;
        maxK = k;
      }
    }
    return Z.valueOf(maxK);
  }
}
