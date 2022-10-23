package irvine.oeis.a047;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047991 Triangle formed from expansion of (x-1)(x+2)(x-3)...(x+-n).
 *
 * @author Sean A. Irvine
 */
public class A047991 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = null;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
      mA = mA == null ? RING.one() : RING.multiply(mA, Polynomial.create((mN & 1) == 0 ? mN : -mN, 1L));
    }
    return mA.coeff(mM);
  }
}
