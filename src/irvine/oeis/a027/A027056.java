package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027056 a(n) = A027052(n, 2n-1).
 * @author Sean A. Irvine
 */
public class A027056 extends A027052 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 1);
  }
}
