package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A395636 a(n) = number of triples (x, y, z) such that 2*x^2 + y*z = n, where x, y, z are distinct primes satisfying y &lt; z.
 * @author Sean A. Irvine
 */
public class A395636 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mN = 8;

  /** Construct the sequence. */
  public A395636() {
    super(23);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long cnt = 0;
      for (long p = 2; 2 * p * p < mN; p = mPrime.nextPrime(p)) {
        if (mN % p != 0) {
          final long m = mN - 2 * p * p;
          if (!Predicates.SQUARE.is(m) && Predicates.SEMIPRIME.is(m)) {
            ++cnt;
          }
        }
      }
      if (mN >= 23) {
        return Z.valueOf(cnt);
      }
    }
  }
}
