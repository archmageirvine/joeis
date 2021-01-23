package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027066 a(n) = A027052(n, 2n-10).
 * @author Sean A. Irvine
 */
public class A027066 extends A027052 {

  private long mN = 4;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 10);
  }
}
