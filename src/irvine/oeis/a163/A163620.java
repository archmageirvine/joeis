package irvine.oeis.a163;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A163620 Let q(p) be the smallest prime greater than the prime p. a(n) is the smallest integer &gt; n that is divisible by each q(p) for all primes p dividing n.
 * @author Sean A. Irvine
 */
public class A163620 implements Sequence {

  private long mN = 2;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z n = Z.valueOf(mN++);
    Z q = Z.ONE;
    for (final Z t : Jaguar.factor(n).toZArray()) {
      q = q.multiply(mPrime.nextPrime(t));
    }
    final Z a = q;
    // Rare constraint that must exceed n
    while (q.compareTo(n) <= 0) {
      q = q.add(a);
    }
    return q;
  }
}

