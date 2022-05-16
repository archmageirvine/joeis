package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015914 Numbers k such that sigma(k) + 6 = sigma(k+6).
 * @author Sean A. Irvine
 */
public class A015914 implements Sequence {

  private Z mSigmaA = Jaguar.factor(1).sigma();
  private Z mSigmaB = Jaguar.factor(2).sigma();
  private Z mSigmaC = Jaguar.factor(3).sigma();
  private Z mSigmaD = Jaguar.factor(4).sigma();
  private Z mSigmaE = Jaguar.factor(5).sigma();
  private Z mSigmaF = Jaguar.factor(6).sigma();
  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mSigmaA;
      mSigmaA = mSigmaB;
      mSigmaB = mSigmaC;
      mSigmaC = mSigmaD;
      mSigmaD = mSigmaE;
      mSigmaE = mSigmaF;
      mSigmaF = Jaguar.factor(++mN).sigma();
      if (mSigmaF.equals(sigma.add(6))) {
        return Z.valueOf(mN - 6);
      }
    }
  }
}
