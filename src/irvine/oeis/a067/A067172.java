package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067172 Numbers k such that sigma(k-2) + sigma(k+2) = sigma(2k).
 * @author Sean A. Irvine
 */
public class A067172 extends Sequence1 {

  private final Z[] mSigma = {Z.ONE, Z.THREE, Z.FOUR, Z.SEVEN};
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z s = mSigma[0];
      System.arraycopy(mSigma, 1, mSigma, 0, mSigma.length - 1);
      mSigma[3] = Functions.SIGMA1.z(++mN);
      if (s.add(mSigma[3]).equals(Functions.SIGMA1.z(2 * mN - 4))) {
        return Z.valueOf(mN - 2);
      }
    }
  }
}
