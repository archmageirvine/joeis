package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015866 Numbers k such that sigma(k) = sigma(k+6).
 * @author Sean A. Irvine
 */
public class A015866 extends Sequence1 {

  private Z mSigmaA = Functions.SIGMA1.z(1);
  private Z mSigmaB = Functions.SIGMA1.z(2);
  private Z mSigmaC = Functions.SIGMA1.z(3);
  private Z mSigmaD = Functions.SIGMA1.z(4);
  private Z mSigmaE = Functions.SIGMA1.z(5);
  private Z mSigmaF = Functions.SIGMA1.z(6);
  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mSigmaA;
      mSigmaA = mSigmaB;
      mSigmaB = mSigmaC;
      mSigmaC = mSigmaD;
      mSigmaD = mSigmaE;
      mSigmaE = mSigmaF;
      mSigmaF = Functions.SIGMA1.z(++mN);
      if (mSigmaF.equals(sigma)) {
        return Z.valueOf(mN - 6);
      }
    }
  }
}
