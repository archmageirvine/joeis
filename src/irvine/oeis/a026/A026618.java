package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026618 a(n) = A026618(2*n, n-2).
 * @author Sean A. Irvine
 */
public class A026618 extends A026615 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
