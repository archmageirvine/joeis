package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Attempt to factor by native calls to <code>gmp-ecm</code>.
 * Returns as soon a single factor is found.
 *
 * @author Sean A. Irvine
 */
public class EcmFactorizer extends AbstractFactorizer {

  static {
    System.loadLibrary("jecm");
  }

  private final double mB1;
  private final int mCurves;

  /**
   * An elliptic curve factorizer backed by <code>gmp-ecm</code> implementation.
   * @param b1 bound
   * @param curves maximum number of curves to run
   */
  public EcmFactorizer(final double b1, final int curves) {
    mB1 = b1;
    mCurves = curves;
  }

  private native String jecm(final String n, final double b1);

  @Override
  protected void factor(final FactorSequence fs, final Z n) {
    message("Trying: " + n);
    final int exponent = fs.getExponent(n);
    final String arg = n.toString();
    int attempts = 0;
    while (attempts++ < mCurves) {
      final String res = jecm(arg, mB1);
      if (res != null && !"1".equals(res) && !arg.equals(res)) {
        // Found a factor
        final Z f = new Z(res);
        final Z[] qr = n.divideAndRemainder(f);
        if (!Z.ZERO.equals(qr[1])) {
          throw new RuntimeException(res + " does not divide " + n);
        }
        fs.remove(n);
        fs.add(f, f.isProbablePrime() ? FactorSequence.PROB_PRIME : FactorSequence.COMPOSITE, exponent);
        fs.add(qr[0], qr[0].isProbablePrime() ? FactorSequence.PROB_PRIME : FactorSequence.COMPOSITE, exponent);
        return;
      }
    }
  }

  /**
   * Attempt to factor each of the supplied arguments.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new EcmFactorizer(10000.0, 100), args);
  }
}
