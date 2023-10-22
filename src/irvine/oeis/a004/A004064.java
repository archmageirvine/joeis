package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004064 Numbers k such that (12^k - 1)/11 is prime.
 * @author Sean A. Irvine
 */
public class A004064 extends Sequence1 {

  private Z mTwelves = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mTwelves = mTwelves.multiply(12);
      if (mTwelves.subtract(1).divide(11).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
