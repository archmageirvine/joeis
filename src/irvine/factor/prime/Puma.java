package irvine.factor.prime;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * Provides cached indexed access to prime numbers.
 * @author Sean A. Irvine
 */
public final class Puma {

  private Puma() { }

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

}
