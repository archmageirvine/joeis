package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058829 Numbers n such that 6^n - n is prime.
 * @author Sean A. Irvine
 */
public class A058829 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(6);
      if (mA.subtract(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
