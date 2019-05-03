package irvine.oeis.a163;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A163620 Let <code>q(p)</code> be the smallest prime greater than the prime p. <code>a(n)</code> is the smallest integer <code>&gt; n</code> that is divisible by each <code>q(p)</code> for all primes p dividing n.
 * @author Sean A. Irvine
 */
public class A163620 implements Sequence {

  private long mN = 2;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z n = Z.valueOf(mN++);
    Z q = Z.ONE;
    for (final Z t : Cheetah.factor(n).toZArray()) {
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

