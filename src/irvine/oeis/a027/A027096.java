package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027096 a(n) = A027082(n, 2n-9).
 * @author Sean A. Irvine
 */
public class A027096 extends A027082 {

  private long mN = 4;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 9);
  }
}
