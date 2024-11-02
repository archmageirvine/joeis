package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064397 Numbers k such that prime(k) + prime(k+1) is a square.
 * @author Sean A. Irvine
 */
public class A064397 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final int mCountOfPrimes;
  private long mN = 0;
  private long mP = 1;

  protected A064397(final int countOfPrimes) {
    mCountOfPrimes = countOfPrimes;
  }

  /** Construct the sequence. */
  public A064397() {
    this(2);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      long sum = mP;
      long q = mP;
      for (int k = 1; k < mCountOfPrimes; ++k) {
        q = mPrime.nextPrime(q);
        sum += q;
      }
      if (Predicates.SQUARE.is(sum)) {
        return Z.valueOf(mN);
      }
    }
  }
}

