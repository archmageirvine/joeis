package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015867 Numbers k such that sigma(k) = sigma(k+7).
 * @author Sean A. Irvine
 */
public class A015867 extends Sequence1 {

  private Z mSigmaA = Functions.SIGMA.z(1);
  private Z mSigmaB = Functions.SIGMA.z(2);
  private Z mSigmaC = Functions.SIGMA.z(3);
  private Z mSigmaD = Functions.SIGMA.z(4);
  private Z mSigmaE = Functions.SIGMA.z(5);
  private Z mSigmaF = Functions.SIGMA.z(6);
  private Z mSigmaG = Functions.SIGMA.z(7);
  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mSigmaA;
      mSigmaA = mSigmaB;
      mSigmaB = mSigmaC;
      mSigmaC = mSigmaD;
      mSigmaD = mSigmaE;
      mSigmaE = mSigmaF;
      mSigmaF = mSigmaG;
      mSigmaG = Functions.SIGMA.z(++mN);
      if (mSigmaG.equals(sigma)) {
        return Z.valueOf(mN - 7);
      }
    }
  }
}
