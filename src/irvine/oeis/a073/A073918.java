package irvine.oeis.a073;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073918 Smallest prime which is 1 more than a product of n distinct primes: a(n) is a prime and a(n) - 1 is a squarefree number with n prime factors.
 * @author Sean A. Irvine
 */
public class A073918 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    final long[] primes = new long[mN];
    primes[0] = 2;
    Z prod = Z.TWO;
    for (int k = 1; k < mN; ++k) {
      primes[k] = mPrime.nextPrime(primes[k - 1]);
      prod = prod.multiply(primes[k]);
    }
    final TreeMap<Z, long[]> m = new TreeMap<>();
    m.put(prod, primes);
    while (true) {
      final Map.Entry<Z, long[]> e = m.pollFirstEntry();
      final Z pr = e.getKey();
      if (pr.add(1).isProbablePrime()) {
        return pr.add(1);
      }
      final long[] vec = e.getValue();
      // vec[0] always remains 2
      for (int k = 1; k < vec.length; ++k) {
        final long q = mPrime.nextPrime(vec[k]);
        if (k == vec.length - 1 || q < vec[k + 1]) {
          final long[] v = Arrays.copyOf(vec, vec.length);
          v[k] = q;
          m.put(pr.divide(vec[k]).multiply(q), v);
        }
      }
    }
  }
}

