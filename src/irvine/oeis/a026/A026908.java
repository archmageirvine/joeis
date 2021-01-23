package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026908 T(2n,n), T given by A026907.
 * @author Sean A. Irvine
 */
public class A026908 extends A026907 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(2 * ++mN, mN);
  }
}
