package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002192 Inverse of the <code>sum-of-divisors</code> function <code>(A000203)</code>.
 * @author Sean A. Irvine
 */
public class A002192 extends A002191 {

  @Override
  public Z next() {
    return mSeen.get(super.next());
  }
}
