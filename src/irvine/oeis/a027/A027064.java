package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027064 a(n) = A027052(n, 2n-8).
 * @author Sean A. Irvine
 */
public class A027064 extends A027052 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 8);
  }
}
