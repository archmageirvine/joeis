package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a275.A275257;

/**
 * A077614 Let F(m,k) be the number of positive integers j &lt;= m such that gcd(j,k) = 1; then a(n) is the number of positive integers k such that F(n,k) = k.
 * @author Sean A. Irvine
 */
public class A077614 extends A275257 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (int k = 1; k <= mN; ++k) {
      if (a(mN, k).equals(k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
