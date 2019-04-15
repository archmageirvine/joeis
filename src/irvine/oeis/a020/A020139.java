package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020139 Pseudoprimes to base 11.
 * @author Sean A. Irvine
 */
public class A020139 implements Sequence {

  private static final Z BASE = Z.valueOf(11);
  private Z mN = Z.valueOf(9);

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
