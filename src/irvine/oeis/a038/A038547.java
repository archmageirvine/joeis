package irvine.oeis.a038;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;
import irvine.util.array.DynamicLongArray;

/**
 * A038547 Least number with exactly n odd divisors.
 * @author Sean A. Irvine
 */
public class A038547 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final DynamicLongArray mPrimes = new DynamicLongArray();
  {
    mPrimes.set(0, start()); // We only want odd primes
  }
  private final DynamicArray<Z> mLeast = new DynamicArray<>();
  // Map Z value, int[] vector of exponents of small primes.
  // Exponents to satisfy e0 >= e1 >= e2 >= ...
  private final TreeMap<Z, int[]> mS = new TreeMap<>();
  {
    mS.put(Z.ONE, new int[0]);
  }
  private int mN = 0;

  private long prime(final int n) {
    while (mPrimes.get(n) == 0) {
      mPrimes.set(mPrimes.length(), mPrime.nextPrime(mPrimes.get(mPrimes.length() - 1)));
    }
    return mPrimes.get(n);
  }

  protected long start() {
    return 3;
  }

  @Override
  public Z next() {
    ++mN;
    while (mLeast.get(mN) == null) {
      final Map.Entry<Z, int[]> e = mS.pollFirstEntry();
      final Z m = e.getKey();
      final int[] v = e.getValue();

      // Explicitly construct the factorization sequence -- quicker than factoring m
      final FactorSequence fs = new FactorSequence();
      long p = 2;
      for (int k = 0; k < v.length; ++k, p = mPrime.nextPrime(p)) {
        if (v[k] != 0) {
          fs.add(p, FactorSequence.PRIME, v[k]);
        }
      }

      // Check if this is a result to retain
      final Z sigma0 = fs.sigma0();
      if (sigma0.bitLength() <= 31) {
        final int s0 = sigma0.intValueExact();
        if (mLeast.get(s0) == null) {
          mLeast.set(s0, m);
        }
      }

      // Extend by adding new small factors
      int k = v.length - 1;
      while (k > 0 && v[k] == 0) {
        --k;
      }
      if (v.length == 0) {
        mS.put(Z.valueOf(start()), new int[] {1});
      } else {
        for (; k < v.length; ++k) {
          if (k == 0 || v[k] + 1 <= v[k - 1]) { // Ensure exponents vectors satisfy e_i <= e_{i-1}
            final int[] t = Arrays.copyOf(v, v.length);
            ++t[k];
            mS.put(m.multiply(prime(k)), t);
          }
        }
        if (v[v.length - 1] != 0) {
          final int[] t = Arrays.copyOf(v, v.length + 1);
          t[v.length] = 1;
          mS.put(m.multiply(prime(k)), t);
        }
      }
    }
    return mLeast.get(mN);
  }
}
