package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027171 <code>a(n) = A027170(2n, n)</code>.
 * @author Sean A. Irvine
 */
public class A027171 extends A027170 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(2 * ++mN, mN);
  }
}
