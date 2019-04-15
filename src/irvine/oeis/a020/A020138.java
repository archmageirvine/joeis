package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020138.
 * @author Sean A. Irvine
 */
public class A020138 implements Sequence {

  private Z mN = Z.valueOf(3);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.NINE.modPow(mN.subtract(1), mN).equals(Z.ONE) && !mN.isPrime()) {
        return mN;
      }
    }
  }
}
