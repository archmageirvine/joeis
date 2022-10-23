package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020198 Pseudoprimes to base 70.
 * @author Sean A. Irvine
 */
public class A020198 extends Sequence1 {

  private static final Z BASE = Z.valueOf(70);
  private Z mN = Z.valueOf(67);

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
