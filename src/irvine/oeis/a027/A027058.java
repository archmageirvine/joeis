package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027058 <code>a(n) = A027052(n, 2n-2)</code>.
 * @author Sean A. Irvine
 */
public class A027058 extends A027052 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 2);
  }
}
