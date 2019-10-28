package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027174 <code>a(n) = A027170(2n, n-2)</code>.
 * @author Sean A. Irvine
 */
public class A027174 extends A027170 {

  private long mN = 1;

  @Override
  public Z next() {
    return t(2 * ++mN, mN - 2);
  }
}
