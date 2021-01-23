package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027127 a(n) = A027113(n, 2n-9).
 * @author Sean A. Irvine
 */
public class A027127 extends A027113 {

  private long mN = 4;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 9);
  }
}
