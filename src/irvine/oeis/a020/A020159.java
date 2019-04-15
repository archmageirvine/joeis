package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020159 Pseudoprimes to base 31.
 * @author Sean A. Irvine
 */
public class A020159 implements Sequence {

  private static final Z BASE = Z.valueOf(31);
  private Z mN = Z.FIVE;

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
