package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058045 Numbers k such that (5^k + k)/3 is prime.
 * @author Sean A. Irvine
 */
public class A058045 implements Sequence {

  private long mN = -4;
  private long mAdd = 1;
  private Z mA = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mAdd = 6 - mAdd;
      mN += mAdd;
      if (mN > 1) {
        mA = mA.multiply(mAdd == 1 ? 5 : 3125);
      }
      if (mA.add(mN).divide(3).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
