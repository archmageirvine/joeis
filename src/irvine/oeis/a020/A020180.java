package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020180 Pseudoprimes to base 52.
 * @author Sean A. Irvine
 */
public class A020180 extends Sequence1 {

  private static final Z BASE = Z.valueOf(52);
  private Z mN = Z.valueOf(49);

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
