package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015915 Numbers k such that sigma(k) + 8 = sigma(k+8).
 * @author Sean A. Irvine
 */
public class A015915 implements Sequence {

  private Z mSigmaA = Cheetah.factor(1).sigma();
  private Z mSigmaB = Cheetah.factor(2).sigma();
  private Z mSigmaC = Cheetah.factor(3).sigma();
  private Z mSigmaD = Cheetah.factor(4).sigma();
  private Z mSigmaE = Cheetah.factor(5).sigma();
  private Z mSigmaF = Cheetah.factor(6).sigma();
  private Z mSigmaG = Cheetah.factor(7).sigma();
  private Z mSigmaH = Cheetah.factor(8).sigma();
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
      mSigmaH = Cheetah.factor(++mN).sigma();
      if (mSigmaH.equals(sigma.add(8))) {
        return Z.valueOf(mN - 8);
      }
    }
  }
}
