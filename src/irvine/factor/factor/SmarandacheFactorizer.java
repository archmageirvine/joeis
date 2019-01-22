package irvine.factor.factor;

import java.io.BufferedReader;
import java.io.IOException;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.factor.project.smarandache.Smarandache;
import irvine.util.io.IOUtils;

/**
 * Detect and attempt to factor Smarandache numbers using tables of
 * known factorizations.
 *
 * @author Sean A. Irvine
 */
public class SmarandacheFactorizer extends AbstractFactorizer {

  /** Known Smarandache factors. */
  private static String[] sSmarandacheKnownFactors = null;

  /**
   * Initialize the table of Smarandache factors.
   */
  private void init() {
    synchronized (SmarandacheFactorizer.class) {
      if (sSmarandacheKnownFactors == null) {
        message("Initializing Smarandache handling");
        sSmarandacheKnownFactors = new String[Smarandache.SMARANDACHE_LIMIT + 1];
        try (final BufferedReader r = IOUtils.reader("irvine/factor/data/smarandache.gz")) {
          String line;
          while ((line = r.readLine()) != null) {
            final int space = line.indexOf(' ');
            final int sm = Integer.parseInt(line.substring(0, space));
            if (sm <= Smarandache.SMARANDACHE_LIMIT) {
              sSmarandacheKnownFactors[sm] = line.substring(space + 1);
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
    final int index = Smarandache.isSmarandache(n);
    if (index != 0) {
      message("Found Sm" + index);
      // handle even part
      fs.remove(n);
      final int t = n.getLowestSetBit();
      if (t != 0) {
        n = n.shiftRight(t);
        fs.add(2L, FactorSequence.PRIME, t * exponent);
      }
      assert index <= Smarandache.SMARANDACHE_LIMIT;
      // use lookup table
      init();
      final String known = sSmarandacheKnownFactors[index];
      if (known != null) {
        final String[] f = known.split(" ");
        for (final String aF : f) {
          final Z zf = new Z(aF);
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
    factorize(new SmarandacheFactorizer(), args);
  }
}
