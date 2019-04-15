package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020227 Pseudoprimes to base 99.
 * @author Sean A. Irvine
 */
public class A020227 implements Sequence {

  private static final Z BASE = Z.valueOf(99);
  private Z mN = Z.valueOf(13);

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
