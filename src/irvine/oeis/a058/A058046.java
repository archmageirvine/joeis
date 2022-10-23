package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058046 Numbers n such that 5^n - n is prime.
 * @author Sean A. Irvine
 */
public class A058046 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(25);
      mN += 2;
      if (mA.subtract(mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
