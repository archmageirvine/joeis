package irvine.oeis.a004;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004394.
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

