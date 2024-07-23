package irvine.oeis.a117;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A117078 a(n) is the smallest k such that prime(n+1) = prime(n) + (prime(n) mod k), or 0 if no such k exists.
 * @author Georg Fischer
 */
public class A117078 extends AbstractSequence {

  protected final Fast mPrime = new Fast();
  protected Z mP1 = Z.TWO; // current prime

  protected A117078(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A117078() {
    this(1);
  }

  /**
   * Compute the weight and the gap of two successive primes.
   * @param p0 a prime
   * @param p1 the least prime &gt; <code>p0</code>
   * @return a pair (weight, gap)
   */
  protected Z[] compute(final Z p0, final Z p1) {
    final Z d = p1.subtract(p0);
    int k = 0;
    int j = 1;
    while (k == 0 && Z.valueOf(j).compareTo(p0) < 0) {
      if (!p0.modZ(j).equals(d)) {
        ++j;
      } else {
        k = j;
      }
    }
    return new Z[] {Z.valueOf(k), d};
  }

  @Override
  public Z next() {
    // previous prime
    final Z p0 = mP1;
    mP1 = mPrime.nextPrime(mP1);
    return compute(p0, mP1)[0];
  }
}
