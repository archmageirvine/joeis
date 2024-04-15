package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015915 Numbers k such that sigma(k) + 8 = sigma(k+8).
 * @author Sean A. Irvine
 */
public class A015915 extends Sequence1 {

  private Z mSigmaA = Functions.SIGMA.z(1);
  private Z mSigmaB = Functions.SIGMA.z(2);
  private Z mSigmaC = Functions.SIGMA.z(3);
  private Z mSigmaD = Functions.SIGMA.z(4);
  private Z mSigmaE = Functions.SIGMA.z(5);
  private Z mSigmaF = Functions.SIGMA.z(6);
  private Z mSigmaG = Functions.SIGMA.z(7);
  private Z mSigmaH = Functions.SIGMA.z(8);
  private long mN = 8;

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
      mSigmaH = Functions.SIGMA.z(++mN);
      if (mSigmaH.equals(sigma.add(8))) {
        return Z.valueOf(mN - 8);
      }
    }
  }
}
