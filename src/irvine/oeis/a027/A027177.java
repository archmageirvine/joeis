package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027177 <code>a(n) = A027170(n, floor(n/2))</code>.
 * @author Sean A. Irvine
 */
public class A027177 extends A027170 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN / 2);
  }
}
