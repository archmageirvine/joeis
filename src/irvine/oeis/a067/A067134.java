package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067134 Numbers n such that sigma(n+1) = 2*sigma(n-1).
 * @author Sean A. Irvine
 */
public class A067134 extends Sequence1 {

  private Z mSigmaA = Z.ONE;
  private Z mSigmaB = Z.THREE;
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z s = mSigmaA;
      mSigmaA = mSigmaB;
      mSigmaB = Jaguar.factor(++mN).sigma();
      if (mSigmaB.equals(s.multiply2())) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
