package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020203 Pseudoprimes to base 75.
 * @author Sean A. Irvine
 */
public class A020203 extends Sequence1 {

  private static final Z BASE = Z.valueOf(75);
  private Z mN = Z.valueOf(73);

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
