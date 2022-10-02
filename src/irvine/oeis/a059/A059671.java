package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059671 Numbers n such that n*10^n - 1 is prime.
 * @author Sean A. Irvine
 */
public class A059671 implements Sequence {

  private Z mA = Z.TEN;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(10);
      if (mA.multiply(++mN).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
