package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A072971 Least k such that the last digit of prime(n+k) = last digit of prime(n) in base 10.
 * @author Sean A. Irvine
 */
public class A072971 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mP = 5;

  /** Construct the sequence. */
  public A072971() {
    super(4);
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long t = mP % 10;
    long q = mP;
    long k = 0;
    while (true) {
      ++k;
      q = mPrime.nextPrime(q);
      if (q % 10 == t) {
        return Z.valueOf(k);
      }
    }
  }
}

