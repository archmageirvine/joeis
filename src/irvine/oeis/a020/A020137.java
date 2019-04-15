package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020137 Pseudoprimes to base 8.
 * @author Sean A. Irvine
 */
public class A020137 implements Sequence {

  private Z mN = Z.valueOf(7);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (Z.EIGHT.modPow(mN.subtract(1), mN).equals(Z.ONE) && !mN.isPrime()) {
        return mN;
      }
    }
  }
}
