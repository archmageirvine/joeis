package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026651 a(n) = T(2n,n-2), T given by A026648.
 * @author Sean A. Irvine
 */
public class A026651 extends A026648 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
