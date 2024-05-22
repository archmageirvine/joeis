package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015883 Numbers k such that sigma(k) = sigma(k+13).
 * @author Sean A. Irvine
 */
public class A015883 extends Sequence1 {

  private Z mSigmaA = Functions.SIGMA1.z(1);
  private Z mSigmaB = Functions.SIGMA1.z(2);
  private Z mSigmaC = Functions.SIGMA1.z(3);
  private Z mSigmaD = Functions.SIGMA1.z(4);
  private Z mSigmaE = Functions.SIGMA1.z(5);
  private Z mSigmaF = Functions.SIGMA1.z(6);
  private Z mSigmaG = Functions.SIGMA1.z(7);
  private Z mSigmaH = Functions.SIGMA1.z(8);
  private Z mSigmaI = Functions.SIGMA1.z(9);
  private Z mSigmaJ = Functions.SIGMA1.z(10);
  private Z mSigmaK = Functions.SIGMA1.z(11);
  private Z mSigmaL = Functions.SIGMA1.z(12);
  private Z mSigmaM = Functions.SIGMA1.z(13);
  private long mN = 13;

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
      mSigmaG = mSigmaH;
      mSigmaH = mSigmaI;
      mSigmaI = mSigmaJ;
      mSigmaJ = mSigmaK;
      mSigmaK = mSigmaL;
      mSigmaL = mSigmaM;
      mSigmaM = Functions.SIGMA1.z(++mN);
      if (mSigmaM.equals(sigma)) {
        return Z.valueOf(mN - 13);
      }
    }
  }
}
