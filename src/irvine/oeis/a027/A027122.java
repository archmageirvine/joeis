package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027122 <code>a(n) = A027113(n, 2n-4)</code>.
 * @author Sean A. Irvine
 */
public class A027122 extends A027113 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 4);
  }
}
