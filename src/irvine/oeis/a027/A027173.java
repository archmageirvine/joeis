package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027173 a(n) = A027170(2n, n-1).
 * @author Sean A. Irvine
 */
public class A027173 extends A027170 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(2 * ++mN, mN - 1);
  }
}
