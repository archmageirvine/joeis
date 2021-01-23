package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026591 T(2n,n-1), T given by A026584.
 * @author Sean A. Irvine
 */
public class A026591 extends A026584 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
