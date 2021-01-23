package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026896 T(2n,n+3), T given by A026780.
 * @author Sean A. Irvine
 */
public class A026896 extends A026780 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 3);
  }
}
