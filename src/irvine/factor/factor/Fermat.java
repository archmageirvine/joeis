package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * The Fermat factorization algorithm.
 *
 * @author Sean A. Irvine
 */
public class Fermat extends AbstractFactorizer {

  /** Maximum number of steps to make. */
  private static final long MAX_STEPS = 1 << 16;
  private long mMaxSteps = MAX_STEPS;
  private long mSteps = 0;

  /**
   * Set the maximum number of iterations to perform.
   * @param steps number of iterations
   */
  public void setMaxSteps(final long steps) {
    mMaxSteps = steps;
  }

  /**
   * Return the number of steps needed to achieve the factorization.
   * @return number of steps
   */
  public long getSteps() {
    return mSteps;
  }

  @Override
  protected void factor(final FactorSequence fs, Z n) {
    mSteps = 1;
    final int exponent = fs.getExponent(n);
    final int status = fs.getStatus(n);
    fs.remove(n);
    n = AbstractFactorizer.handleEvenAndNegative(fs, n, exponent);
    if (n.equals(Z.ONE)) {
      return;
    }
    final Z[] xy = n.sqrtAndRemainder();
    if (xy[1].equals(Z.ZERO)) {
      // n was a perfect square
      fs.add(xy[0], FactorSequence.UNKNOWN, 2 * exponent);
      return;
    }
    Z x = xy[0].add(1);
    Z y = x.square().subtract(n);

    // First condition below, ensures we eventually exit for primes
    while (mSteps < mMaxSteps) {
      // Next three lines accomplish y=y+2x+1, x=x+1
      y = y.add(x);
      x = x.add(1);
      y = y.add(x);
      if (x.compareTo(n) >= 0) {
        break;
      }
      ++mSteps;

      // Squares always equal 0 or 1 modulo 4, hence test bit 1
      if (!y.testBit(1)) {
        final Z[] zz = y.sqrtAndRemainder();
        final Z z;
        if (Z.ZERO.equals(zz[1]) && !(z = zz[0]).equals(x)) {
          // Found non-trivial factor, add with unknown status
          fs.add(x.add(z), FactorSequence.UNKNOWN, exponent);
          fs.add(x.subtract(z), FactorSequence.UNKNOWN, exponent);
          return;
        }
      }
    }

    fs.add(n, status, exponent);
  }

  /**
   * Attempt to factor each of the supplied arguments, printing a sorted list of factors.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new Fermat(), args);
  }
}
