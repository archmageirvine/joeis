package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020152 Pseudoprimes to base 24.
 * @author Sean A. Irvine
 */
public class A020152 implements Sequence {

  private static final Z BASE = Z.valueOf(24);
  private Z mN = Z.valueOf(23);

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
