package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004394 Superabundant [or super-abundant] numbers: n such that sigma(n)/n &gt; sigma(m)/m for all m &lt; n, sigma(n) being A000203(n), the sum of the divisors of n.
 * @author Sean A. Irvine
 */
public class A004394 extends Sequence1 {

  private long mBestN = 1;
  private Z mBestSigma = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Functions.SIGMA1.z(++mN);
      if (sigma.multiply(mBestN).compareTo(mBestSigma.multiply(mN)) > 0) {
        mBestN = mN;
        mBestSigma = sigma;
        return Z.valueOf(mN);
      }
    }
  }
}

