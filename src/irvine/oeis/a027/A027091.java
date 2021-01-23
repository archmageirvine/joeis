package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027091 a(n) = A027082(n, 2n-4).
 * @author Sean A. Irvine
 */
public class A027091 extends A027082 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 4);
  }
}
