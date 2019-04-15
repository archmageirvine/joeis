package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020153 Pseudoprimes to base 25.
 * @author Sean A. Irvine
 */
public class A020153 implements Sequence {

  private static final Z BASE = Z.valueOf(25);
  private Z mN = Z.THREE;

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
