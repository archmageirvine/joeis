package irvine.factor.factor;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.util.io.IOUtils;

/**
 * Attempt to factor by direct connection to <code>factordb.com</code>.
 * @author Sean A. Irvine
 */
public class FactorDbFactorizer extends AbstractFactorizer {

  private static final String ROOT_URL = "https://factordb.com/";
  private static final String QUERY_URL = ROOT_URL + "index.php?query=";
  private static final String SHOW_URL = ROOT_URL + "index.php?showid=";
  private static final String ID_TAG = "index.php?id=";
  private static final String NUM_TAG = "</tr><tr><td align=\"center\">Number</td>";

  static HashSet<String> extractIds(final String page) {
    final HashSet<String> ids = new HashSet<>();
    int p = page.indexOf(ID_TAG); // want to ignore first one since it is what we searched for
    while ((p = page.indexOf(ID_TAG, p + 1)) != -1) {
      final int end = page.indexOf('"', p);
      if (end == -1) {
        throw new RuntimeException("Parsing problem");
      }
      final String id = page.substring(p + ID_TAG.length(), end);
      ids.add(id);
    }
    return ids;
  }

  static Z getNumber(final String show) throws IOException {
    final int num = show.indexOf(NUM_TAG);
    if (num == -1) {
      throw new IOException("Number not found in: " + show);
    }
    final StringBuilder sb = new StringBuilder();
    for (int k = num + NUM_TAG.length(); k < show.length(); ++k) {
      final char c = show.charAt(k);
      if (c == '/') {
        break;
      }
      if (c >= '0' && c <= '9') {
        sb.append(c);
      }
    }
    return new Z(sb);
  }

  private Z getNumberFromId(final String id) throws IOException {
    message("Retrieving: " + id);
    final String show = IOUtils.readAll(new URL(SHOW_URL + id));
    final Z z = getNumber(show);
    message("Done: " + id + " " + z);
    return z;
  }

  @Override
  protected void factor(final FactorSequence fs, Z n) {
    message("Trying: " + n);
    final int exponent = fs.getExponent(n);
    fs.remove(n);

    // Remove any negative first
    if (n.signum() < 0) {
      n = n.negate();
      if ((exponent & 1) == 1) {
        fs.add(-1L);
      }
    }

    try {
      message("Querying URL for: " + n);
      final String page = IOUtils.readAll(new URL(QUERY_URL + n));
      message("Extracting factors");
      //System.out.println(page);
      for (final String id : extractIds(page)) {
        message("id=" + id);
        final Z v;
        final int status;
        if (id.length() < 18) {
          v = new Z(id);
          status = FactorSequence.PRIME;
        } else {
          v = getNumberFromId(id);
          status = v.isProbablePrime() ? FactorSequence.PROB_PRIME : FactorSequence.COMPOSITE;
        }
        if (!n.equals(v)) {
          while (n.mod(v).isZero()) {
            fs.add(v, status, exponent);
            n = n.divide(v);
          }
        }
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }

    if (!Z.ONE.equals(n)) {
      fs.add(n, n.isProbablePrime() ? FactorSequence.PROB_PRIME : FactorSequence.COMPOSITE, exponent);
    }
  }

  /**
   * Attempt to factor each of the supplied arguments.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new FactorDbFactorizer(), args);
  }
}
