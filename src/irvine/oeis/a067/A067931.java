package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067931 Numbers k that divide the alternating sum sigma(1) - sigma(2) + sigma(3) - sigma(4) + ... + ((-1)^(k+1))*sigma(k).
 * @author Sean A. Irvine
 */
public class A067931 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Jaguar.factor(++mN).sigma();
      mSum = mSum.signedAdd((mN & 1) == 1, sigma);
      if (mSum.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
