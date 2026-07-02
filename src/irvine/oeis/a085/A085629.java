package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085629 Let b(n) equal the product of the exponents in the prime factorization of n. Then a(n) gives the least k such that b(k) = n.
 * @author Sean A. Irvine
 */
public class A085629 extends Sequence1 {

  // After David Wasserman

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private Z f(final long n, final Z p) {
    Z best = p.pow(n);
    for (final Z dd : Jaguar.factor(n).divisorsSorted()) {
      final long d = dd.longValue();
      if (d != 1 && d != n) {
        best = best.min(p.pow(d).multiply(f(n / d, mPrime.nextPrime(p))));
      }
    }
    return best;
  }

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : f(mN, Z.TWO);
  }
}
