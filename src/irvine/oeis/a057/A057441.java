package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057441 n*M127 - 1 is prime, where M127 = 2^127 - 1.
 * @author Sean A. Irvine
 */
public class A057441 extends Sequence1 {

  private static final Z M127 = Z.ONE.shiftLeft(127).subtract(1);
  private long mN = 78;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (M127.multiply(mN).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
