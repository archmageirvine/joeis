package irvine.factor.factor;

import irvine.factor.prime.Feral;
import irvine.factor.prime.Prime;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * SingleStepPollard.java
 *
 * @author Sean A. Irvine
 */
public class SingleStepPollard extends AbstractFactorizer {

  /** The product of the primes less than b1 (can be *very* big) */
  private Z mLCM = Z.TWO;

  /**
   * Construct a new single step Pollard p-1 factoring object with the
   * specified smoothness bound.
   *
   * @param b1 smoothness bound
   */
  public SingleStepPollard(final long b1) {
    final Prime sieve = new Feral();
    long p = 2L;
    while ((p = sieve.nextPrime(p)) < b1) {
      mLCM = mLCM.multiply(Z.valueOf(p));
    }
  }

  @Override
  protected void factor(final FactorSequence fs, Z n) {
    final int exponent = fs.getExponent(n);
    //    final int status = fs.getStatus(n);
    fs.remove(n);
    n = AbstractFactorizer.handleEvenAndNegative(fs, n, exponent);
    if (n.equals(Z.ONE)) {
      return;
    }
    final Z g = Z.valueOf(3).modPow(mLCM, n).subtract(Z.ONE).gcd(n);
    if (g.compareTo(Z.ONE) > 0) {
      fs.add(g, FactorSequence.UNKNOWN, exponent);
    }
  }

  /**
   * Attempt to factor each of the supplied arguments, printing a sorted list of factors.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new SingleStepPollard(10000000), args);
  }

}
