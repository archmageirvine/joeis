package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065167 Table T(n,k) read by antidiagonals, where the k-th row gives the permutation t-&gt;t+k of Z, folded to N (k &gt;= 0, n &gt;= 1).
 * @author Sean A. Irvine
 */
public class A065167 extends Sequence0 {

  private long mN = 0;
  private long mM = 0;

  private long t(final long n, final long m) {
    return LongUtils.z2n(LongUtils.n2z(m) + n);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mM, mN - mM));
  }
}
