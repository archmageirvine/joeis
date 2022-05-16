package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015861 Numbers k such that sigma(k) = sigma(k+3).
 * @author Sean A. Irvine
 */
public class A015861 implements Sequence {

  private Z mSigmaA = Jaguar.factor(1).sigma();
  private Z mSigmaB = Jaguar.factor(2).sigma();
  private Z mSigmaC = Jaguar.factor(3).sigma();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mSigmaA;
      mSigmaA = mSigmaB;
      mSigmaB = mSigmaC;
      mSigmaC = Jaguar.factor(++mN).sigma();
      if (mSigmaC.equals(sigma)) {
        return Z.valueOf(mN - 3);
      }
    }
  }
}
