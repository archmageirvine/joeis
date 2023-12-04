package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067130 Numbers n such that sigma(n-1) divides sigma(n+1).
 * @author Sean A. Irvine
 */
public class A067130 extends Sequence1 {

  private Z mSigmaA = Z.ONE;
  private Z mSigmaB = Z.THREE;
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z s = mSigmaA;
      mSigmaA = mSigmaB;
      mSigmaB = Jaguar.factor(++mN).sigma();
      if (mSigmaB.mod(s).isZero()) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
