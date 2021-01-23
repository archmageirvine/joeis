package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026627 T(2n,n), T given by A026626.
 * @author Sean A. Irvine
 */
public class A026627 extends A026626 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
