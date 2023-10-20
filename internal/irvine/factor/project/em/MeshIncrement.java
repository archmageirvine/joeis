package irvine.factor.project.em;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

import irvine.factor.factor.Factorizer;
import irvine.factor.factor.Jaguar;
import irvine.factor.factor.TillmanFactorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.util.CliFlags;

/**
 * Incremental ECM attack on mesh entries.
 * @author Sean A. Irvine
 */
public final class MeshIncrement {

  private MeshIncrement() { }

  private static final Factorizer TILLMAN = new TillmanFactorizer();
  private static final int MAX_LEVEL = 1000;
  private static final long[] NUM_COMPOSITES = new long[MAX_LEVEL];
  private static final int[] MIN_LENGTH_COMPOSITE = new int[MAX_LEVEL];
  static {
    Arrays.fill(MIN_LENGTH_COMPOSITE, Integer.MAX_VALUE);
  }
  private static long sNewTillman = 0;
  private static long sNewJaguar = 0;

  private static void writeFactors(final String line, final int openParen, final FactorSequence fs, final PrintStream out) {
    for (final Z f : fs.toZArray()) {
      final int st = fs.getStatus(f);
      if (st == FactorSequence.PRIME || st == FactorSequence.PROB_PRIME) {
        final int exp = fs.getExponent(f);
        System.err.println("-> Found prime factor " + f);
        out.println(line.substring(0, openParen) + f + (exp > 1 ? "^" + exp : ""));
      } else {
        out.println(line.substring(0, openParen + 1) + f + ")");
      }
    }
  }

  static void process(final String line, final int[] tillman, final int[] jaguar, final boolean testPrimes) {
    if (line.startsWith("#")) {
      System.out.println(line);
      return;
    }
    final int openParen = line.indexOf('(');
    if (openParen < 0) {
      System.out.println(line);
      return;
    }
    int level = 0;
    while (line.charAt(level) == '.') {
      ++level;
    }
    final int closeParen = line.indexOf(')', openParen);
    assert closeParen > openParen;
    final int length = closeParen - openParen - 1;
    if (level < MAX_LEVEL) {
      ++NUM_COMPOSITES[level];
      if (length < MIN_LENGTH_COMPOSITE[level]) {
        MIN_LENGTH_COMPOSITE[level] = length;
      }
    }

    if (testPrimes) {
      final Z n = new Z(line.substring(openParen + 1, closeParen));
      if (n.isProbablePrime()) {
        System.err.println("Claimed composite " + n + " is actually prime (correcting)");
        final FactorSequence fs = new FactorSequence();
        fs.add(n, FactorSequence.PRIME);
        writeFactors(line, openParen, fs, System.out);
        return;
      }
    }
    if (level <= tillman[0] && length <= tillman[1]) {
      final Z n = new Z(line.substring(openParen + 1, closeParen));
      System.err.println("Attempting to Tillman factor level " + level + " n=" + n);
      ++sNewTillman;
      writeFactors(line, openParen, TILLMAN.factorize(n), System.out);
    } else if (level <= jaguar[0] && length <= jaguar[1]) {
      final Z n = new Z(line.substring(openParen + 1, closeParen));
      System.err.println("Attempting to Jaguar factor level " + level + " n=" + n);
      try {
        final FactorSequence fs = Jaguar.factor(n);
        ++sNewJaguar;
        writeFactors(line, openParen, fs, System.out);
      } catch (final UnsupportedOperationException e) {
        // No it was not factored
        System.out.println(line);
      }
    } else {
      System.out.println(line);
    }
  }

  private static final String TILLMAN_FLAG = "tillman";
  private static final String JAGUAR_FLAG = "jaguar";
  private static final String PRIME_FLAG = "prime";

  private static int[] getFactorSpec(final String s) {
    final int colon = s.indexOf(':');
    if (colon < 0) {
      return new int[] {Integer.parseInt(s), Integer.MAX_VALUE};
    }
    if (colon == 0) {
      return new int[] {Integer.MAX_VALUE, Integer.parseInt(s.substring(1))};
    }
    return new int[] {Integer.parseInt(s.substring(0, colon)), Integer.parseInt(s.substring(colon + 1))};
  }

  /**
   * Try and factor nodes meeting certain conditions.
   * @param args args
   * @throws java.io.IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final CliFlags flags = new CliFlags("Mesh", "Compute and check the Euclid-Mullin mesh");
    flags.registerOptional('t', TILLMAN_FLAG, String.class, "level:size", "Constraints for using the Tillman factorization engine", "0:0");
    flags.registerOptional('j', JAGUAR_FLAG, String.class, "level:size", "Constraints for using the Jaguar factorization engine", "0:0");
    flags.registerOptional('p', PRIME_FLAG, "Explicitly check if claimed composites are actually prime");
    flags.setFlags(args);
    final int[] tillman = getFactorSpec((String) flags.getValue(TILLMAN_FLAG));
    final int[] jaguar = getFactorSpec((String) flags.getValue(JAGUAR_FLAG));
    try (final BufferedReader mesh = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = mesh.readLine()) != null) {
        process(line, tillman, jaguar, flags.isSet(PRIME_FLAG));
      }
    }
    System.err.println("Summary of number and smallest composite size by level");
    for (int k = 0; k < NUM_COMPOSITES.length; ++k) {
      if (NUM_COMPOSITES[k] != 0) {
        System.err.println(k + " " + NUM_COMPOSITES[k] + " C" + MIN_LENGTH_COMPOSITE[k]);
      }
    }
    if (sNewTillman > 0) {
      System.err.println("New Tillman factorizations: " + sNewTillman);
    }
    if (sNewJaguar > 0) {
      System.err.println("New Jaguar factorizations: " + sNewJaguar);
    }
  }
}
