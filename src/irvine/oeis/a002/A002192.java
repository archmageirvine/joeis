package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002192 Inverse of the sum-of-divisors function (A000203).
 * @author Sean A. Irvine
 */
public class A002192 extends A002191 {

  @Override
  public Z next() {
    return mSeen.get(super.next());
  }
}
