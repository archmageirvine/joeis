package irvine.factor.project.em;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import irvine.factor.factor.EcmFactorizer;
import irvine.factor.factor.Factorizer;
import irvine.factor.factor.ListFactorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.util.CliFlags;

/**
 * Incremental ECM attack on mesh entries.
 * @author Sean A. Irvine
 */
public final class MeshIncrement {

  private MeshIncrement() { }

  private static final boolean NO_ECM = "true".equals(System.getProperty("no.ecm"));
  private static final int TRY_HARD_LENGTH_LIMIT = 56;
  private static final Factorizer ECM_FACTORIZER = NO_ECM ? null : new EcmFactorizer(10000.0, 100);
  private static final Factorizer ECM_FACTORIZER2 = NO_ECM ? null : new EcmFactorizer(100000.0, 100);

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

  static void process(final String line, final int maxLevel, final ListFactorizer lf) {
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
    if (level > maxLevel) {
      // Too far down the mesh to care about right now
      System.out.println(line);
      return;
    }
    final int closeParen = line.indexOf(')', openParen);
    assert closeParen > openParen;
    if (closeParen == line.length() - 1) {
      // Has not had trial division
      System.out.println(line);
      return;
    }
    final Z n = new Z(line.substring(openParen + 1, closeParen));
    final FactorSequence fs = new FactorSequence(n);
    if (lf != null) {
      lf.factor(fs);
      if (fs.omega() > 1) {
        System.err.println("Factored using list: " + n);
        writeFactors(line, openParen, fs, System.out);
        return;
      }
    }
    if (n.isProbablePrime()) {
      System.err.println("Claimed composite " + n + " is actually prime (correcting)");
      fs.remove(n);
      fs.add(n, FactorSequence.PRIME);
    } else {
      final int status = Integer.parseInt(line.substring(closeParen + 1));
      final int length = closeParen - openParen;
      if (status != 1 && length > TRY_HARD_LENGTH_LIMIT) {
        System.out.println(line);
        return;
      }
      if (ECM_FACTORIZER != null) {
        // Ok found an ECM candidate
        System.err.println("Attempting to factor level " + level + " n=" + n);
        ECM_FACTORIZER.factor(fs);
        if (length <= TRY_HARD_LENGTH_LIMIT && fs.omega() == 1) {
          System.err.println("Trying harder with ECM [100@100k]");
          ECM_FACTORIZER2.factor(fs);
        }
      }
    }
    // Spew out any factors found
    writeFactors(line, openParen, fs, System.out);
  }

  private static final String FACTOR_LIST_FLAG = "list";
  private static final String MAX_LEVEL_FLAG = "level";

  /**
   * Try and factor nodes meeting certain conditions.
   * @param args args
   * @throws java.io.IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final CliFlags flags = new CliFlags("Mesh", "Compute and check the Euclid-Mullin mesh");
    flags.registerOptional('l', FACTOR_LIST_FLAG, File.class, "file", "File containing factors to try");
    flags.registerOptional('m', MAX_LEVEL_FLAG, Integer.class, "level", "Maximum level at which to attempt factorization", 16);
    flags.setFlags(args);
    final ListFactorizer lf;
    if (flags.isSet(FACTOR_LIST_FLAG)) {
      try (final BufferedReader r = new BufferedReader(new FileReader((File) flags.getValue(FACTOR_LIST_FLAG)))) {
        lf = new ListFactorizer(r);
      }
    } else {
      lf = null;
    }
    try (final BufferedReader mesh = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = mesh.readLine()) != null) {
        process(line, (Integer) flags.getValue(MAX_LEVEL_FLAG), lf);
      }
    }
  }
}
