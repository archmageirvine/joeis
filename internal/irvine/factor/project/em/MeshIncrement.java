package irvine.factor.project.em;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

import irvine.factor.factor.Factorizer;
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

  private static void writeFactors(final String line, final int openParen, final FactorSequence fs, final PrintStream out) {
    for (final Z f : fs.toZArray()) {
      final int st = fs.getStatus(f);
      if (st == FactorSequence.PRIME || st == FactorSequence.PROB_PRIME) {
        final int exp = fs.getExponent(f);
        System.err.println("-> Found prime factor " + f);
        out.println(line.substring(0, openParen) + f + (exp > 1 ? "^" + exp : ""));
      } else {
        out.println(line.substring(0, openParen + 1) + f + ")2");
      }
    }
  }

  static void process(final String line, final int maxLevel, final int maxCompositeSize) {
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
    if (level > maxLevel) {
      // Too far down the mesh to care about right now
      System.out.println(line);
      return;
    }

    // todo maybe checking all these prime is too slow
    final Z n = new Z(line.substring(openParen + 1, closeParen));
    final FactorSequence fs = new FactorSequence(n);
    if (false && n.isProbablePrime()) {
      System.err.println("Claimed composite " + n + " is actually prime (correcting)");
      fs.remove(n);
      fs.add(n, FactorSequence.PRIME);
    } else {
      //final int status = Integer.parseInt(line.substring(closeParen + 1));
      if (length > maxCompositeSize) {
        System.out.println(line);
        return;
      }
      System.err.println("Attempting to factor level " + level + " n=" + n);
      TILLMAN.factor(fs);
    }
    // Spew out any factors found
    writeFactors(line, openParen, fs, System.out);
  }

  private static final String MAX_COMPOSITE_FLAG = "max";
  private static final String MAX_LEVEL_FLAG = "level";

  /**
   * Try and factor nodes meeting certain conditions.
   * @param args args
   * @throws java.io.IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final CliFlags flags = new CliFlags("Mesh", "Compute and check the Euclid-Mullin mesh");
    flags.registerOptional('m', MAX_LEVEL_FLAG, Integer.class, "level", "Maximum level at which to attempt factorization", 16);
    flags.registerOptional('d', MAX_COMPOSITE_FLAG, Integer.class, "size", "Maximum length of composite to apply Tillman to", 80);
    flags.setFlags(args);
    try (final BufferedReader mesh = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = mesh.readLine()) != null) {
        process(line, (Integer) flags.getValue(MAX_LEVEL_FLAG), (Integer) flags.getValue(MAX_COMPOSITE_FLAG));
      }
    }
    System.err.println("Summary of number and smallest composite size by level");
    for (int k = 0; k < NUM_COMPOSITES.length; ++k) {
      if (NUM_COMPOSITES[k] != 0) {
        System.err.println(k + " " + NUM_COMPOSITES[k] + " C" + MIN_LENGTH_COMPOSITE[k]);
      }
    }
  }
}
