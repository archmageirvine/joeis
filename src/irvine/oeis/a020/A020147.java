package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020147.
 * @author Sean A. Irvine
 */
public class A020147 implements Sequence {

  private static final Z BASE = Z.valueOf(19);
  private Z mN = Z.FIVE;

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
