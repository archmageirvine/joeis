package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026900 T(2n+1,n+3), T given by A026780.
 * @author Sean A. Irvine
 */
public class A026900 extends A026780 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 3);
  }
}
