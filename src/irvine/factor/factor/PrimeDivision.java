package irvine.factor.factor;

import irvine.factor.prime.Feral;
import irvine.factor.prime.Prime;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Attempt factorization by dividing n by each prime in turn. Processing
 * ends when the sieve exhausts its supply or primes, when <i>n</i> is completely
 * factored, or when all primes less the sqrt(<i>n</i>) have been tested.
 *
 * @author Sean A. Irvine
 */
public class PrimeDivision extends AbstractFactorizer {

  /** The sieve used to provide the prime numbers to test as factors */
  private static final Prime SIEVE = new Feral();

  /** Useful constant. */
  private static final Z MAX_LONG = Z.valueOf(Long.MAX_VALUE);

  private final long mSieveLimit;

  /**
   * Find factors up to specified size limit.
   * @param limit maximum factor to guarantee to find
   */
  public PrimeDivision(final long limit) {
    mSieveLimit = limit;
  }

  /** Factor. */
  public PrimeDivision() {
    this(0);
  }

  /**
   * Attempt factorization by dividing n by each prime in turn. Processing
   * ends when the sieve exhausts its supply or primes, when <i>n</i> is completely
   * factored, or when all primes less the sqrt(<i>n</i>) have been tested.
   *
   * @param fs factor sequence containing n
   * @param n number to factor
   */
  @Override
  protected void factor(final FactorSequence fs, Z n) {

    final int exponent = fs.getExponent(n);
    final int status = fs.getStatus(n);
    fs.remove(n);
    n = AbstractFactorizer.handleEvenAndNegative(fs, n, exponent);
    if (n.equals(Z.ONE) || n.isZero()) {
      return;
    }

    // handle odd part
    Z blimit = n.sqrt();
    long limit = blimit.compareTo(MAX_LONG) < 0 ? blimit.longValue() : Long.MAX_VALUE;
    if (mSieveLimit != 0) {
      limit = Math.min(limit, mSieveLimit);
    }
    long p = 3;
    while (p != 0 && p <= limit) {
      final Z v = Z.valueOf(p);
      Z[] qr;
      boolean wasFactor = false;
      while ((qr = n.divideAndRemainder(v))[1].isZero()) {
        message("Found factor " + v);
        wasFactor = true;
        n = qr[0];
        fs.add(v, FactorSequence.PRIME, exponent);
        if (n.equals(Z.ONE)) {
          return;
        }
      }
      // Only reset the limit when we actually found a factor
      if (wasFactor) {
        blimit = n.sqrt();
        limit = Math.min(limit, blimit.compareTo(MAX_LONG) < 0 ? blimit.longValue() : Long.MAX_VALUE);
      }
      p = SIEVE.nextPrime(p);
    }

    // test what the exit condition was
    fs.add(n, n.isProbablePrime() ? FactorSequence.PROB_PRIME : status, exponent);
  }


  /**
   * Attempt to factor each of the supplied arguments, printing a sorted list of factors.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new PrimeDivision(), args);
  }

}
