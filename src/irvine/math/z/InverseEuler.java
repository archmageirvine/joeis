package irvine.math.z;

import java.util.TreeSet;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.prime.Fast;

/**
 * Routines relating to inverting the Euler totient function.
  * @author Sean A. Irvine
 */
class InverseEuler {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mInverses = new TreeSet<>();

  /*
   * Recursively generates solutions to the equation euler(n) = m.
   * Generation of totients is based on the following observation:
   *
   * If a prime p|n and p|n^2, then euler(n) = p * euler(n/p),
   * else euler(n) = (p-1) * euler(n/p).
   *
   * @param m the current totient
   * @param n the current number
   */
  private void getInversePhi(final Z m, final Z n) {
    if (Z.ONE.equals(m)) {
      mInverses.add(n);
      // Note that if n is odd, euler(2*n) = euler(2)*euler(n) = euler(n).
      if (n.isOdd()) {
        mInverses.add(n.multiply2());
      }
      return;
    }
    // A totient can't be odd
    if (m.isOdd()) {
      return;
    }
    final Z[] primeFactors = mFactor.factorize(m).toZArray();
    final Z largestPrime = primeFactors[primeFactors.length - 1];
    final boolean divisibilityTest = n.mod(largestPrime).isZero();

    for (Z div : mFactor.factorize(m.divide(largestPrime)).divisors()) {
      div = div.multiply(largestPrime);
      // Case 2 of observation
      final Z div1 = div.add(1);
      if (mPrime.isPrime(div1) && !n.mod(div1).isZero()) {
        getInversePhi(m.divide(div), n.multiply(div1));
      }
      // Case 1 of observation (sort of)
      if (!divisibilityTest) {
        Z primePow = Z.ONE;
        while (div.mod(largestPrime).isZero()) {
          div = div.divide(largestPrime);
          primePow = primePow.multiply(largestPrime);
        }
        // euler(p^d * u) = p^(d-1) * (p-1) * euler(u) where gcd(p, u) = 1
        if (div.equals(largestPrime.subtract(1))) {
          getInversePhi(m.divide(div.multiply(primePow)), n.multiply(primePow).multiply(largestPrime));
        }
      }
    }
  }

  /**
   * Return the solutions to the equation euler(n) = m.
   * @param m euler value
   * @return set of values having given totient value
   */
  public TreeSet<Z> inversePhi(final Z m) {
    mInverses.clear();
    getInversePhi(m, Z.ONE);
    return mInverses;
  }
}

