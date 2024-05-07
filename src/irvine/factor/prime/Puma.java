package irvine.factor.prime;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * Provides cached indexed access to prime numbers.
 * @author Sean A. Irvine
 */
public final class Puma {

  private Puma() {
  }

  private static final Fast GENERATOR = new Fast();
  private static final LongDynamicLongArray PRIMES = new LongDynamicLongArray();
  private static final LongDynamicLongArray PRIME_PI = new LongDynamicLongArray();

  static {
    PRIMES.set(0, 1L);
    PRIME_PI.set(2, 1L);
  }

  /**
   * Return the nth prime number, or 1 if n is 0.
   * @param n index of desired prime
   * @return prime
   */
  public static long prime(final long n) {
    if (PRIMES.get(n) == 0) {
      for (long m = PRIMES.length(), p = PRIMES.get(m - 1); m <= n; ++m) {
        p = GENERATOR.nextPrime(p);
        PRIMES.set(m, p);
      }
    }
    return PRIMES.get(n);
  }

  /**
   * Return the nth prime number, or 1 if n is 0.
   * @param n index of desired prime
   * @return prime
   */
  public static long prime(final Z n) {
    return prime(n.longValueExact());
  }

  /**
   * Return the nth prime number, or 1 if n is 0.
   * @param n index of desired prime
   * @return prime
   */
  public static Z primeZ(final long n) {
    return Z.valueOf(prime(n));
  }

  /**
   * Return the nth prime number, or 1 if n is 0.
   * @param n index of desired prime
   * @return prime
   */
  public static Z primeZ(final Z n) {
    return Z.valueOf(prime(n));
  }

  /**
   * Return the number of primes less than or equal to n.
   * @param n index
   * @return number of primes less than or equal to n
   */
  public static long primePi(final long n) {
    if (n < 2) {
      return 0;
    }
    if (PRIME_PI.get(n) == 0) {
      for (long m = PRIME_PI.length(), pi = PRIME_PI.get(m - 1); m <= n; ++m) {
        if (GENERATOR.isPrime(m)) {
          ++pi;
        }
        PRIME_PI.set(m, pi);
      }
    }
    return PRIME_PI.get(n);
  }

  /**
   * Return the number of primes less than or equal to n.
   * @param n index
   * @return number of primes less than or equal to n
   */
  public static long primePi(final Z n) {
    return primePi(n.longValueExact());
  }

  /**
   * Return the number of primes less than or equal to n.
   * @param n index
   * @return number of primes less than or equal to n
   */
  public static Z primePiZ(final long n) {
    return Z.valueOf(primePi(n));
  }

  /**
   * Return the number of primes less than or equal to n.
   * @param n index
   * @return number of primes less than or equal to n
   */
  public static Z primePiZ(final Z n) {
    return Z.valueOf(primePi(n));
  }

  /**
   * Return the least prime behind p.
   * @param p source prime
   * @return prime behind p
   */
  public static long nextPrime(final long p) {
    return GENERATOR.nextPrime(p);
  }

  /**
   * Return the least prime behind p.
   * @param p source prime
   * @return prime behind p
   */
  public static long nextPrime(final Z p) {
    return GENERATOR.nextPrime(p).longValueExact();
  }

  /**
   * Return the least prime behind p.
   * @param p source prime
   * @return prime behind p
   */
  public static Z nextPrimeZ(final Z p) {
    return GENERATOR.nextPrime(p);
  }

  /**
   * Return the greatest prime before p.
   * @param p source prime
   * @return prime before p, or 1 if n = 2.
   */
  public static long prevPrime(final long p) {
    return GENERATOR.prevPrime(p);
  }

  /**
   * Return the greatest prime before p.
   * @param p source prime
   * @return prime before p, or 1 if p = 2.
   */
  public static long prevPrime(final Z p) {
    return GENERATOR.prevPrime(p).longValueExact();
  }

  /**
   * Return the greatest prime before p.
   * @param p source prime
   * @return prime before p, or 1 if p = 2.
   */
  public static Z prevPrimeZ(final Z p) {
    return GENERATOR.prevPrime(p);
  }

  /**
   * Tells whether the parameter is a prime-indexed prime (A006450).
   * @param p source prime
   * @return true iff p is in A006450.
   */
  public static boolean isPrimeIndexed(final Z p) {
    return Puma.primePiZ(p).isProbablePrime();
  }

  /**
   * Return the smallest prime starting with the specified value where
   * the additional part does not start with the prohibited value.
   * @param n prefix
   * @param prohibited prohibited extension
   * @param allowEmpty don't extend if <code>n</code> is already prime
   * @return smallest such prime
   */
  public static Z smallestPrimeBeginningWith(final String n, final String prohibited, final boolean allowEmpty) {
    if (n.isEmpty()) {
      return "2".equals(prohibited) ? Z.THREE : Z.TWO;
    }
    Z t = new Z(n);
    if (t.isZero() && !"2".equals(prohibited)) {
      return Z.TWO; // only possible even case
    }
    if (allowEmpty && t.isProbablePrime()) {
      return t;
    }
    long k = -1;
    long oldLim = 1;
    long lim = 1;
    while (true) {
      k += 2;
      if (k >= lim) {
        oldLim = lim;
        lim *= 10;
        t = t.multiply(10);
        if (!"0".equals(prohibited)) {
          k = 1;
        }
      }
      final Z u = t.add(k);
      if (u.isProbablePrime() && (k < oldLim || !String.valueOf(k).startsWith(prohibited))) {
        return u;
      }
    }
  }

  /**
   * Smallest prime ending with a given value
   * @param n suffix
   * @param allowEmpty don't extend if the suffix is already prime
   * @return smallest such prime
   */
  public static Z smallestPrimeEndingWith(final Z n, final boolean allowEmpty) {
    if (allowEmpty && n.isProbablePrime()) {
      return n;
    }
    if (n.isEven() || n.mod(10) == 5) {
      return null; // impossible
    }
    Z mul = Z.ONE;
    while (n.compareTo(mul) >= 0) {
      mul = mul.multiply(10);
    }
    Z k = mul;
    while (true) {
      final Z u = k.add(n);
      if (u.isProbablePrime()) {
        return u;
      }
      k = k.add(mul);
    }
  }
}
