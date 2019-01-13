package irvine.factor.factor;

import java.io.BufferedReader;
import java.io.IOException;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.nt.smarandache.Smarandache;
import irvine.util.io.IOUtils;

/**
 * Detect and attempt to factor reverse Smarandache numbers using tables of
 * known factorizations.
 *
 * @author Sean A. Irvine
 */
public class ReverseSmarandacheFactorizer extends AbstractFactorizer {

  /** Known Smarandache factors. */
  private static String[] sReverseSmarandacheKnownFactors = null;

  /**
   * Initialize the table of reverse Smarandache factors.
   */
  private void init() {
    synchronized (ReverseSmarandacheFactorizer.class) {
      if (sReverseSmarandacheKnownFactors == null) {
        message("Initializing reverse Smarandache handling");
        sReverseSmarandacheKnownFactors = new String[Smarandache.SMARANDACHE_LIMIT + 1];
        try {
          try (final BufferedReader r = IOUtils.reader("irvine/factor/data/reversesmarandache.gz")) {
            String line;
            while ((line = r.readLine()) != null) {
              final int space = line.indexOf(' ');
              final int sm = Integer.parseInt(line.substring(0, space));
              if (sm <= Smarandache.SMARANDACHE_LIMIT) {
                sReverseSmarandacheKnownFactors[sm] = line.substring(space + 1);
              }
            }
          }
        } catch (final NumberFormatException e) {
          throw new RuntimeException("irvine/factor/data/smarandache.gz is corrupted", e);
        } catch (final IOException e) {
          throw new RuntimeException(e);
        }
        message("Done");
      }
    }
  }


  /**
   * Attempt to factor a number purported to be a Smarandache number. If
   * the number is found not to be Smarandache then no factoring is
   * performed. Any factors found are inserted into the specified factor
   * sequence.
   *
   * @param fs factor sequence containing <code>n</code>
   * @param n number to be factored
   */
  @Override
  protected void factor(final FactorSequence fs, Z n) {
    message("Trying: " + n);
    final int exponent = fs.getExponent(n);
    final int index = Smarandache.isReverseSmarandache(n);
    if (index != 0) {
      message("Found rSm" + index);
      // these numbers are always odd!
      assert index <= Smarandache.SMARANDACHE_LIMIT;
      fs.remove(n);
      // use lookup table
      init();
      final String known = sReverseSmarandacheKnownFactors[index];
      if (known != null) {
        final String[] f = known.split(" ");
        for (final String v : f) {
          final Z zf = new Z(v);
          assert Z.ZERO.equals(n.mod(zf));
          n = n.divide(zf);
          fs.add(zf, FactorSequence.PRIME, exponent);
        }
      }
      if (!Z.ONE.equals(n)) {
        fs.add(n, FactorSequence.COMPOSITE, exponent);
      }
    }
  }

  /**
   * Attempt to factor each of the supplied arguments.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new ReverseSmarandacheFactorizer(), args);
  }
}
