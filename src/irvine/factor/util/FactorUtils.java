package irvine.factor.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Factorization utilities.
 * @author Sean A. Irvine
 */
public final class FactorUtils {

  private FactorUtils() { }

  private static final Fast PRIME = new Fast();

  /**
   * Return the number corresponding to a prime signature.
   * @param signature signature of number.
   * @return number with given signature
   */
  public static Z signatureToZ(final int[] signature) {
    Z prod = Z.ONE;
    Z p = Z.TWO;
    for (int k = signature.length - 1; k >= 0; --k) {
      prod = prod.multiply(p.pow(signature[k]));
      p = PRIME.nextPrime(p);
    }
    return prod;
  }

  /**
   * Return the prime signature of the number.
   * @param n number to get prime signature for
   * @return least number with same prime signature
   */
  public static int[] primeSignature(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    final int[] signature = new int[fs.omega()];
    int j = 0;
    for (final Z p : fs.toZArray()) {
      signature[j++] = fs.getExponent(p);
    }
    return signature;
  }

  /**
   * Return the prime signature of the number.
   * @param n number to get prime signature for
   * @return least number with same prime signature
   */
  public static int[] sortedPrimeSignature(final Z n) {
    final int[] signature = primeSignature(n);
    Arrays.sort(signature);
    return signature;
  }

  /**
   * Return the smallest number have the same prime signature as the given number.
   * @param n number to get corresponding least prime signature for
   * @return least number with same prime signature
   */
  public static Z leastPrimeSignature(final Z n) {
    final int[] signature = primeSignature(n);
    Arrays.sort(signature);
    return signatureToZ(signature);
  }

  /**
   * Return the smallest number have the same prime signature as the given number.
   * @param n number to get corresponding least prime signature for
   * @return least number with same prime signature
   */
  public static Z leastPrimeSignature(final long n) {
    return leastPrimeSignature(Z.valueOf(n));
  }

  /**
   * Concatenate the non-trivial divisors of the given number.
   * @param n number to evaluate
   * @return concatenation of non-trivial divisors
   */
  public static Z concatenateDivisors(final Z n) {
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      if (!d.equals(n) && !Z.ONE.equals(d)) {
        sb.append(d);
      }
    }
    return new Z(sb);
  }

  /**
   * Return the anti-divisors of a number
   * @param n number
   * @return anti-divisors
   */
  public static List<Long> antidivisors(final long n) {
    final List<Long> res = new ArrayList<>();
    for (long k = 2; k < n; ++k) {
      if (Math.abs(2 * (n % k) - k) < 2) {
        res.add(k);
      }
    }
    return res;
  }

  /**
   * Return a sorted list of the unitary divisors of a number.
   * @param n number
   * @return unitary divisors
   */
  public static List<Z> unitaryDivisors(final long n) {
    final List<Z> lst = new ArrayList<>();
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (Functions.GCD.l(d, n / d.longValueExact()) == 1) {
        lst.add(d);
      }
    }
    Collections.sort(lst);
    return lst;
  }

  /**
   * Return the bi-unitary divisors of n.
   * @param n number
   * @return bi-unitary divisors
   */
  public static List<Long> biunitaryDivisors(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    final List<Long> res = new ArrayList<>();
    res.add(1L);
    for (final Z pz : fs.toZArray()) {
      final long p = pz.longValue();
      final int e = fs.getExponent(pz);
      final List<Long> next = new ArrayList<>();
      for (final long d : res) {
        long pe = 1;
        for (int k = 0; k <= e; ++k) {
          // Skip the forbidden exponent e/2 when e is even
          if ((e & 1) == 0 && k == e >> 1) {
            pe *= p;
            continue;
          }
          next.add(d * pe);
          pe *= p;
        }
      }
      res.clear();
      res.addAll(next);
    }
    Collections.sort(res);
    return res;
  }
}
