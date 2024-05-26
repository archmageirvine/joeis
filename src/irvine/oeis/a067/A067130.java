package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067130 Numbers k such that sigma(k-1) divides sigma(k+1).
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
      mSigmaB = Functions.SIGMA1.z(++mN);
      if (mSigmaB.mod(s).isZero()) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
