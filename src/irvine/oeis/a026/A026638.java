package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026638 T(2n,n), T given by A026637.
 * @author Sean A. Irvine
 */
public class A026638 extends A026637 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
