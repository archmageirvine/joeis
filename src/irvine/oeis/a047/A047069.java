package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047069 T(2n,n), array T as in A047060.
 * @author Sean A. Irvine
 */
public class A047069 extends A047060 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
