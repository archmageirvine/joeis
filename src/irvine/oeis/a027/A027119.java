package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027119 <code>a(n) = A027113(n, 2n-1)</code>.
 * @author Sean A. Irvine
 */
public class A027119 extends A027113 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 1);
  }
}
