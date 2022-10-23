package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015915 Numbers k such that sigma(k) + 8 = sigma(k+8).
 * @author Sean A. Irvine
 */
public class A015915 extends Sequence1 {

  private Z mSigmaA = Jaguar.factor(1).sigma();
  private Z mSigmaB = Jaguar.factor(2).sigma();
  private Z mSigmaC = Jaguar.factor(3).sigma();
  private Z mSigmaD = Jaguar.factor(4).sigma();
  private Z mSigmaE = Jaguar.factor(5).sigma();
  private Z mSigmaF = Jaguar.factor(6).sigma();
  private Z mSigmaG = Jaguar.factor(7).sigma();
  private Z mSigmaH = Jaguar.factor(8).sigma();
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
      mSigmaH = Jaguar.factor(++mN).sigma();
      if (mSigmaH.equals(sigma.add(8))) {
        return Z.valueOf(mN - 8);
      }
    }
  }
}
