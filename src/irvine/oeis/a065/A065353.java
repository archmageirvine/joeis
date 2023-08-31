package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a005.A005614;

/**
 * A065353 Decimal representation of palindromes extracted from the Golden String using ever increasing Fibonacci-style subdivisions.
 * @author Sean A. Irvine
 */
public class A065353 extends A005614 {

  private long mA = 1;
  private long mB = 0;

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
