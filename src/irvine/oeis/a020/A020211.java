package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020211.
 * @author Sean A. Irvine
 */
public class A020211 implements Sequence {

  private static final Z BASE = Z.valueOf(83);
  private Z mN = Z.valueOf(19);

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
