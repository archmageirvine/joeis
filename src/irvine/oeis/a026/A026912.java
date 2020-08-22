package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026912 T(2n-1,n-1), T given by A026907.
 * @author Sean A. Irvine
 */
public class A026912 extends A026907 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(2 * ++mN - 1, mN - 1);
  }
}
