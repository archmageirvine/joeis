package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020224 Pseudoprimes to base 96.
 * @author Sean A. Irvine
 */
public class A020224 extends Sequence1 {

  private static final Z BASE = Z.valueOf(96);
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
