package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026910 T(2n,n-1), T given by A026907.
 * @author Sean A. Irvine
 */
public class A026910 extends A026907 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(2 * ++mN, mN - 1);
  }
}
