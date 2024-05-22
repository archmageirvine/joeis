package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067129 Numbers n such that sigma(n-3) + sigma(n+3) = sigma(2n).
 * @author Sean A. Irvine
 */
public class A067129 extends Sequence1 {

  private final Z[] mSigma = {Z.ONE, Z.THREE, Z.FOUR, Z.SEVEN, Z.SIX, Z.valueOf(12)};
  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z s = mSigma[0];
      System.arraycopy(mSigma, 1, mSigma, 0, mSigma.length - 1);
      mSigma[5] = Functions.SIGMA1.z(++mN);
      if (s.add(mSigma[5]).equals(mSigma[2].multiply(3))) {
        return Z.valueOf(mN - 3);
      }
    }
  }
}
