package irvine.factor.project.alonso;

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
 * @author Sean A. Irvine
 */
public final class AlonsoVerify {

  private AlonsoVerify() { }

  private static Z parse(final String s, final String line) {
    try {
      return new Z(s);
    } catch (final IllegalArgumentException e) {
      System.err.println("BAD LINE: " + line);
      throw e;
    }
  }

  static void verify(final InputStream is, final PrintStream out) throws IOException {
    try (@SuppressWarnings("resource")
    final BufferedReader r = new BufferedReader(new InputStreamReader(is))) {
      String line;
      Z n = Z.ONE;
      int expected = 0;
      while ((line = r.readLine()) != null) {
        line = line.trim();
        if (!line.isEmpty() && line.charAt(0) != '#') {
          final String[] parts = line.split("\\s+");
          if (parts.length != 2) {
            out.println("Strange line");
          }
          final int nn = Integer.parseInt(parts[0]);
          if (nn != expected) {
            out.println("Expected row number " + expected + " but found row " + nn);
            return;
          }
          if (expected++ == 0) {
            // First entry
            n = parse(parts[1], line);
            continue;
          }
          if (parts[1].startsWith("(")) {
            out.println("Unfinished: " + line);
          } else {
            final StringTokenizer st = new StringTokenizer(parts[1], ".");
            Z t = Z.ONE;
            final StringBuilder next = new StringBuilder();
            Z old = Z.ONE;
            try {
              while (st.hasMoreTokens()) {
                final String x = st.nextToken();
                final int expPos = x.indexOf('^');
                final int exp;
                final Z p;
                if (expPos >= 0) {
                  p = parse(x.substring(0, expPos), line);
                  exp = Integer.parseInt(x.substring(expPos + 1));
                } else if (x.startsWith("(")) {
                  out.println("Unfinished: " + line);
                  return;
                } else {
                  p = parse(x, line);
                  exp = 1;
                }
                next.append(p);
                if (exp > 1) {
                  next.append(exp);
                }
                if (!p.isProbablePrime(60)) {
                  out.println(expected + ": NOT PRIME: " + p + " " + x);
                }
                if (p.compareTo(old) < 0) {
                  out.println(expected + ": ORDER ERROR: " + old + " " + p);
                }
                old = p;
                t = t.multiply(p.pow(exp));
              }
            } catch (final NumberFormatException e) {
              // ignored
            }
            if (!t.equals(n)) {
              out.println(expected + ": PRODUCT ERROR: " + t + " != " + n);
            }
            n = parse(next.toString(), line);
          }
        }
      }
    }
  }


  /**
   * Verify Alonso sequence output files. The first argument is the file
   * name to check.
   *
   * @param args arguments as described above.
   * @exception Exception if an error occurs
   */
  public static void main(final String[] args) throws Exception {
    try (final FileInputStream fis = new FileInputStream(args[0])) {
      verify(fis, System.out);
    }
  }

}
