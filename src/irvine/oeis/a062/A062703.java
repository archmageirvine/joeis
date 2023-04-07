package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062703 Squares that are the sum of two consecutive primes.
 * @author Sean A. Irvine
 */
public class A062703 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = mPrime.nextPrime(mP);
      final Z s = q.add(mP);
      if (s.isSquare()) {
        return s;
      }
    }
  }
}
