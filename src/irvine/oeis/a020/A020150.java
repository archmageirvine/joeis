package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020150 Pseudoprimes to base 22.
 * @author Sean A. Irvine
 */
public class A020150 implements Sequence {

  private static final Z BASE = Z.valueOf(22);
  private Z mN = Z.valueOf(19);

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
