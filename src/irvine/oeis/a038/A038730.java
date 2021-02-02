package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038730 Path-counting triangular array T(i,j), read by rows, obtained from array t in A038792 by T(i,j) = t(2*i-j, j) (for i &gt;= 1 and 1 &lt;= j &lt;= i).
 * @author Sean A. Irvine
 */
public class A038730 extends A038792 {

  private long mN = 0;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    return get(2 * n - m, m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
