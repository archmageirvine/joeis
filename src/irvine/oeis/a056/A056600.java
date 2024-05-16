package irvine.oeis.a056;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A056600 a(n) is smallest number A such that there is an equality of the form (A=Product of n distinct primes) = (B=Product of n distinct primes) + (C=Product of n distinct primes) with gcd(A,B) = gcd(B,C) = gcd(A,C) = 1, B &lt; C.
 * @author Sean A. Irvine
 */
public class A056600 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mProducts = new TreeSet<>(); // keeps track of possibles
  private final TreeMap<Z, long[]> mMap = new TreeMap<>(); // keeps track of to be tried
  private int mN = 0;

  private void bump(final long[] primes) {
    for (int k = primes.length - 1; true; --k) {
      final long q = mPrime.nextPrime(primes[k]);
      if (k == 0 || q < primes[k - 1]) {
        primes[k] = q;
        return;
      }
      if (k == primes.length - 1) {
        primes[k] = 2;
      } else {
        primes[k] = mPrime.nextPrime(primes[k + 1]);
      }
    }
  }

  private Z product(final long... primes) {
    Z prod = Z.ONE;
    for (final long p : primes) {
      prod = prod.multiply(p);
    }
    return prod;
  }

  protected Z select(final Z a, final Z b) {
    return a;
  }

  @Override
  public Z next() {
    mProducts.clear();
    mMap.clear();
    final long[] primes = new long[++mN]; // decreasing ... 5, 3, 2
    primes[primes.length - 1] = 2;
    for (int k = primes.length - 2; k >= 0; --k) {
      primes[k] = mPrime.nextPrime(primes[k + 1]);
    }
    mMap.put(product(primes), primes);
    while (true) {
      // Get smallest unexplored product
      final Map.Entry<Z, long[]> e = mMap.pollFirstEntry();
      final Z prod = e.getKey();
      // Check if this product solves the problem
      for (final Z b : mProducts) {
        final Z c = prod.subtract(b);
        if (c.compareTo(b) < 0) {
          break;
        }
        if (mProducts.contains(c) && Z.ONE.equals(prod.gcd(b)) && Z.ONE.equals(prod.gcd(c)) && Z.ONE.equals(b.gcd(c))) {
          if (mVerbose) {
            StringUtils.message(prod + " = " + b + " + " + c);
          }
          return select(prod, b);
        }
      }
      // Update product in all possible ways
      final long[] vec = e.getValue();
      for (int k = 0; k < vec.length; ++k) {
        final long p = vec[k];
        final long q = mPrime.nextPrime(p);
        if (k == 0 || q < vec[k - 1]) {
          final long[] copy = Arrays.copyOf(vec, vec.length);
          copy[k] = q;
          mMap.put(prod.divide(p).multiply(q), copy);
        }
      }
      // Mark current product as available for future sums
      mProducts.add(prod);
      bump(primes);
    }
  }
}

