package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027061 a(n) = A027052(n, 2n-5).
 * @author Sean A. Irvine
 */
public class A027061 extends A027052 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 5);
  }
}
