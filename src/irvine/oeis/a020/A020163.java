package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020163 Pseudoprimes to base 35.
 * @author Sean A. Irvine
 */
public class A020163 implements Sequence {

  private static final Z BASE = Z.valueOf(35);
  private Z mN = Z.EIGHT;

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
