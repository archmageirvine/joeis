package irvine.oeis.a117;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A117078 a(n) is the smallest k such that prime(n+1) = prime(n) + (prime(n) mod k), or 0 if no such k exists.
 * @author Georg Fischer
 */
public class A117078 extends AbstractSequence {

  private int mN;
  private final Fast mPrime = new Fast();
  private Z mP1; // current prime
  private Z mP0; // previous prime

  /** Construct the sequence. */
  public A117078() {
    super(1);
    mN = 0;
    mP1 = Z.TWO;
  }

  /**
   * Compute the weigth and the gap of two successive primes.
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

  // {m=78; for(n=1, m, p=prime(n); d=prime(n+1)-p; k=0; j=1; while(k==0&&j<p, if(p%j!=d, j++, k=j)); print1(k, ", "))}
  @Override
  public Z next() {
    ++mN;
    mP0 = mP1;
    mP1 = mPrime.nextPrime(mP1);
    return compute(mP0, mP1)[0];
  }
}
