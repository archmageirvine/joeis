package irvine.factor.project.hp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

import irvine.math.z.Z;

/**
 * Attempts to verify factorizations in a file of home prime factorizations.
 *
 * @author Sean A. Irvine
 */
public final class HomePrimeVerify {

  private HomePrimeVerify() { }

  static void verify(final InputStream is, final int base, final PrintStream out) throws IOException {
    final BufferedReader r = new BufferedReader(new InputStreamReader(is));
    String line;
    Z n = Z.ONE;
    int steps = 0;
    int expected = 1;
    while ((line = r.readLine()) != null) {
      line = line.trim();
      if (!line.isEmpty() && line.charAt(0) != '#') {
        if (line.startsWith("[")) {
          steps = 0;
          n = new Z(line.substring(2, line.length() - 2));
          final int nn = n.intValue();
          if (nn != expected + 1) {
            out.println("Expected entry for " + (expected + 1) + " but found entry for " + n);
          }
          expected = nn;
        } else if (line.startsWith("{")) {
        } else if (line.startsWith("prime")) {
          if (!n.isProbablePrime(60)) {
            out.println(expected + ": FINAL NOT PRIME: " + n);
          }
          if (!line.substring(6).equals(String.valueOf(steps))) {
            out.println(expected + ": Step mismatch: " + line + " :: should be " + steps);
          }
        } else if (line.startsWith("composite")) {
          if (!line.substring(10).equals(String.valueOf(steps))) {
            out.println(expected + ": Step mismatch: " + line + " :: should be " + steps);
          }
        } else {
          ++steps;
          final StringTokenizer st = new StringTokenizer(line, ".");
          Z t = Z.ONE;
          final StringBuilder next = new StringBuilder();
          Z old = Z.ONE;
          try {
            while (st.hasMoreTokens()) {
              String x = st.nextToken();
              final boolean comp = x.startsWith("(");
              next.append(x);
              final Z p;
              if (comp) {
                x = x.substring(1, x.length() - 1).trim();
                p = new Z(x);
              } else {
                p = new Z(x, base);
              }
              if (!comp) {
                if (!p.isProbablePrime(60)) {
                  out.println(expected + ": NOT PRIME: " + p + " " + x);
                }
                if (p.compareTo(old) < 0) {
                  out.println(expected + ": ORDER ERROR: " + old + " " + p);
                }
              }
              old = p;
              t = t.multiply(p);
            }
          } catch (final NumberFormatException e) {
            // ignore
          }
          if (!t.equals(n)) {
            out.println(expected + ": PRODUCT ERROR: " + t + " != " + n);
          }
          try {
            n = new Z(next.toString(), base);
          } catch (final IllegalArgumentException e) {
            // this means we have a trailing composite
            n = Z.ZERO;
          }
        }
      }
    }
  }


  /**
   * Verify home prime output files. The first argument is the file
   * name to check and the second argument is the base.
   *
   * @param args arguments as described above.
   * @exception Exception if an error occurs
   */
  public static void main(final String[] args) throws Exception {
    try (final FileInputStream is = new FileInputStream(args[0])) {
      verify(is, Integer.parseInt(args[1]), System.err);
    }
  }

}
