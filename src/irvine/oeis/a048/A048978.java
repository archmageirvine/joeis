package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048978 Light numbers, those whose mean sum of divisors &lt;= mean running sum of divisors of all previous n.
 * @author Sean A. Irvine
 */
public class A048978 implements Sequence {

  private long mN = 1;
  private Z mSumSigma1 = Z.ONE;
  private Z mSumSigma0 = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s0 = fs.sigma0();
      final Z s1 = fs.sigma();
      final boolean light = s0.multiply(mSumSigma1).compareTo(s1.multiply(mSumSigma0)) >= 0;
      mSumSigma0 = mSumSigma0.add(s0);
      mSumSigma1 = mSumSigma1.add(s1);
      if (light) {
        return Z.valueOf(mN);
      }
    }
  }
}
