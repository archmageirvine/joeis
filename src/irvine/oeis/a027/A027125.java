package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027125 <code>a(n) = A027113(n, 2n-7)</code>.
 * @author Sean A. Irvine
 */
public class A027125 extends A027113 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 7);
  }
}
