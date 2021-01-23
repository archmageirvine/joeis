package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027092 a(n) = A027082(n, 2n-5).
 * @author Sean A. Irvine
 */
public class A027092 extends A027082 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 5);
  }
}
