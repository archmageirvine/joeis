package irvine.oeis.a087;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087307 Triangle read by rows: n-th row is the first arithmetic progression with common difference n of n numbers with the same prime signature.
 * @author Sean A. Irvine
 */
public class A087307 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private Z mS = null;

  private boolean is(long s, final long n) {
    final Z sig = FactorUtils.leastPrimeSignature(s);
    for (long k = 1; k < n; ++k) {
      s += n;
      if (!FactorUtils.leastPrimeSignature(s).equals(sig)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      long s = 0;
      while (!is(++s, mN)) {
        // do nothing
      }
      mS = Z.valueOf(s);
      return mS;
    }
    mS = mS.add(mN);
    return mS;
  }
}
