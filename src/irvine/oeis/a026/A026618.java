package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026618 T(2n,n-2), T given by A026615.
 * @author Sean A. Irvine
 */
public class A026618 extends A026615 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
