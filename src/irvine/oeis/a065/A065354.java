package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a005.A005614;

/**
 * A065354 Decimal representation of binary palindromes extracted from the Golden String using ever-increasing Lucas-style subdivisions.
 * @author Sean A. Irvine
 */
public class A065354 extends A005614 {

  private long mA = -1;
  private long mB = 2;
  {
    super.next();
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final long t = mA + mB;
    mA = mB;
    mB = t;
    Z res = Z.ZERO;
    for (long k = 0; k < t; ++k) {
      res = res.multiply2().add(super.next());
    }
    return res;
  }
}
