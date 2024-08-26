package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057879 Primes with 3 distinct digits that remain prime (no leading zeros allowed) after deleting all occurrences of any one of its distinct digits.
 * @author Sean A. Irvine
 */
public class A057879 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 131;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Integer.bitCount(Functions.SYNDROME.i(mP)) == 3 && A057876.is(String.valueOf(mP))) {
        return Z.valueOf(mP);
      }
    }
  }
}

