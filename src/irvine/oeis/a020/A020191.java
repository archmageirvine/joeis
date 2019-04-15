package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020191.
 * @author Sean A. Irvine
 */
public class A020191 implements Sequence {

  private static final Z BASE = Z.valueOf(63);
  private Z mN = Z.valueOf(61);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (BASE.modPow(mN.subtract(1), mN).equals(Z.ONE) && !mN.isPrime()) {
        return mN;
      }
    }
  }
}
