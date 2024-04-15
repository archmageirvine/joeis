package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015883 Numbers k such that sigma(k) = sigma(k+13).
 * @author Sean A. Irvine
 */
public class A015883 extends Sequence1 {

  private Z mSigmaA = Functions.SIGMA.z(1);
  private Z mSigmaB = Functions.SIGMA.z(2);
  private Z mSigmaC = Functions.SIGMA.z(3);
  private Z mSigmaD = Functions.SIGMA.z(4);
  private Z mSigmaE = Functions.SIGMA.z(5);
  private Z mSigmaF = Functions.SIGMA.z(6);
  private Z mSigmaG = Functions.SIGMA.z(7);
  private Z mSigmaH = Functions.SIGMA.z(8);
  private Z mSigmaI = Functions.SIGMA.z(9);
  private Z mSigmaJ = Functions.SIGMA.z(10);
  private Z mSigmaK = Functions.SIGMA.z(11);
  private Z mSigmaL = Functions.SIGMA.z(12);
  private Z mSigmaM = Functions.SIGMA.z(13);
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
      mSigmaM = Functions.SIGMA.z(++mN);
      if (mSigmaM.equals(sigma)) {
        return Z.valueOf(mN - 13);
      }
    }
  }
}
