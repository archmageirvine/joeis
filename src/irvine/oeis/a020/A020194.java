package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020194 Pseudoprimes to base 66.
 * @author Sean A. Irvine
 */
public class A020194 extends Sequence1 {

  private static final Z BASE = Z.valueOf(66);
  private Z mN = Z.valueOf(63);

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
