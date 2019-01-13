package irvine.factor.factor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Consult a disk cache of factors invoking a deeper method only if the
 * result is not already in cached.  Typically backed by the
 * <code>FactorDbFactorizer</code>.
 *
 * @author Sean A. Irvine
 */
public class CachedFactorizer extends AbstractFactorizer {

  private static final File ROOT = new File(new File(System.getProperty("user.home")), ".factor");
  private final Factorizer mFactorizer;
  private final File mRoot;

  /**
   * Cached factorizer backed by the given factorizer.
   * @param factorizer underlying factorizer
   * @param root directory of cache
   */
  CachedFactorizer(final Factorizer factorizer, final File root) {
    mFactorizer = factorizer;
    mRoot = root;
  }

  /**
   * Cached factorizer backed by the given factorizer.
   * @param factorizer underlying factorizer
   */
  public CachedFactorizer(final Factorizer factorizer) {
    this(factorizer, ROOT);
  }

  @Override
  public void setVerbose(final boolean verbose) {
    super.setVerbose(verbose);
    mFactorizer.setVerbose(verbose);
  }

  private static final String[] PREFIX = {"000000", "00000", "0000", "000", "00", "0"};

  private String key(final Z n) {
    final String h = Integer.toHexString(n.hashCode());
    if (h.length() < 6) {
      return PREFIX[h.length()] + h;
    }
    return h;
  }

  private Z consultCache(final Z n) {
    if (!mRoot.isDirectory()) {
      return null;
    }
    final String key = key(n);
    final File a = new File(mRoot, key.substring(0, 2));
    if (!a.isDirectory()) {
      return null;
    }
    final File b = new File(a, key.substring(2, 4));
    if (!b.isDirectory()) {
      return null;
    }
    final File c = new File(b, key.substring(4, 6));
    if (!c.isFile()) {
      return null;
    }
    try {
      try (final BufferedReader r = new BufferedReader(new FileReader(c))) {
        String line;
        while ((line = r.readLine()) != null) {
          final Z d = new Z(line, 16);
          if (Z.ZERO.equals(n.mod(d))) {
            assert d.isProbablePrime();
            return d;
          }
        }
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    return null;
  }

  private void augment(final Z n, final Z d) {
    final String key = key(n);
    final File a = new File(mRoot, key.substring(0, 2));
    final File b = new File(a, key.substring(2, 4));
    if (!b.isDirectory() && !b.mkdirs()) {
      throw new RuntimeException("Failed to make " + b.getPath());
    }
    final File c = new File(b, key.substring(4, 6));
    try {
      try (final PrintStream out = new PrintStream(new FileOutputStream(c, true))) {
        out.println(d.toString(16));
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
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

    if (n.compareTo(Z.ONE) <= 0) {
      fs.add(n, FactorSequence.PRIME);
      return;
    }

    while (!Z.ONE.equals(n)) {
      if (n.isProbablePrime()) {
        fs.add(n, FactorSequence.PROB_PRIME, exponent);
        break;
      }
      final Z d = consultCache(n);
      if (d != null) {
        do {
          n = n.divide(d);
          fs.add(d, FactorSequence.PRIME, exponent);
        } while (Z.ZERO.equals(n.mod(d)));
      } else {
        final FactorSequence s = new FactorSequence(n);
        mFactorizer.factor(s);
        for (final Z f : s.toZArray()) {
          if (consultCache(n) == null && (s.getStatus(f) == FactorSequence.PRIME || s.getStatus(f) == FactorSequence.PROB_PRIME)) {
            augment(n, f);
          }
          do {
            fs.add(f, s.getStatus(f), exponent);
            n = n.divide(f);
          } while (Z.ZERO.equals(n.mod(f)));
        }
      }
    }
  }

  /**
   * Attempt to factor each of the supplied arguments.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new CachedFactorizer(new FactorDbFactorizer()), args);
  }
}
