package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058037 Numbers n such that 3^n - n is prime.
 * @author Sean A. Irvine
 */
public class A058037 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(3);
      if (mA.subtract(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
