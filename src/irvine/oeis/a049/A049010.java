package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049010 Mean divisor of n differs by &lt;= 1 from mean divisor of all numbers from 1 to n-1.
 * @author Sean A. Irvine
 */
public class A049010 implements Sequence {

  private long mN = 1;
  private Z mSumSigma1 = Z.ONE;
  private Z mSumSigma0 = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z s0 = fs.sigma0();
      final Z s1 = fs.sigma();
      final boolean ok = new Q(s1, s0).subtract(new Q(mSumSigma1, mSumSigma0)).abs().compareTo(Q.ONE) <= 0;
      mSumSigma0 = mSumSigma0.add(s0);
      mSumSigma1 = mSumSigma1.add(s1);
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}
