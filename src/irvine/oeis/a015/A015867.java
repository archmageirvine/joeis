package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015867 Numbers n such that sigma(n) = sigma(n + 7).
 * @author Sean A. Irvine
 */
public class A015867 implements Sequence {

  private Z mSigmaA = Cheetah.factor(1).sigma();
  private Z mSigmaB = Cheetah.factor(2).sigma();
  private Z mSigmaC = Cheetah.factor(3).sigma();
  private Z mSigmaD = Cheetah.factor(4).sigma();
  private Z mSigmaE = Cheetah.factor(5).sigma();
  private Z mSigmaF = Cheetah.factor(6).sigma();
  private Z mSigmaG = Cheetah.factor(7).sigma();
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
      mSigmaG = Cheetah.factor(++mN).sigma();
      if (mSigmaG.equals(sigma)) {
        return Z.valueOf(mN - 7);
      }
    }
  }
}
