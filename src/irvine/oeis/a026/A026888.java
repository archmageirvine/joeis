package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026888 T(2n+1,n+2), T given by A026769.
 * @author Sean A. Irvine
 */
public class A026888 extends A026769 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 2);
  }
}
