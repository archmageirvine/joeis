package irvine.oeis.a063;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A063883 Number of ways writing n as a sum of different Mersenne prime exponents (terms of A000043).
 * @author Sean A. Irvine
 */
public class A063883 extends A000043 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private int mNext = super.next().intValueExact();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN >= mNext) {
      mA = RING.multiply(mA, RING.onePlusXToTheN(mNext));
      mNext = super.next().intValueExact();
    }
    return mA.coeff(mN);
  }
}
