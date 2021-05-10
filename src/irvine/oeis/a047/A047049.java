package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047049 T(2n,n), array T as in A047040.
 * @author Sean A. Irvine
 */
public class A047049 extends A047040 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
