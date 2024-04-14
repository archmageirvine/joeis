package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057881 Primes with 5 distinct digits that remain prime (no leading zeros allowed) after deleting all occurrences of its digits d.
 * @author Sean A. Irvine
 */
public class A057881 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mP = 37000;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Integer.bitCount(Functions.SYNDROME.i(mP)) == 5 && A057876.is(String.valueOf(mP))) {
        return Z.valueOf(mP);
      }
    }
  }
}

