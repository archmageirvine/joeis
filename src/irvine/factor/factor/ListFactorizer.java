package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Attempt to factor by using a supplied list of factors.
 *
 * @author Sean A. Irvine
 */
public class ListFactorizer extends AbstractFactorizer {

  private final List<Z> mNumberList;

  /**
   * Construct a list factoring engine using the specified list.
   * @param numberList list of numbers
   */
  public ListFactorizer(final List<Z> numberList) {
    mNumberList = numberList;
  }

  private static List<Z> readList(final BufferedReader r) throws IOException {
    final List<Z> lst = new ArrayList<>();
    String line;
    while ((line = r.readLine()) != null) {
      if (!line.isEmpty() && line.charAt(0) != '#') {
        lst.add(new Z(line));
      }
    }
    return lst;
  }

  /**
   * Construct a new list factorizer using a list from the supplied stream.
   * @param reader source of numbers
   * @throws IOException if an I/O error occurs.
   */
  public ListFactorizer(final BufferedReader reader) throws IOException {
    this(readList(reader));
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

    for (final Z f : mNumberList) {
      if (f.bitLength() <= n.bitLength() && Z.ZERO.equals(n.mod(f))) {
        fs.add(f, f.isProbablePrime() ? FactorSequence.PROB_PRIME : FactorSequence.COMPOSITE, exponent);
        n = n.divide(f);
      }
    }
    if (!Z.ONE.equals(n)) {
      fs.add(n, n.isProbablePrime() ? FactorSequence.PROB_PRIME : FactorSequence.COMPOSITE, exponent);
    }
  }

  /**
   * Attempt to factor each of the supplied arguments.
   *
   * @param args numbers to factor
   * @throws java.io.IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      factorize(new ListFactorizer(r), args);
    }
  }
}
