package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015882 Numbers k such that sigma(k) = sigma(k+12).
 * @author Sean A. Irvine
 */
public class A015882 implements Sequence {

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
  private Z mSigmaK = Jaguar.factor(11).sigma();
  private Z mSigmaL = Jaguar.factor(12).sigma();
  private long mN = 12;

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
      mSigmaJ = mSigmaK;
      mSigmaK = mSigmaL;
      mSigmaL = Jaguar.factor(++mN).sigma();
      if (mSigmaL.equals(sigma)) {
        return Z.valueOf(mN - 12);
      }
    }
  }
}
