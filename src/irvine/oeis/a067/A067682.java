package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067682 Floor((11/10)^n) is prime.
 * @author Sean A. Irvine
 */
public class A067682 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(11);
      mB = mB.multiply(10);
      if (mA.divide(mB).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
