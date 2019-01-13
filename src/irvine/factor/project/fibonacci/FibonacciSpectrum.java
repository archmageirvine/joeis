package irvine.factor.project.fibonacci;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.r.Constants;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;

/**
 * Script to assist with the primality proof of Fibonacci or Lucas numbers.
 * It uses certain algebraic identities to construct partial factorizations
 * of N+1 and N-1.
 *
 * @author Sean A. Irvine
 */
public final class FibonacciSpectrum {

  private FibonacciSpectrum() { }

  static FactorSequence runFibonacci(final int n) {
    return Jaguar.factor(Fibonacci.fibonacci(n));
  }

  static FactorSequence runLucas(final int n) {
    return Jaguar.factor(Fibonacci.lucas(n));
  }

  static double runHelpers(final String file, final FactorSequence fs, double required) throws IOException {
    final ArrayList<Z> helpers = new ArrayList<>();
    try {
      try (final BufferedReader r = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = r.readLine()) != null) {
          if (!line.isEmpty() && !line.startsWith("#")) {
            helpers.add(new Z(line));
          }
        }
      }
    } catch (final FileNotFoundException e) {
      System.err.println("Helper file not found, ignoring it");
      return required;
    }
    for (Z z : fs.toZArray()) {
      final int ex = fs.getExponent(z);
      for (final Z d : helpers) {
        while (z.mod(d).equals(Z.ZERO)) {
          required -= d.bitLength() * ex;
          fs.remove(z);
          z = z.divide(d);
          if (!Z.ONE.equals(z)) {
            fs.add(z, FactorSequence.UNKNOWN, ex);
          }
        }
      }
    }
    return required;
  }

  static HashMap<Z, String> getEffort(final String file) throws IOException {
    final HashMap<Z, String> map = new HashMap<>();
    try {
      try (final BufferedReader r = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = r.readLine()) != null) {
          if (!line.isEmpty() && line.startsWith("#$")) {
            final int space = line.indexOf(' ');
            if (space != -1) {
              map.put(new Z(line.substring(2, space)), line.substring(space + 1));
            }
          }
        }
      }
    } catch (final FileNotFoundException e) {
      System.err.println("Helper file not found, ignoring it");
    }
    return map;
  }

  private static int digits(final double bits) {
    return (int) Math.ceil(bits / Constants.LG10);
  }

  /**
   * Compute a spectrum.  If a third argument is given, remaining composites
   * are printed.  The index should be of the form <code>F<i>n</i></code> or
   * <code>L<i>n</i></code>.
   *
   * @param args <code>index [helper-file] [summary|print|pp]</code>
   * @exception Exception if an error occurs
   */
  public static void main(final String... args) throws Exception {
    if (args.length == 0) {
      System.err.println("Usage: FibonacciSpectrum index [helper-file] [summary|print|pp]");
      return;
    }
    final char side = Character.toUpperCase(args[0].charAt(0));
    final boolean lucas = side == 'L';
    final int index = Integer.parseInt(args[0].substring(1));
    final Z f = lucas ? Fibonacci.lucas(index) : Fibonacci.fibonacci(index);
    final int bl = f.bitLength();
    System.out.println(side + "(" + index + ") has approx. length " + digits(bl) + " digits");
    double required = 0.3 * bl;
    System.out.println("Require approx. " + digits(required) + " digits to complete primality proof");
    final FactorSequence fs = new FactorSequence();
    if (lucas) {
      if ((index - 1) % 4 == 0) {
        final int n = (index - 1) / 4;
        final int nn = n + n;
        final int m = nn + 1;
        System.out.println("L(" + index + ")-1 = 5F(" + n + ")L(" + n + ")F(" + m + ")");
        System.out.println("L(" + index + ")+1 = L(" + m + ")L(" + nn + ")");
        fs.add(5, FactorSequence.PRIME);
        fs.merge(runFibonacci(n));
        fs.merge(runLucas(n));
        fs.merge(runFibonacci(m));
        fs.merge(runLucas(m));
        fs.merge(runLucas(nn));
      } else if ((index - 3) % 4 == 0) {
        final int n = (index - 3) / 4;
        final int np1 = n + 1;
        final int nnp1 = n + np1;
        final int nnp2 = nnp1 + 1;
        System.out.println("L(" + index + ")-1 = L(" + nnp1 + ")L(" + nnp2 + ")");
        System.out.println("L(" + index + ")+1 = 5F(" + np1 + ")L(" + np1 + ")F(" + nnp1 + ")");
        fs.add(5, FactorSequence.PRIME);
        fs.merge(runLucas(nnp1));
        fs.merge(runLucas(nnp2));
        fs.merge(runFibonacci(np1));
        fs.merge(runLucas(np1));
        fs.merge(runFibonacci(nnp1));
      } else {
        throw new UnsupportedOperationException();
      }
    } else {
      if ((index - 1) % 4 == 0) {
        final int n = (index - 1) / 4;
        final int nn = n + n;
        final int m = nn + 1;
        System.out.println("F(" + index + ")-1 = F(" + n + ")L(" + n + ")L(" + m + ")");
        System.out.println("F(" + index + ")+1 = F(" + m + ")L(" + nn + ")");
        fs.merge(runFibonacci(n));
        fs.merge(runLucas(n));
        fs.merge(runLucas(m));
        fs.merge(runFibonacci(m));
        fs.merge(runLucas(nn));
      } else if ((index - 3) % 4 == 0) {
        final int n = (index - 3) / 4;
        final int np1 = n + 1;
        final int nnp1 = n + np1;
        final int nnp2 = nnp1 + 1;
        System.out.println("F(" + index + ")-1 = F(" + np1 + ")L(" + np1 + ")L(" + nnp1 + ")");
        System.out.println("F(" + index + ")+1 = F(" + nnp1 + ")L(" + nnp2 + ")");
        fs.merge(runFibonacci(np1));
        fs.merge(runLucas(np1));
        fs.merge(runLucas(nnp1));
        fs.merge(runFibonacci(nnp1));
        fs.merge(runLucas(nnp2));
      } else {
        throw new UnsupportedOperationException();
      }
    }
    // Compute bit length of existing prime factors
    for (final Z z : fs.toZArray()) {
      final int s = fs.getStatus(z);
      if (s == FactorSequence.PRIME || s == FactorSequence.PROB_PRIME) {
        required -= z.bitLength() * fs.getExponent(z);
        fs.remove(z);
      }
    }
    System.out.println("After removing known factors, " + digits(required) + " digits needed");
    if (args.length > 1) {
      required = runHelpers(args[1], fs, required);
      System.out.println("After removing helper factors, " + digits(required) + " digits needed");
    }
    if (args.length > 2) {
      if ("summary".equals(args[2])) {
        final HashMap<Z, String> effort = getEffort(args[1]);
        final Z[] c = fs.toZArray();
        System.out.println("Number of outstanding composites = " + c.length);
        Arrays.sort(c);
        for (final Z t : c) {
          final String e = effort.get(t);
          System.out.println("C" + t.toString().length() + " " + (e == null ? "" : e));
        }
      } else if ("pp".equals(args[2])) {
        for (final Z t : fs.toZArray()) {
          if (t.isProbablePrime(15)) {
            System.out.println("*** probable prime " + t);
          }
        }
      } else {
        System.out.println("Remaining quantities");
        System.out.println(fs.toString());
      }
    }
  }
}
