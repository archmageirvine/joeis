package irvine.math.group;

import java.io.BufferedReader;
import java.io.IOException;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.util.io.IOUtils;

/**
 * Cycle index for general linear group over <code>GF2</code> from precomputed data.
 * @author Sean A. Irvine
 */
public final class GeneralLinearCycleIndex {

  private GeneralLinearCycleIndex() { }

  /**
   * Return the cycle index of <code>GL_n(Z_2)</code>.
   * @param n index
   * @return cycle index
   */
  public static CycleIndex cycleIndex(final int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    try {
      try (final BufferedReader r = IOUtils.reader("irvine/math/group/gl/" + n + ".gz")) {
        final String s = r.readLine();
        if (s == null) {
          throw new UnsupportedOperationException();
        }
        final int space = s.indexOf(' ');
        final Z order = new Z(s.substring(0, space));
        final CycleIndex ci = new CycleIndex("GL_" + n + "(Z_2)");
        final String[] spec = s.substring(space + 1).split("]");
        for (final String t : spec) {
          final int leftBracket = t.indexOf('[');
          final Z m = new Z(t.substring(0, leftBracket));
          final String[] coeffs = t.substring(leftBracket + 1).split(",");
          final MultivariateMonomial mm = new MultivariateMonomial();
          mm.setCoefficient(new Q(m, order));
          for (int k = 0; k < coeffs.length; ++k) {
            mm.add(k + 1, Integer.parseInt(coeffs[k]));
          }
          ci.add(mm);
        }
        return ci;
      }
    } catch (final IOException | NullPointerException e) {
      throw new UnsupportedOperationException(e);
    }
  }

  /**
   * Print cycle index.
   *
   * @param args cycle index to print.
   */
  public static void main(final String[] args) {
    System.out.println(cycleIndex(Integer.parseInt(args[0])));
  }
}
