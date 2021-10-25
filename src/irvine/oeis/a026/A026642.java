package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026642 a(n) = T(2n-1,n-2), T given by A026637.
 * @author Sean A. Irvine
 */
public class A026642 extends A026637 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
