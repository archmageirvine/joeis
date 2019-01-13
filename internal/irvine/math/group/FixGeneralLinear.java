package irvine.math.group;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import irvine.math.z.Z;

/**
 * Fix general linear cycle index.
 * @author Sean A. Irvine
 */
public final class FixGeneralLinear {

  private FixGeneralLinear() { }

  private static String repair(final String s) {
    final String[] parts = s.split("\\s+");
    // Find the order
    Z order = Z.ONE;
    for (final String t : parts) {
      final int slash = t.indexOf('/');
      if (slash >= 0) {
        order = order.lcm(new Z(t.substring(slash + 1)));
      }
    }
    final StringBuilder sb = new StringBuilder();
    sb.append(order).append(' ');
    for (final String t : parts) {
      if (t.charAt(0) == '[') {
        sb.append(t);
      } else {
        final int slash = t.indexOf('/');
        final Z mult = order.multiply(new Z(t.substring(0, slash < 0 ? t.length() : slash)))
          .divide(slash < 0 ? Z.ONE : new Z(t.substring(slash + 1)));
        sb.append(mult);
      }
    }
    return sb.toString();
  }

  /**
   * Take a cycle index line as produced by <code>SYMMETRICA</code> and write it
   * in a form that we can then use.
   * @param args ignored
   * @exception IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    //echo -e "2\n11" |./test2 2>/dev/null | tr -d '\n\.' | sed 's|/ *|/|g' | java irvine.math.group.FixGeneralLinear

    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = r.readLine()) != null) {
        System.out.println(repair(line));
      }
    }
  }

}

