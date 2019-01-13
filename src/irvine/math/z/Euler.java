package irvine.math.z;

import java.util.Arrays;
import java.util.Set;

import irvine.factor.factor.Factorizer;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.IntegerUtils;

/**
 * Routines relating to the Euler totient function.
 *
 * @author Sean A. Irvine
 */
public class Euler {

  private static final Fast PRIME = new Fast();
  private static final Factorizer FACTOR = new PrimeDivision();

  /**
   * Compute the Euler phi function of an isolated integer.  This is
   * fast enough if you only want to do a few values.
   *
   * @param n number to compute phi of
   * @return Euler totient value
   * @exception UnsupportedOperationException if the computation fails.
   * @exception IllegalArgumentException if <code>n</code> in less than 1.
   * @exception NullPointerException if <code>n</code> is null.
   */
  public static Z phi(final Z n) {
    if (n.signum() < 1) {
      throw new IllegalArgumentException();
    }
    if (PRIME.isPrime(n)) {
      return n.subtract(Z.ONE);
    }
    final FactorSequence fs = new FactorSequence(n);
    FACTOR.factor(fs);
    if (!fs.isComplete()) {
      throw new UnsupportedOperationException();
    }
    Z phi = Z.ONE;
    for (final Z t : fs.toZArray()) {
      phi = phi.multiply(t.pow(fs.getExponent(t) - 1)).multiply(t.subtract(Z.ONE));
    }
    return phi;
  }

  private final int[] mPhi;

  /**
   * Precompute Euler phi function for all values up to the limit.  This will
   * use extreme memory for large limits. For isolated values used the static
   * method or <code>LongUtils.phi()</code>.
   *
   * @param limit largest value
   */
  public Euler(final int limit) {
    final int[] unfactored = new int[limit + 1];
    final int[] phi = new int[unfactored.length];
    Arrays.fill(phi, 1);
    for (int k = 0; k < unfactored.length; ++k) {
      unfactored[k] = k;
    }
    int p;
    for (p = 2; p <= IntegerUtils.sqrt(unfactored.length); ++p) {
      if (unfactored[p] != 1) {
        for (int k = p; k < unfactored.length; k += p) {
          unfactored[k] /= p;
          phi[k] *= p - 1;
          while (unfactored[k] % p == 0) {
            unfactored[k] /= p;
            phi[k] *= p;
          }
        }
      }
    }
    // Handle remaining large prime factors
    while (p < unfactored.length) {
      if (unfactored[p] != 1) {
        phi[p] *= unfactored[p] - 1;
      }
      ++p;
    }
    mPhi = phi;
  }

  /**
   * Return the totient of <code>n</code> assuming in range.
   *
   * @param n index
   * @return Euler totient value
   */
  public int phi(final int n) {
    return mPhi[n];
  }

  /**
   * Find solutions to the equation <code>phi(n) = m</code>.
   *
   * @param m euler value
   * @return set of solutions
   */
  public static Set<Z> inversePhi(final Z m) {
    return new InverseEuler().inversePhi(m);
  }
}

