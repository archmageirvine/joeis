package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015916 Numbers k such that sigma(k) + 10 = sigma(k+10).
 * @author Sean A. Irvine
 */
public class A015916 extends Sequence1 {

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
  private long mN = 10;

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
      mSigmaJ = Functions.SIGMA1.z(++mN);
      if (mSigmaJ.equals(sigma.add(10))) {
        return Z.valueOf(mN - 10);
      }
    }
  }
}
