package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005808 Numbers k such that (11^k - 1)/10 is prime.
 * @author Sean A. Irvine
 */
public class A005808 extends Sequence1 {

  private Z mA = Z.valueOf(11);
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(11);
      ++mN;
      if (mA.subtract(1).divide(10).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
