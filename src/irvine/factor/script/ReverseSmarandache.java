package irvine.factor.script;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import irvine.factor.Smarandache;
import irvine.math.z.Z;

/**
 * Produces a file containing the primitive factors of reversed Smarandache
 * numbers.  Factors of two are elided.
 *
 * @author Sean A. Irvine
 */
public final class ReverseSmarandache {

  private ReverseSmarandache() { }

  /**
   * Compute the reversed Smarandache factor table.
   *
   * @param args ignored
   * @exception Exception if an error occurs
   */
  public static void main(final String[] args) throws Exception {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = r.readLine()) != null) {
        line = line.trim();
        if (line.isEmpty() || line.charAt(0) == '#') {
          continue;
        }
        final int space = line.indexOf(' ');
        if (space == -1) {
          System.err.println("WARNING: No space on line: " + line);
          continue;
        }
        final int rsm;
        try {
          rsm = Integer.parseInt(line.substring(0, space));
        } catch (final NumberFormatException e) {
          System.err.println("WARNING: Couldn't parse: " + line);
          continue;
        }
        Z n = Smarandache.reverseSmarandacheZ(rsm).makeOdd();
        final String[] factors = line.substring(space + 1).split("\\.");
        final StringBuilder sb = new StringBuilder();
        for (String f : factors) {
          final int caret = f.indexOf('^');
          final int exp;
          if (caret == -1) {
            exp = 1;
          } else {
            exp = Integer.parseInt(f.substring(caret + 1));
            f = f.substring(0, caret);
          }
          if ("2".equals(f) || f.charAt(0) == 'C' || "1".equals(f)) {
            continue;
          }
          if (f.charAt(0) == 'P') {
            if (!n.isProbablePrime(10)) {
              System.err.println("WARNING: " + n + " is not prime");
            }
            if (n.toString().length() != Integer.parseInt(f.substring(1))) {
              System.err.println("WARNING: " + f +  "length mismatches " + n.toString().length());
            }
            continue;
          }
          final Z d = new Z(f);
          if (!d.isProbablePrime(10)) {
            System.err.println("WARNING: " + f + " is not prime");
            continue;
          }
          if (!n.mod(d).isZero()) {
            System.err.println("WARNING: " + f + " does not divide rSm(" + rsm + ")");
            continue;
          }
          for (int j = 0; j < exp; ++j) {
            n = n.divide(d);
            sb.append(' ').append(d);
          }
        }
        if (!Z.ONE.equals(n) && n.isProbablePrime(10)) {
          sb.append(' ').append(n);
        }
        if (sb.length() != 0) {
          System.out.println(rsm + sb.toString());
        }
      }
    }
  }
}
