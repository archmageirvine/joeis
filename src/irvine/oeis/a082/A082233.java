package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082233 Square array T(n,k) = 2*n + k, read by antidiagonals in a zigzag fashion, n &gt;= 0 and k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A082233 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private long t(final int n, final int m) {
    return 2L * n + m + 1;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf((mN & 1) == 0 ? t(mN - mM, mM) : t(mM, mN - mM));
  }
}
