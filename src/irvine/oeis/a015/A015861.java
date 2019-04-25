package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015861 Numbers n such that <code>sigma(n) = sigma(n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A015861 implements Sequence {

  private Z mSigmaA = Cheetah.factor(1).sigma();
  private Z mSigmaB = Cheetah.factor(2).sigma();
  private Z mSigmaC = Cheetah.factor(3).sigma();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mSigmaA;
      mSigmaA = mSigmaB;
      mSigmaB = mSigmaC;
      mSigmaC = Cheetah.factor(++mN).sigma();
      if (mSigmaC.equals(sigma)) {
        return Z.valueOf(mN - 3);
      }
    }
  }
}
