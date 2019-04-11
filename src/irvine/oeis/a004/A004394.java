package irvine.oeis.a004;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004394 Superabundant [or super-abundant] numbers: n such that sigma(n)/n &gt; sigma(m)/m for all m <code>&lt; n,</code> sigma(n) being A000203(n), the sum of the divisors of n.
 * @author Sean A. Irvine
 */
public class A004394 implements Sequence {

  private long mBestN = 1;
  private Z mBestSigma = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Cheetah.factor(++mN).sigma();
      if (sigma.multiply(mBestN).compareTo(mBestSigma.multiply(mN)) > 0) {
        mBestN = mN;
        mBestSigma = sigma;
        return Z.valueOf(mN);
      }
    }
  }
}

