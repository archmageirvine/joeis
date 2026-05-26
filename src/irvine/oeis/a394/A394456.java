package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.GilbreathTransformSequence;

/**
 * A394456 Odd integers k such that k+2 is prime and the sequence of primes congruent to 2 modulo k is strictly stable under iterated absolute differences (all leading entries equal k).
 * @author Sean A. Irvine
 */
public class A394456 extends Sequence1 {

  private static final int HEURISTIC_LIMIT = 1000;
  private final Fast mPrime = new Fast();
  private long mP = 3;

  private boolean is(final long m) {
    final GilbreathTransformSequence seq = new GilbreathTransformSequence(0, new Sequence0() {
      private Z mP = null;
      @Override
      public Z next() {
        if (mP == null) {
          mP = Z.TWO;
          return Z.TWO;
        }
        do {
          mP = mPrime.nextPrime(mP);
        } while (mP.mod(m) != 2);
        return mP;
      }
    });
    seq.next(); // skip 0th term
    for (int k = 1; k < HEURISTIC_LIMIT; ++k) {
      final Z t = seq.next();
      if (!t.equals(m)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long k = mP - 2;
      if (is(k)) {
        return Z.valueOf(k);
      }
    }
  }
}
