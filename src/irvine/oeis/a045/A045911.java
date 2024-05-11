package irvine.oeis.a045;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045911 Neither a cube nor the sum of a nonnegative cube and a prime.
 * @author Sean A. Irvine
 */
public class A045911 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.EIGHT;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mPrime.isPrime(mN) && !Predicates.CUBE.is(mN)) {
        boolean ok = true;
        for (Z p = Z.TWO; p.compareTo(mN) < 0; p = mPrime.nextPrime(p)) {
          if (Predicates.CUBE.is(mN.subtract(p))) {
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
