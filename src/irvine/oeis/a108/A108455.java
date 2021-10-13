package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.a051.A051707;

/**
 * A108455 Table read by antidiagonals: T(n,k) = number of factorizations of (n,k) into any number of pairs (i,j) with i &gt; 0, j &gt; 0 (and if i=1 then j=1).
 * @author Sean A. Irvine
 */
public class A108455 extends A051707 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return Z.valueOf(get(mN - mM + 1, mM).size());
  }
}
