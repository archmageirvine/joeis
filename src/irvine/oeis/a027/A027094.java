package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027094 a(n) = A027082(n, 2n-7).
 * @author Sean A. Irvine
 */
public class A027094 extends A027082 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 7);
  }
}
