package irvine.oeis.a045;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045911 Neither a cube nor the sum of a nonnegative cube and a prime.
 * @author Sean A. Irvine
 */
public class A045911 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.EIGHT;

  private boolean isCube(final Z n) {
    n.root(3);
    return n.auxiliary() == 1;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mPrime.isPrime(mN) && !isCube(mN)) {
        boolean ok = true;
        for (Z p = Z.TWO; p.compareTo(mN) < 0; p = mPrime.nextPrime(p)) {
          if (isCube(mN.subtract(p))) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return mN;
        }
      }
    }
  }
}
