package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015863 Numbers k such that sigma(k) = sigma(k+4).
 * @author Sean A. Irvine
 */
public class A015863 extends Sequence1 {

  private Z mSigmaA = Jaguar.factor(1).sigma();
  private Z mSigmaB = Jaguar.factor(2).sigma();
  private Z mSigmaC = Jaguar.factor(3).sigma();
  private Z mSigmaD = Jaguar.factor(4).sigma();
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mSigmaA;
      mSigmaA = mSigmaB;
      mSigmaB = mSigmaC;
      mSigmaC = mSigmaD;
      mSigmaD = Jaguar.factor(++mN).sigma();
      if (mSigmaD.equals(sigma)) {
        return Z.valueOf(mN - 4);
      }
    }
  }
}
