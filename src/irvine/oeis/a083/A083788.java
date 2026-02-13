package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083788 Triangle read by rows, in which n-th row contains smallest set of n consecutive numbers with distinct prime signatures.
 * @author Sean A. Irvine
 */
public class A083788 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mLen = 0;
  private long mK = 0;

  static long getLength(long n) {
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(FactorUtils.leastPrimeSignature(n))) {
      ++n;
    }
    return seen.size();
  }

  @Override
  public Z next() {
    if (++mK >= mN) {
      ++mN;
      while (mN > mLen) {
        mLen = getLength(++mM);
      }
      mK = 0;
    }
    return Z.valueOf(mM + mK);
  }
}
