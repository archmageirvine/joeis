package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a050.A050376;

/**
 * A037992 Smallest number with <code>2^n</code> divisors.
 * @author Sean A. Irvine
 */
public class A037992 extends A050376 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(super.next());
    return mA;
  }
}
