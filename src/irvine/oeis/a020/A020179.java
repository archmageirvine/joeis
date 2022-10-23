package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020179 Pseudoprimes to base 51.
 * @author Sean A. Irvine
 */
public class A020179 extends Sequence1 {

  private static final Z BASE = Z.valueOf(51);
  private Z mN = Z.NINE;

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
