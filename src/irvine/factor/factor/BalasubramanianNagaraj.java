package irvine.factor.factor;

import irvine.factor.prime.Feral;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * Detect if a number is a perfect power and if so factor it. Uses
 * the method described by R. Balasubramanian and S. V. Nagaraj in
 * `Perfect power testing', <i>Information Processing Letters</i>,
 * <b>58</b>, 59--63, 1996.
 *
 * @author Sean A. Irvine
 */
public class BalasubramanianNagaraj extends AbstractFactorizer {

  private static final Feral PRIMES = new Feral();

  /**
   * If this function returns false then n != x^p. However, if the
   * result is true then it only indicates that n might be a
   * perfect p-th power.
   *
   * @param n number to test
   * @param p proposed exponent
   * @param maxTests number of tests to make
   * @return false if n cannot possibly be a p-th power
   */
  private boolean sieveTest(final Z n, final long p, final int maxTests) {
    long q = 1L;
    for (int i = 0; i < maxTests; ++i) {
      do {
        q = PRIMES.nextPrime(q);
      } while (q % p != 1 || !n.gcd(Z.valueOf(q)).equals(Z.ONE));

      if (LongUtils.modPow(n.mod(q), (q - 1L) / p, q) != 1L) {
        return false;
      }
    }
    return true;
  }

  /**
   * Try and determine the exponent. If an exponent is found then recurse
   * to check for higher exponents.
   *
   * @param fs factor sequence
   * @param n number to factor
   * @param start lowest possible exponent for n
   */
  private void factorFromExponent(final FactorSequence fs, final Z n, final long start) {
    final int exponent = fs.getExponent(n);
    //    final int status = fs.getStatus(n);
    final int primeLimit = n.bitLength() + 1;
    final int smallLimit = (int) Math.sqrt(Math.log(primeLimit));
    long p = start;
    while (p <= primeLimit) {
      if (p <= smallLimit ? sieveTest(n, p, (int) Math.pow(primeLimit, 0.75)) : sieveTest(n, p, (int) Math.ceil(2.0 * Math.log(primeLimit) / Math.log(p)))) {
        // check p-th power
        final Z r = n.root((int) p);
        if (n.auxiliary() != 0) {
          fs.remove(n);
          fs.add(r, FactorSequence.UNKNOWN, exponent * (int) p);
          // recurse on higher powers
          factorFromExponent(fs, r, PRIMES.nextPrime(p));
          return;
        }
      }
      p = PRIMES.nextPrime(p);
    }
  }

  /**
   * Investigate the possibility that <code>n</code> is a perfect
   * power. If it is found to be the case then <code>n</code> is
   * factored by taking the appropriate root and inserting it
   * into the factor sequence.
   *
   * @param fs factor sequence containing <code>n</code>
   * @param n number to be factored
   */
  @Override
  protected void factor(final FactorSequence fs, Z n) {

    fs.remove(n);
    n = AbstractFactorizer.handleEvenAndNegative(fs, n, fs.getExponent(n));
    if (n.equals(Z.ONE)) {
      return;
    }
    fs.add(n);
    factorFromExponent(fs, n, 2L);
  }

  /**
   * Attempt to factor each of the supplied arguments.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {

    if (args.length == 0) {
      System.out.println("USAGE: BalasubramanianNagaraj n*");
    } else {
      final BalasubramanianNagaraj balasubramanianNagaraj = new BalasubramanianNagaraj();
      for (final String arg : args) {
        System.out.println("Trying: " + arg);
        try {
          final FactorSequence fs = new FactorSequence(new Z(arg));
          balasubramanianNagaraj.factor(fs);
          System.out.println(fs.toString());
        } catch (final NumberFormatException e) {
          System.out.println("Could not parse " + arg + " as a number.");
        }
      }
    }
  }
}
