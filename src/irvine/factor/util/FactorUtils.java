package irvine.factor.util;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
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
}
