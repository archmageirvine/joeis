package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037088 Triangle read by rows: T(n,k) is number of numbers x, 2^n &lt;= x &lt; 2^(n+1), with k prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A037088 implements Sequence {

  private int mN = 0;
  private int mM = 0;
  private long[] mCounts = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mCounts = new long[++mN];
      mM = 0;
      for (long k = 1L << mN; k < 1L << (mN + 1); ++k) {
        ++mCounts[(int) Jaguar.factor(k).bigOmega() - 1];
      }
    }
    return Z.valueOf(mCounts[mM]);
  }
}
