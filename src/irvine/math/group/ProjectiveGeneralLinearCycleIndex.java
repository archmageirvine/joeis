package irvine.math.group;

import java.io.BufferedReader;
import java.io.IOException;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.util.io.IOUtils;

/**
 * Cycle index for projective general linear group over GF2 from precomputed data.
 * @author Sean A. Irvine
 */
public final class ProjectiveGeneralLinearCycleIndex {

  private ProjectiveGeneralLinearCycleIndex() { }

  /**
   * Return the cycle index of <code>PGL_n(Z_2)</code>.
   * @param n index
   * @return cycle index
   */
  public static CycleIndex cycleIndex(final int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    try {
      try (final BufferedReader r = IOUtils.reader("irvine/math/group/pgl/" + n + ".gz")) {
        final String s = r.readLine();
        if (s == null) {
          throw new UnsupportedOperationException();
        }
        final int space = s.indexOf(' ');
        final Z order = new Z(s.substring(0, space));
        final CycleIndex ci = new CycleIndex("PGL_" + n + "(Z_2)");
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
}
