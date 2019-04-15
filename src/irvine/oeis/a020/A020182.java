package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020182 Pseudoprimes to base 54.
 * @author Sean A. Irvine
 */
public class A020182 implements Sequence {

  private static final Z BASE = Z.valueOf(54);
  private Z mN = Z.valueOf(53);

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
