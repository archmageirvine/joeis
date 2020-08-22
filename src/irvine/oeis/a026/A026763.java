package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026763 a(n) = T(2n-1,n-2), T given by A026758.
 * @author Sean A. Irvine
 */
public class A026763 extends A026758 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
