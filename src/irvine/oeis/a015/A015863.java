package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015863 Numbers n such that sigma(n) = sigma(n + 4).
 * @author Sean A. Irvine
 */
public class A015863 implements Sequence {

  private Z mSigmaA = Cheetah.factor(1).sigma();
  private Z mSigmaB = Cheetah.factor(2).sigma();
  private Z mSigmaC = Cheetah.factor(3).sigma();
  private Z mSigmaD = Cheetah.factor(4).sigma();
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mSigmaA;
      mSigmaA = mSigmaB;
      mSigmaB = mSigmaC;
      mSigmaC = mSigmaD;
      mSigmaD = Cheetah.factor(++mN).sigma();
      if (mSigmaD.equals(sigma)) {
        return Z.valueOf(mN - 4);
      }
    }
  }
}
