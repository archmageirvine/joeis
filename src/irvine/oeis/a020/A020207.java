package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020207 Pseudoprimes to base 79.
 * @author Sean A. Irvine
 */
public class A020207 implements Sequence {

  private static final Z BASE = Z.valueOf(79);
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
