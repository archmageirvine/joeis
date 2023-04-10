package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.expression.LiteralZ;
import irvine.math.expression.Sircon;
import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * Provides an implementation of the factor method, which in turn
 * calls a method for factoring a single number.
 *
 * @author Sean A. Irvine
 */
public abstract class AbstractFactorizer implements Factorizer {

  /** Verbosity status. */
  private boolean mVerbose = false;

  @Override
  public void setVerbose(final boolean verbose) {
    mVerbose = verbose;
  }

  @Override
  public boolean isVerbose() {
    return mVerbose;
  }

  /**
   * Convenience method to display a message if verbose is currently
   * active.  The message <code>s</code> is displayed together with
   * the date and a class name.
   *
   * @param s message to display
   */
  protected void message(final String s) {
    if (isVerbose()) {
      StringUtils.message(System.err, getClass().getName() + " " + s);
    }
  }

  /**
   * Given integer <code>n</code>, make <code>n</code> nonnegative and odd
   * or zero, by negation and removing as many factors of 2 as possible.
   * The factor sequence is updated accordingly, and the number remaining
   * to be factored is returned.
   *
   * @param fs a factorization sequence to store results
   * @param n number to be factored
   * @param exponent the exponent for n
   * @return n with powers of 2 removed and made nonnegative
   */
  protected static Z handleEvenAndNegative(final FactorSequence fs, Z n, final int exponent) {
    // handle negative
    if (n.signum() < 0) {
      fs.add(-1L, FactorSequence.PRIME, exponent);
      n = n.negate();
    }
    if (!n.isZero()) {
      // handle even part
      final int t = n.getLowestSetBit();
      if (t != 0) {
        n = n.shiftRight(t);
        fs.add(2L, FactorSequence.PRIME, t * exponent);
      }
    }
    return n;
  }

  /**
   * Attempt to factor <code>n</code>, a number known to be present in
   * the supplied factor sequence <code>fs</code>. If new factors are
   * found then the contents of <code>fs</code> is modified accordingly.
   *
   * @param fs factor sequence containing n
   * @param n number to be factored
   */
  protected abstract void factor(final FactorSequence fs, final Z n);

  @Override
  public void factor(final FactorSequence fs) {
    if (fs == null) {
      return;
    }
    final Z[] n = fs.toZArray();

    for (final Z k : n) {
      switch (fs.getStatus(k)) {
      case FactorSequence.COMPOSITE:
      case FactorSequence.UNKNOWN:
        factor(fs, k);
        break;
      default:
        break;
      }
    }
  }

  @Override
  public FactorSequence factorize(final Z n) {
    final FactorSequence fs = new FactorSequence(n);
    factor(fs);
    if (!fs.isComplete()) {
      throw new UnsupportedOperationException(fs.toString());
    }
    return fs;
  }

  protected static void factorize(final AbstractFactorizer factorizer, final String... args) {
    if (args.length == 0) {
      System.out.println("USAGE: " + factorizer.getClass().getName() + " n*");
    } else {
      factorizer.setVerbose(true);
      for (final String arg : args) {
        System.out.println("Trying: " + arg);
        final FactorSequence fs = new FactorSequence(((LiteralZ) Sircon.parse(arg).eval()).value());
        factorizer.factor(fs);
        System.out.println(fs);
      }
    }
  }
}
