package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027124 a(n) = A027113(n, 2n-6).
 * @author Sean A. Irvine
 */
public class A027124 extends A027113 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 6);
  }
}
