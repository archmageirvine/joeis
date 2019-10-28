package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027176 <code>a(n) = A027170(2n-1, n-2)</code>.
 * @author Sean A. Irvine
 */
public class A027176 extends A027170 {

  private long mN = 1;

  @Override
  public Z next() {
    return t(2 * ++mN - 1, mN - 2);
  }
}
