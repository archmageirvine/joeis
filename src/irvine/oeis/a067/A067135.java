package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067135 Numbers k such that sigma(k+2) = 2*sigma(k-2).
 * @author Sean A. Irvine
 */
public class A067135 extends Sequence1 {

  private final Z[] mSigma = {Z.ONE, Z.THREE, Z.FOUR, Z.SEVEN};
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z s = mSigma[0];
      System.arraycopy(mSigma, 1, mSigma, 0, mSigma.length - 1);
      mSigma[3] = Functions.SIGMA1.z(++mN);
      if (mSigma[3].equals(s.multiply2())) {
        return Z.valueOf(mN - 2);
      }
    }
  }
}
