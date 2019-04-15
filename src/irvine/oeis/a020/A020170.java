package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020170 Pseudoprimes to base 42.
 * @author Sean A. Irvine
 */
public class A020170 implements Sequence {

  private static final Z BASE = Z.valueOf(42);
  private Z mN = Z.valueOf(203);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (BASE.modPow(mN.subtract(1), mN).equals(Z.ONE) && !mN.isPrime()) {
        return mN;
      }
    }
  }
}
