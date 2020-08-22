package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026781 a(n) = T(2n,n), T given by A026780.
 * @author Sean A. Irvine
 */
public class A026781 extends A026780 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
