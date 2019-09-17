package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026128.
 * @author Sean A. Irvine
 */
public class A026128 extends A026120 {

  private long mN = -1;

  @Override
  public Z next() {
    return u(2 * ++mN, mN - 1);
  }
}
