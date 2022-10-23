package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015916 Numbers k such that sigma(k) + 10 = sigma(k+10).
 * @author Sean A. Irvine
 */
public class A015916 extends Sequence1 {

  private Z mSigmaA = Jaguar.factor(1).sigma();
  private Z mSigmaB = Jaguar.factor(2).sigma();
  private Z mSigmaC = Jaguar.factor(3).sigma();
  private Z mSigmaD = Jaguar.factor(4).sigma();
  private Z mSigmaE = Jaguar.factor(5).sigma();
  private Z mSigmaF = Jaguar.factor(6).sigma();
  private Z mSigmaG = Jaguar.factor(7).sigma();
  private Z mSigmaH = Jaguar.factor(8).sigma();
  private Z mSigmaI = Jaguar.factor(9).sigma();
  private Z mSigmaJ = Jaguar.factor(10).sigma();
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
      mSigmaJ = Jaguar.factor(++mN).sigma();
      if (mSigmaJ.equals(sigma.add(10))) {
        return Z.valueOf(mN - 10);
      }
    }
  }
}
