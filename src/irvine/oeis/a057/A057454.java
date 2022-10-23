package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057454 n*M31 + 1 is prime, where M31 = 2^31 - 1.
 * @author Sean A. Irvine
 */
public class A057454 extends Sequence1 {

  private static final Z M31 = Z.ONE.shiftLeft(31).subtract(1);
  private long mN = 44;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (M31.multiply(mN).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
