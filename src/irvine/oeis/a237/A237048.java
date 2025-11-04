package irvine.oeis.a237;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A237048 Irregular triangle read by rows: T(n,k), n &gt;= 1, k &gt;= 1, in which column k lists 1's interleaved with k-1 zeros, and the first element of column k is in row k(k+1)/2.
 * @author Sean A. Irvine
 */
public class A237048 extends Sequence1 {

  private long mN = 1;
  private long mM = -1;
  private long mR = 1;
  private long mS = 1;

  protected long t(final long n, final long m) {
    return (n - m * (m + 1) / 2) % m == 0 ? 1 : 0;
  }

  @Override
  public Z next() {
    if (++mM >= mR) {
      if (--mS < 0) {
        mS = ++mR;
      }
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mN, mM + 1));
  }
}
