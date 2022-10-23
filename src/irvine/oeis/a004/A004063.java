package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004063 Numbers k such that (7^k - 1)/6 is prime.
 * @author Sean A. Irvine
 */
public class A004063 extends Sequence1 {

  private Z mSevens = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSevens = mSevens.multiply(7);
      if (mSevens.subtract(1).divide(6).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
