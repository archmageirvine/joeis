package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067816 Numbers n such that sigma(n+1) - sigma(n) = n + 1.
 * @author Sean A. Irvine
 */
public class A067816 extends Sequence1 {

  private long mN = 0;
  private Z mSigma = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = mSigma;
      mSigma = Jaguar.factor(++mN + 1).sigma();
      if (mSigma.subtract(t).equals(Z.valueOf(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
