package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004062 Numbers k such that (6^k - 1)/5 is prime.
 * @author Sean A. Irvine
 */
public class A004062 extends Sequence1 {

  private Z mSixes = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSixes = mSixes.multiply(6);
      if (mSixes.subtract(1).divide(5).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
