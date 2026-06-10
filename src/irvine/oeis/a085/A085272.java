package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085272 a(n) = lcm_{k=1..n} (prime(k) + 1).
 * @author Sean A. Irvine
 */
public class A085272 extends A000040 {

  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next().add(1));
    return mLcm;
  }
}
