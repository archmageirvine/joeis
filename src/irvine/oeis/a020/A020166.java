package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020166 Pseudoprimes to base 38.
 * @author Sean A. Irvine
 */
public class A020166 implements Sequence {

  private static final Z BASE = Z.valueOf(38);
  private Z mN = Z.valueOf(37);

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
