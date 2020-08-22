package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026594 T(2n-1,n-2), T given by A026584.
 * @author Sean A. Irvine
 */
public class A026594 extends A026584 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
