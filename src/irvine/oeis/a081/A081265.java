package irvine.oeis.a081;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081265 Triangle of coefficients of the polynomials a(n, x) = 2*a(n-1, x)+ x^2*a(n-2,x), n &gt;= 1, a(0, x) = 1, a(1, x) = 1.
 * @author Sean A. Irvine
 */
public class A081265 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = null;
  private Polynomial<Z> mB = RING.one();
  private int mN = 1;
  private int mM = -1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = RING.one();
      return Z.ONE;
    }
    if (++mM > mN) {
      final Polynomial<Z> t = RING.add(RING.multiply(mB, Z.TWO), mA.shift(2));
      mA = mB;
      mB = t;
      mM = 0;
      ++mN;
    }
    return mB.coeff(mM);
  }
}

