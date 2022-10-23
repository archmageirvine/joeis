package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020187 Pseudoprimes to base 59.
 * @author Sean A. Irvine
 */
public class A020187 extends Sequence1 {

  private static final Z BASE = Z.valueOf(59);
  private Z mN = Z.valueOf(14);

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
