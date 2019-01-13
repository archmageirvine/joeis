package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015916.
 * @author Sean A. Irvine
 */
public class A015916 implements Sequence {

  private Z mSigmaA = Cheetah.factor(1).sigma();
  private Z mSigmaB = Cheetah.factor(2).sigma();
  private Z mSigmaC = Cheetah.factor(3).sigma();
  private Z mSigmaD = Cheetah.factor(4).sigma();
  private Z mSigmaE = Cheetah.factor(5).sigma();
  private Z mSigmaF = Cheetah.factor(6).sigma();
  private Z mSigmaG = Cheetah.factor(7).sigma();
  private Z mSigmaH = Cheetah.factor(8).sigma();
  private Z mSigmaI = Cheetah.factor(9).sigma();
  private Z mSigmaJ = Cheetah.factor(10).sigma();
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
      mSigmaJ = Cheetah.factor(++mN).sigma();
      if (mSigmaJ.equals(sigma.add(10))) {
        return Z.valueOf(mN - 10);
      }
    }
  }
}
