package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015861 Numbers k such that sigma(k) = sigma(k+3).
 * @author Sean A. Irvine
 */
public class A015861 extends Sequence1 {

  private Z mSigmaA = Functions.SIGMA.z(1);
  private Z mSigmaB = Functions.SIGMA.z(2);
  private Z mSigmaC = Functions.SIGMA.z(3);
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mSigmaA;
      mSigmaA = mSigmaB;
      mSigmaB = mSigmaC;
      mSigmaC = Functions.SIGMA.z(++mN);
      if (mSigmaC.equals(sigma)) {
        return Z.valueOf(mN - 3);
      }
    }
  }
}
