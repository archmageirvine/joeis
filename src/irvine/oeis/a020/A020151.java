package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020151 Pseudoprimes to base 23.
 * @author Sean A. Irvine
 */
public class A020151 extends Sequence1 {

  private static final Z BASE = Z.valueOf(23);
  private Z mN = Z.valueOf(21);

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
