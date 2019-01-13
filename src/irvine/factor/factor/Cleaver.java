package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Attempt to factor numbers using a variety of strategies.  This
 * includes checking for various special forms.  When faced with
 * an arbitrary number to factor this is a good starting place.
 *
 * @author Sean A. Irvine
 */
public class Cleaver extends AbstractFactorizer {

  /** Factor class for Smarandache numbers. */
  private static Factorizer sSmarandache = null;
  /** Factor class for reverse Smarandache numbers. */
  private static Factorizer sReverseSmarandache = null;

  private void copyFactors(final FactorSequence fs, final FactorSequence fsN, final Z n) {
    final Z[] f = fsN.toZArray();
    final int exponent = fs.getExponent(n);
    fs.remove(n);
    for (final Z fi : f) {
      fs.add(fi, fsN.getStatus(fi), fsN.getExponent(fi) * exponent);
    }
  }

  private boolean handleSmarandache(final FactorSequence fs, final FactorSequence fsN, final Z n) {
    synchronized (Cleaver.class) {
      if (sSmarandache == null) {
        sSmarandache = new SmarandacheFactorizer();
        sSmarandache.setVerbose(isVerbose());
      }
    }
    sSmarandache.factor(fsN);
    if (fsN.omega() != 1) {
      copyFactors(fs, fsN, n);
      return true;
    }
    return false;
  }

  private boolean handleReverseSmarandache(final FactorSequence fs, final FactorSequence fsN, final Z n) {
    synchronized (Cleaver.class) {
      if (sReverseSmarandache == null) {
        sReverseSmarandache = new ReverseSmarandacheFactorizer();
        sReverseSmarandache.setVerbose(isVerbose());
      }
    }
    sReverseSmarandache.factor(fsN);
    if (fsN.omega() != 1) {
      copyFactors(fs, fsN, n);
      return true;
    }
    return false;
  }

  /**
   * Attempt to factor a number using a variety of strategies.
   *
   * @param fs factor sequence containing <code>n</code>
   * @param n number to be factored
   */
  @Override
  protected void factor(final FactorSequence fs, Z n) {
    message("Trying: " + n);
    final int exponent = fs.getExponent(n);

    // handle -1
    if (n.signum() < 0) {
      fs.add(-1L, FactorSequence.PRIME, exponent);
      fs.remove(n);
      n = n.negate();
      fs.add(n);
    }

    // make a new factor sequence with only this number in, which
    // can be used in follow on
    final FactorSequence fsN = new FactorSequence();
    fsN.add(n);

    // handle Fibonacci, Lucas numbers
    if (handleSmarandache(fs, fsN, n) || handleReverseSmarandache(fs, fsN, n)) {
    }
  }

  /**
   * Attempt to factor each of the supplied arguments.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new Cleaver(), args);
  }
}
