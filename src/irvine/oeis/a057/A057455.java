package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057455 n*M31 - 1 is prime, where M31 = 2^31 - 1.
 * @author Sean A. Irvine
 */
public class A057455 implements Sequence {

  private static final Z M31 = Z.ONE.shiftLeft(31).subtract(1);
  private long mN = 88;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (M31.multiply(mN).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
