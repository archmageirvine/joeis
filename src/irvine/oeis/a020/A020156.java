package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020156 Pseudoprimes to base 28.
 * @author Sean A. Irvine
 */
public class A020156 implements Sequence {

  private static final Z BASE = Z.valueOf(28);
  private Z mN = Z.SEVEN;

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
