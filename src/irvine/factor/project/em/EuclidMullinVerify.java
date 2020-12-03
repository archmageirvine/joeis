package irvine.factor.project.em;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * Attempts to verify factorizations in a Euclid-Mullin sequence.
 *
 * @author Sean A. Irvine
 */
public final class EuclidMullinVerify {

  private EuclidMullinVerify() { }

  static void verify(final InputStream is, final PrintStream out, final boolean sizeReport) throws IOException {
    final HashSet<Z> found = new HashSet<>();
    final BufferedReader r = new BufferedReader(new InputStreamReader(is));
    // Expect a comment on the first line and look for -1 to set delta, otherwise
    // assume delta is 1
    String line = r.readLine();
    if (line == null || line.isEmpty() || line.charAt(0) != '#') {
      throw new IOException("Expected comment on first line.");
    }
    final int delta;
    if (line.contains("-1")) {
      delta = -1;
    } else if (line.contains("A125045")) {
      delta = 2;
    } else {
      delta = 1;
    }
    Z prod = Z.ONE;
    int step = 0;
    while ((line = r.readLine()) != null) {
      line = line.trim();
      if (!line.isEmpty() && line.charAt(0) != '#') {
        ++step;
        try {
          final int space = line.indexOf(' ');
          if (space == -1) {
            System.err.println("Incomplete line at step " + step);
            break;
          } else if (Integer.parseInt(line.substring(0, space)) != step) {
            System.err.println("Step number mismatch: " + step);
          }
          line = line.substring(space + 1).trim();
          final String[] parts = line.split("\\.");
          final Z[] p = new Z[parts.length];
          if (prod.equals(Z.ONE)) {
            prod = new Z(parts[0]);
            found.add(prod);
          } else {
            // check factors
            Z n = prod.add(delta);
            if (parts.length > 0 && parts[0].charAt(0) == '(') {
              // first factor is current target
              break;
            }
            for (int k = 0; k < parts.length; ++k) {
              String s = parts[k];
              if (s.charAt(0) == 'P') {
                if (!n.isProbablePrime()) {
                  System.err.println(line + ": Probable prime error");
                }
                p[k] = n;
                n = Z.ONE;
              } else {
                final boolean isPrime;
                if (s.charAt(0) == '(' || s.charAt(0) == '{') {
                  s = s.substring(1, s.length() - 1);
                  isPrime = false;
                } else {
                  isPrime = true;
                }
                final Z ss = new Z(s);
                final Z[] q = n.divideAndRemainder(ss);
                if (!q[1].isZero()) {
                  System.err.println(line + ": Factorization error");
                }
                n = q[0];
                p[k] = ss;
                if (ss.isProbablePrime() != isPrime) {
                  System.err.println(line + ": Probable prime error");
                }
              }
            }
            if (!n.equals(Z.ONE)) {
              System.err.println(line + ": Factorization not complete");
            }
            for (int k = 1; k < p.length; ++k) {
              if (p[k].compareTo(p[k - 1]) < 0) {
                System.err.println(line + ": Factor ordering error");
              }
            }
            prod = prod.multiply(p[0]);
            found.add(p[0]);
          }
        } catch (final IllegalArgumentException e) {
          System.err.println("Bad line: "  + line);
        }
        if (sizeReport) {
          out.println(step + " " + prod.toString().length());
        }
      }
    }
    // Find smallest unfound prime
    final Fast fast = new Fast();
    Z p = Z.TWO;
    while (found.contains(p)) {
      p = fast.nextPrime(p);
    }
    out.println("Smallest prime not yet in sequence: " + p + " (step " + step + ")");
    out.println("#Current target: " + prod.add(delta));
  }


  /**
   * Verify Euclid-Mullin style sequences.
   *
   * @param args ignored
   * @exception Exception if an error occurs
   */
  public static void main(final String[] args) throws Exception {
    verify(System.in, System.out, args.length > 0 && "-s".equals(args[0]));
  }

}
