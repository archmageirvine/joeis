package irvine.factor.factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import irvine.factor.util.FactorSequence;
import irvine.math.expression.LiteralZ;
import irvine.math.expression.Sircon;
import irvine.math.z.Z;
import irvine.util.CliFlags;

/**
 * A general purpose complete factorizer that will use trial division to
 * handle small cases and proxy harder cases through a cached system
 * itself backed by <code>factordb.com</code>.  This is used in the OEIS
 * sequences as a convenient way of factoring numbers in many sequences
 * where a complete factorization of numbers is needed.
 *
 * @author Sean A. Irvine
 */
public final class Jaguar {

  private Jaguar() { }

  private static final String FLAG_VERBOSE = "verbose";
  private static final String FLAG_BIG_OMEGA = "Omega";
  private static final String FLAG_MULTILINE = "multiline";

  private static final CachedFactorizer FACTOR_DB = new CachedFactorizer(new FactorDbFactorizer());
  private static final Cheetah CHEETAH = new Cheetah(false);
  private static final PrimeDivision TRIAL = new PrimeDivision(1000);

  /**
   * Attempt to factor the given number
   * @param n number to factor
   * @return factorization
   * @throws UnsupportedOperationException if the factorization fails
   */
  public static FactorSequence factor(final Z n) {
    FactorSequence fs = new FactorSequence(n);
    if (Z.ONE.compareTo(n) < 0) {
      CHEETAH.factor(fs);
      if (!fs.isComplete()) {
        // It is generally better to look up the original number in factordb rather than
        // an already partially factored result, hence we recreate the sequence
        fs = new FactorSequence(n);
        FACTOR_DB.factor(fs);
        if (!fs.isComplete()) {
          throw new UnsupportedOperationException("Unfactored: " + n + " -> " + fs);
        }
      }
    }
    return fs;
  }

  /**
   * Attempt to factor the given number
   * @param n number to factor
   * @return factorization
   * @throws UnsupportedOperationException if the factorization fails
   */
  public static FactorSequence factorAllowIncomplete(final Z n) {
    FactorSequence fs = new FactorSequence(n);
    CHEETAH.factor(fs);
    if (!fs.isComplete()) {
      // It is generally better to look up the original number in factordb rather than
      // an already partially factored result, hence we recreate the sequence
      fs = new FactorSequence(n);
      FACTOR_DB.factor(fs);
    }
    return fs;
  }

  /**
   * Attempt to factor the given number in sufficient detail to determine if it is a semiprime.
   * @param n number to factor
   * @return factorization
   * @throws UnsupportedOperationException if the factorization fails
   */
  public static FactorSequence factorUpToSemiprime(final Z n) {
    FactorSequence fs = new FactorSequence(n);
    CHEETAH.factor(fs);
    if (fs.isSemiprime() == FactorSequence.UNKNOWN) {
      TRIAL.factor(fs);
      if (fs.isSemiprime() == FactorSequence.UNKNOWN) {
        // It is generally better to look up the original number in factordb rather than
        // an already partially factored result, hence we recreate the sequence
        fs = new FactorSequence(n);
        FACTOR_DB.factor(fs);
      }
    }
    return fs;
  }

  private static void process(final String expr, final PrintStream out, final CliFlags flags) {
    try {
      final Z n = ((LiteralZ) Sircon.parse(expr).eval()).value();
      final FactorSequence fs = factorAllowIncomplete(n);
      if (flags.isSet(FLAG_BIG_OMEGA)) {
        final long bigOmega = fs.bigOmegaBound();
        out.println(bigOmega < 0 ? ">=" + -bigOmega : String.valueOf(bigOmega));
      } else if (flags.isSet(FLAG_MULTILINE)) {
        out.println(fs.toString());
      } else {
        out.println(FactorSequence.toString(fs));
      }
    } catch (final NumberFormatException e) {
      System.out.println("Could not parse " + expr + " as a number.");
    }
  }

  /**
   * Attempt to factor each of the supplied arguments, printing a sorted list of factors.
   * @param args numbers to factor
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final CliFlags flags = new CliFlags("Factor numbers");
    flags.registerOptional('v', FLAG_VERBOSE, "report on progress");
    flags.registerOptional(FLAG_BIG_OMEGA, "report big omega");
    flags.registerOptional(FLAG_MULTILINE, "use multiline output format");
    final CliFlags.Flag<String> numbers = flags.registerRequired(String.class, "n", "number to factor (or read from stdin if not specified)");
    numbers.setMinCount(0);
    numbers.setMaxCount(Integer.MAX_VALUE);
    flags.setFlags(args);

    if (flags.isSet(FLAG_VERBOSE)) {
      FACTOR_DB.setVerbose(true);
      CHEETAH.setVerbose(true);
    }

    if (flags.getAnonymousValues(0).isEmpty()) {
      // Factor from standard input
      try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
        String line;
        while ((line = r.readLine()) != null) {
          process(line, System.out, flags);
        }
      }
    } else {
      for (final Object arg : flags.getAnonymousValues(0)) {
        process((String) arg, System.out, flags);
      }
    }
  }
}
