package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083381 Square array giving the number of trellis edges T(i,j) (i &gt;= 0, j &gt;= 0), read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A083381 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Z.valueOf(3 * n * m + n + m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
