package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002959 Numbers k such that 2*7^k - 1 is prime.
 * @author Sean A. Irvine
 */
public class A002959 extends Sequence1 {

  private Z mN = Z.TWO;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.multiply(7);
      mP = mP.add(1);
      if (mN.subtract(1).isProbablePrime()) {
        return mP;
      }
    }
  }
}
