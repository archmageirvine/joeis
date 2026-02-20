package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079015 Primes introducing consecutive prime 6-tuple of primes or 5-tuple corresponding consecutive p-difference pattern as follows: {d, 2*d, 4*d, 8*d, 16*d}.
 * @author Sean A. Irvine
 */
public class A079015 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final long mM;
  private long mP = 2;

  protected A079015(final long m) {
    mM = m;
  }

  /** Construct the sequence. */
  public A079015() {
    this(5);
  }

  private boolean is(final long p, final long n) {
    long q = p;
    for (long k = 0, d = 2; k < n; ++k, d += 1L << (k + 1)) {
      q = mPrime.nextPrime(q);
      if (q - p != d) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (is(mP, mM)) {
        return Z.valueOf(mP);
      }
    }
  }
}
