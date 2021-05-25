package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047886 Triangle read by rows: T(n,k) = pi(n+k) - pi(n) - pi(k), where pi() = A000720 (n &gt;= 0, 0 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A047886 extends A047885 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

