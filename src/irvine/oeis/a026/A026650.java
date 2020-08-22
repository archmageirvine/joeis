package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026650 a(n) = T(2n,n-1), T given by A026648.
 * @author Sean A. Irvine
 */
public class A026650 extends A026648 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
