package irvine.factor.project.factorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import irvine.graph.Graph;
import irvine.graph.Vertex;
import irvine.math.z.Z;
import irvine.util.CliFlags;
import irvine.util.CliFlags.Flag;
import irvine.util.string.Date;

/**
 * Provides various verification, formatting, and searching options for
 * the file <code>factorials.txt</code>.
 *
 * @author Sean A. Irvine
 */
public final class Factorial {

  private Factorial() { }

  /** Maximum index considered. */
  private static final int LIMIT = 100000;
  /** Limit used to search for smallest composites. */
  private static final int SMALL_LIMIT = 500;
  /** Number of first holes to report. */
  private static final int FIRST_HOLES = 5;
  /** Number of bits before primality certificate is desirable. */
  private static final int CERTIFICATE_BITS = 1000;
  /**
   * All n below these values are completely factored. Any entries
   * below these values are silently assumed correct.
   */
  private static final int SMALLEST_PLUS_UNFACTORED = 139;
  private static final int SMALLEST_MINUS_UNFACTORED = 136;

  /** Structures to store all known factors. */
  private static final ArrayList<List<Z>> FP = new ArrayList<>(LIMIT + 1);
  private static final ArrayList<List<Z>> FM = new ArrayList<>(LIMIT + 1);
  private static final HashSet<Z> FACTORS = new HashSet<>();
  static {
    for (int k = 0; k <= LIMIT; ++k) {
      FP.add(null);
      FM.add(null);
    }
  }

  private static void store(final ArrayList<List<Z>> s, final int n, final Z f) {
    if (s.get(n) == null) {
      s.set(n, new ArrayList<>());
    }
    final int size = s.get(n).size();
    if (size > 1 && Z.ZERO.equals(s.get(n).get(size - 1))) {
      System.err.println("Factor " + f + " seen after P specifier for index " + n);
    }
    s.get(n).add(f);
  }

  private static final ArrayList<String> OVERSIZE = new ArrayList<>();

  /**
   * Read factors from the file, assumed to be in the format
   * date n![+-]1 factor other-info.  Blank lines and lines
   * starting with a hash (#) are ignored.  Factors for indexes
   * larger than the defined limit are ignored.
   *
   * @param file file to read from
   * @exception IOException if an I/O error occurs
   */
  private static void read(final File file) throws IOException {
    try (final BufferedReader r = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = r.readLine()) != null) {
        if (!line.isEmpty() && line.charAt(0) != '#') {
          final String[] parts = line.split("\\s+");
          final int bang;
          final char sign;
          if (parts.length < 3 || (bang = parts[1].indexOf('!')) == -1 || bang != parts[1].length() - 3 || ((sign = parts[1].charAt(bang + 1)) != '+' && sign != '-')) {
            System.err.println("Skipping: " + line);
            continue;
          }
          try {
            final int n = Integer.parseInt(parts[1].substring(0, bang));
            if (n > LIMIT || n < 0) {
              OVERSIZE.add(n + "_" + parts[2]); // retained for graph calculation
              continue;
            }
            final Z f;
            if ("P".equalsIgnoreCase(parts[2])) {
              f = Z.ZERO;
            } else if ("C".equalsIgnoreCase(parts[2])) {
              // ignore lines marking composites
              continue;
            } else {
              f =  new Z(parts[2]);
              FACTORS.add(f);
            }
            store(sign == '+' ? FP : FM, n, f);
          } catch (final NumberFormatException e) {
            System.err.println("Skipping: " + line);
          }
        }
      }
    }
  }

  /**
   * Check that all the numbers in the factors we have seen are indeed
   * (probable) primes.
   *
   * @param ptests number of primality tests to perform
   */
  private static void checkPrimes(final int ptests) {
    for (Z p : FACTORS) {
      if (!p.isProbablePrime(ptests)) {
        System.err.println("Not prime: " + p);
      }
    }
  }

  private static void checkChain(final String s, Z n, final List<Z> f) {
    if (f != null) {
      for (final Z factor : f) {
        if (!Z.ZERO.equals(factor)) {
          final Z[] t = n.divideAndRemainder(factor);
          if (!Z.ZERO.equals(t[1])) {
            System.err.println("Not a factor: " + s + factor);
          } else {
            n = t[0];
          }
        }
      }
    }
  }

  /**
   * Verify that factors are prime and divide the specified numbers.
   */
  private static void verify() {
    Z n = Z.ONE; // k!
    for (int k = 1; k <= LIMIT; ++k) {
      n = n.multiply(k);
      if (k >= SMALLEST_MINUS_UNFACTORED) {
        checkChain(k + "!-1 ", n.subtract(Z.ONE), FM.get(k));
      }
      if (k >= SMALLEST_PLUS_UNFACTORED) {
        checkChain(k + "!+1 ", n.add(Z.ONE), FP.get(k));
      }
    }
  }

  private static void dumpValue(final int i, final boolean side, final boolean complete) {
    final List<Z> f;
    final String sign;
    if (side) {
      f = FP.get(i);
      sign = "+";
    } else {
      f = FM.get(i);
      sign = "-";
    }
    if (f == null) {
      System.out.println(i + "!" + sign + "1");
    } else if (!f.get(f.size() - 1).equals(Z.ZERO) ^ complete) {
      final StringBuilder sb = new StringBuilder("(");
      sb.append(i).append('!').append(sign).append("1)");
      for (final Z z : f) {
        if (!Z.ZERO.equals(z)) {
          sb.append('/').append(z);
        }
      }
      System.out.println(sb.toString());
    }
  }

  private static File getCetificateDirectory(final File source) {
    return new File(source.getParent(), "certificates");
  }

  private static boolean validateCertificate(final Z m, final int n, final boolean side, final int ptests, final File certs) {
    final char sign = side ? '+' : '-';
    if (m.bitLength() < CERTIFICATE_BITS) {
      // Don't care about certificates for smaller numbers
      if (!m.isProbablePrime(ptests)) {
        System.err.println(n + "!" + sign + "1 claimed prime cofactor was not prime");
      }
      return true;
    }
    File f = new File(certs, "f" + n + (side ? "p" : "m"));
    if (!f.exists()) {
      f = new File(certs, "f" + n + (side ? "p" : "m") + ".gz");
    }
    return f.exists() && PrimoCertificate.verify(f, true);
  }

  /**
   * Check the primality status of cofactors after all known factors are removed.
   *
   * @param min minimum index to test
   * @param max maximum index to test
   * @param ptests number of primality tests to perform
   * @param certs certificates directory
   */
  private static void checkCofactors(final int min, final int max, final int ptests, final File certs) {
    Z n = Z.ONE;
    for (int i = 2; i < min; ++i) {
      n = n.multiply(i);
    }
    for (int i = min; i <= max; ++i) {
      n = n.multiply(i);

      if (i > SMALLEST_MINUS_UNFACTORED) {
        final List<Z> fm = FM.get(i);
        boolean sawZero = false;
        Z m = n.subtract(Z.ONE);
        if (fm != null) {
          final Z[] f = fm.toArray(new Z[fm.size()]);
          Arrays.sort(f);
          sawZero = Z.ZERO.equals(f[0]);
          for (int j = sawZero ? 1 : 0; j < f.length; ++j) {
            m = m.divide(f[j]);
          }
        }
        if (sawZero) {
          if (!validateCertificate(m, i, false, ptests, certs)) {
            System.out.print("Certificate failure for ");
            dumpValue(i, false, true);
            if (!m.isProbablePrime(ptests)) {
              System.out.println(i + "!-1 claimed prime cofactor was not prime");
            }
          }
        } else {
          if (m.isProbablePrime(ptests)) {
            System.out.println(Date.getDate() + i + "!-1 P (probable)");
          }
        }
      }

      if (i > SMALLEST_PLUS_UNFACTORED) {
        final List<Z> fp = FP.get(i);
        boolean sawZero = false;
        Z m = n.add(Z.ONE);
        if (fp != null) {
          final Z[] f = fp.toArray(new Z[fp.size()]);
          Arrays.sort(f);
          sawZero = Z.ZERO.equals(f[0]);
          for (int j = sawZero ? 1 : 0; j < f.length; ++j) {
            m = m.divide(f[j]);
          }
        }
        if (sawZero) {
          if (!validateCertificate(m, i, true, ptests, certs)) {
            System.out.print("Certificate failure for ");
            dumpValue(i, true, true);
            if (!m.isProbablePrime(ptests)) {
              System.out.println(i + "!+1 claimed prime cofactor was not prime");
            }
          }
        } else {
          if (m.isProbablePrime(ptests)) {
            System.out.println(Date.getDate() + i + "!+1 P (probable)");
          }
        }
      }
    }
  }

  private static void dumpNotKnown(final int min, final int max) {
    final int m = Math.max(Math.min(SMALLEST_PLUS_UNFACTORED, SMALLEST_MINUS_UNFACTORED), min);
    for (int i = m; i <= max; ++i) {
      if (FM.get(i) == null) {
        System.out.println(i + "!-1");
      }
      if (FP.get(i) == null) {
        System.out.println(i + "!+1");
      }
    }
  }

  private static void dumpECM(final int min, final int max) {
    for (int i = min; i <= max; ++i) {
      if (i >= SMALLEST_MINUS_UNFACTORED) {
        dumpValue(i, false, false);
      }
      if (i >= SMALLEST_PLUS_UNFACTORED) {
        dumpValue(i, true, false);
      }
    }
  }

  private static int getDecimalLength(final Z n) {
    return (int) Math.ceil(n.log(10));
  }

  private static String ultimate(final boolean prime, final Z n) {
    final int dl = getDecimalLength(n);
    if (dl < 20 && prime) {
      return n.toString();
    }
    return (prime ? "P" : "C") + dl;
  }

  /**
   * Dump tables in canonical form.
   *
   * @param min minimum index
   * @param max maximum index
   */
  private static void dumpTable(final int min, final int max) {
    System.out.println("n!-1 for " + min + " <= n <= " + max);
    System.out.println();
    // precompute n! up to min (could be done faster)
    Z n = Z.ONE;
    for (int i = 2; i < min; ++i) {
      n = n.multiply(i);
    }
    final Z u = n;
    // special adjustment for low min on -ve side
    final int q = Math.max(min, 2);
    for (int i = min; i < q; ++i) {
      n = n.multiply(i);
    }
    for (int i = q; i <= max; ++i) {
      n = n.multiply(i);
      final StringBuilder sb = new StringBuilder();
      sb.append(i).append("!-1 ");
      final List<Z> fm = FM.get(i);
      Z m = n.subtract(Z.ONE);
      if (fm == null) {
        sb.append(ultimate(i < SMALLEST_MINUS_UNFACTORED, m));
      } else {
        final Z[] f = fm.toArray(new Z[fm.size()]);
        Arrays.sort(f);
        final boolean sawZero = Z.ZERO.equals(f[0]);
        for (int j = sawZero ? 1 : 0; j < f.length; ++j) {
          m = m.divide(f[j]);
          sb.append(f[j]).append('.');
        }
        sb.append(ultimate(sawZero || i < SMALLEST_MINUS_UNFACTORED, m));
      }
      System.out.println(sb.toString());
    }

    System.out.println();
    System.out.println("n!+1 for " + min + " <= n <= " + max);
    System.out.println();
    n = u;
    for (int i = min; i <= max; ++i) {
      n = n.multiply(i);
      final StringBuilder sb = new StringBuilder();
      sb.append(i).append("!+1 ");
      final List<Z> fp = FP.get(i);
      Z m = n.add(1);
      if (fp == null) {
        sb.append(ultimate(i < SMALLEST_PLUS_UNFACTORED, m));
      } else {
        final Z[] f = fp.toArray(new Z[fp.size()]);
        Arrays.sort(f);
        final boolean sawZero = Z.ZERO.equals(f[0]);
        for (int j = sawZero ? 1 : 0; j < f.length; ++j) {
          m = m.divide(f[j]);
          sb.append(f[j]).append('.');
        }
        sb.append(ultimate(sawZero || i < SMALLEST_PLUS_UNFACTORED, m));
      }
      System.out.println(sb.toString());
    }
  }

  private static int[] findMostFactors(final List<List<Z>> fa) {
    int best = 0;
    int besti = 0;
    for (int i = 2; i < fa.size(); ++i) {
      final List<Z> f = fa.get(i);
      if (f != null) {
        int size = f.size();
        if (f.indexOf(Z.ZERO) != -1) {
          --size;
        }
        if (size > best) {
          best = size;
          besti = i;
        }
      }
    }
    return new int[] {besti, best + 1};
  }

  private static int[] findLargestPenultimate(final List<List<Z>> fa) {
    Z best = Z.ZERO;
    int besti = 0;
    for (int i = 2; i < fa.size(); ++i) {
      final List<Z> l = fa.get(i);
      if (l != null) {
        for (final Z f : l) {
          if (f.compareTo(best) > 0) {
            best = f;
            besti = i;
          }
        }
      }
    }
    return new int[] {besti, getDecimalLength(best)};
  }

  private static int[] countUnknowns(final List<List<Z>> fa) {
    final int[] r = new int[3];
    for (int i = Math.min(SMALLEST_PLUS_UNFACTORED, SMALLEST_MINUS_UNFACTORED); i < fa.size(); ++i) {
      if (fa.get(i) == null) {
        r[2]++;
      }
      if (i == 1000) {
        r[0] = r[2];
      }
      if (i == 10000) {
        r[1] = r[2];
      }
    }
    return r;
  }

  private static void graph() {
    // Oversize nodes do not take the ! in the graph.
    final Graph<String, String> g = new Graph<>();
    // Build using FP and FM tables
    for (int k = 2; k < FM.size(); ++k) {
      g.addVertex(k + "!");
    }
    GraphSupport.augmentGraph(g, FM, -1);
    GraphSupport.augmentGraph(g, FP, 1);
    for (final String o : OVERSIZE) {
      final String[] p = o.split("_");
      Vertex<String, String> w = g.getVertex(p[1]);
      if (w == null) {
        w = g.addVertex(p[1]);
      }
      Vertex<String, String> pv = g.getVertex(p[0] + "!");
      if (pv == null) {
        if (p[0].length() < 5) {
          pv = g.addVertex(p[0] + "!");
        } else {
          pv = g.addVertex(p[0]);
        }
      }
      g.addEdge(pv, w, null);
    }
    System.err.println("Order of graph: " + g.order());
    System.err.println("Size of graph: " + g.size());
    final List<Graph<String, String>> c = g.components();
    System.err.println("Components: " + c.size());
    for (final Graph<String, String> sg : c) {
      GraphSupport.dump(sg, 10, g);
    }
  }

  private static void stats() {
    System.err.println("Number of distinct factors (n<" + LIMIT + "): " + FACTORS.size());
    int best = 0;
    for (int i = 2; i < FM.size(); ++i) {
      final List<Z> f = FM.get(i);
      if (f != null) {
        int size = f.size();
        if (f.indexOf(Z.ZERO) != -1) {
          --size;
        }
        if (size > best) {
          best = FM.get(i).size();
        }
      }
    }
    int[] r = findMostFactors(FM);
    System.err.println("Most known factors for n!-1 is " + r[1] + " when n = " + r[0]);
    r = findMostFactors(FP);
    System.err.println("Most known factors for n!+1 is " + r[1] + " when n = " + r[0]);
    r = findLargestPenultimate(FM);
    System.err.println("Largest penultimate factor for n!-1 is " + r[1] + " digits when n = " + r[0]);
    r = findLargestPenultimate(FP);
    System.err.println("Largest penultimate factor for n!+1 is " + r[1] + " digits when n = " + r[0]);
    r = countUnknowns(FM);
    System.err.println("Composites with no known factors for n!-1 is " + r[0] + " (n<=1000)");
    System.err.println("Composites with no known factors for n!-1 is " + r[1] + " (n<=10000)");
    System.err.println("Composites with no known factors for n!-1 is " + r[2] + " (n<=" + LIMIT + ")");
    r = countUnknowns(FP);
    System.err.println("Composites with no known factors for n!+1 is " + r[0] + " (n<=1000)");
    System.err.println("Composites with no known factors for n!+1 is " + r[1] + " (n<=10000)");
    System.err.println("Composites with no known factors for n!+1 is " + r[2] + " (n<=" + LIMIT + ")");

    Z n = Z.ONE;
    final int q = Math.min(SMALLEST_MINUS_UNFACTORED, SMALLEST_PLUS_UNFACTORED);
    for (int i = 2; i < q; ++i) {
      n = n.multiply(i);
    }
    final Small smallM = new Small(FIRST_HOLES);
    final Small smallP = new Small(FIRST_HOLES);
    final int[] fhpi = new int[FIRST_HOLES];
    final int[] fhps = new int[FIRST_HOLES];
    final int[] fhmi = new int[FIRST_HOLES];
    final int[] fhms = new int[FIRST_HOLES];
    for (int i = q, hpi = 0, hmi = 0; i < SMALL_LIMIT; ++i) {
      n = n.multiply(i);
      if (i >= SMALLEST_MINUS_UNFACTORED) {
        Z m = n.subtract(Z.ONE);
        final List<Z> f = FM.get(i);
        if (f == null || f.indexOf(Z.ZERO) == -1) {
          if (f != null) {
            for (final Z aF : f) {
              m = m.divide(aF);
            }
          }
          smallM.check(m, i);
          if (hmi < FIRST_HOLES) {
            fhmi[hmi] = i;
            fhms[hmi++] = getDecimalLength(m);
          }
        }
      }
      if (i >= SMALLEST_PLUS_UNFACTORED) {
        Z m = n.add(Z.ONE);
        final List<Z> f = FP.get(i);
        if (f == null || f.indexOf(Z.ZERO) == -1) {
          if (f != null) {
            for (final Z aF : f) {
              m = m.divide(aF);
            }
          }
          smallP.check(m, i);
          if (hpi < FIRST_HOLES) {
            fhpi[hpi] = i;
            fhps[hpi++] = getDecimalLength(m);
          }
        }
      }
    }

    System.err.println("Smallest composites:");
    System.err.println("  -: " + smallM.dump('-'));
    System.err.println("  +: " + smallP.dump('+'));
    System.err.println("First holes:");
    System.err.print("  -: ");
    for (int i = 0; i < FIRST_HOLES; ++i) {
      if (i != 0) {
        System.err.print(", ");
      }
      System.err.print(fhmi[i] + "!-1 C" + fhms[i]);
    }
    System.err.println();
    System.err.print("  +: ");
    for (int i = 0; i < FIRST_HOLES; ++i) {
      if (i != 0) {
        System.err.print(", ");
      }
      System.err.print(fhpi[i] + "!+1 C" + fhps[i]);
    }
    System.err.println();
  }

  private static final String PRIME_FLAG = "prime";
  private static final String DIVISIBILITY_FLAG = "divides";
  private static final String NOTKNOWN_FLAG = "notknown";
  private static final String ECM_FLAG = "ecm";
  private static final String TABLE_FLAG = "table";
  private static final String COFACTOR_FLAG = "cofactor";
  private static final String MINIMUM_FLAG = "min";
  private static final String MAXIMUM_FLAG = "max";
  private static final String PTESTS_FLAG = "ptests";
  private static final String STATS_FLAG = "stats";
  private static final String GRAPH_FLAG = "graph";

  /**
   * Main program. Run with <code>-h</code> for details.
   * @param args arguments
   * @exception Exception if an error occurs
   */
  public static void main(final String... args) throws Exception {
    // set up and parse command line arguments
    final CliFlags flags = new CliFlags("Factorial", "Program to process factorial factors.");
    flags.registerOptional('p', PRIME_FLAG, "Check factors for primality");
    flags.registerOptional('d', DIVISIBILITY_FLAG, "Check factors are correct");
    flags.registerOptional('c', COFACTOR_FLAG, "Check cofactors in given range for primality");
    flags.registerOptional('k', NOTKNOWN_FLAG, "Print numbers with no known factor");
    flags.registerOptional('e', ECM_FLAG, "Print composites in a form suitable for gmp-ecm");
    flags.registerOptional('t', TABLE_FLAG, "Dump canonical factor table");
    flags.registerOptional('s', STATS_FLAG, "Dump simple statistics");
    flags.registerOptional('g', GRAPH_FLAG, "Compute factor graph");
    flags.registerOptional('m', MINIMUM_FLAG, Integer.class, "minumum", "Minimum index for outputs", 1);
    flags.registerOptional('M', MAXIMUM_FLAG, Integer.class, "maximum", "Maximum index for outputs", LIMIT);
    flags.registerOptional('i', PTESTS_FLAG, Integer.class, "prime-tests", "Number of probabilistic prime tests to perform", 10);
    final Flag<File> x = flags.registerRequired(File.class, "factor-file", "File containing the factors");
    x.setMinCount(1);
    x.setMaxCount(Integer.MAX_VALUE);
    flags.setValidator(flags1 -> {
      final int min = (Integer) flags1.getValue(MINIMUM_FLAG);
      if (min < 1) {
        flags1.setParseMessage("Minimum must be at least 1");
        return false;
      }
      final int max = (Integer) flags1.getValue(MAXIMUM_FLAG);
      if (max < min) {
        flags1.setParseMessage("Maximum must be at least minimum");
        return false;
      }
      if (max > LIMIT) {
        flags1.setParseMessage("Maximum cannot exceed " + LIMIT);
        return false;
      }
      final int ptests = (Integer) flags1.getValue(PTESTS_FLAG);
      if (ptests < 1) {
        flags1.setParseMessage("Number of ptests must be positive.");
        return false;
      }
      return true;
    });

    flags.setFlags(args);
    final int min = (Integer) flags.getValue(MINIMUM_FLAG);
    final int max = (Integer) flags.getValue(MAXIMUM_FLAG);
    final int ptests = (Integer) flags.getValue(PTESTS_FLAG);

    // do actual processing
    for (final Object source : x.getValues()) {
      read((File) source);
    }
    if (flags.isSet(PRIME_FLAG)) {
      checkPrimes(ptests);
    }
    if (flags.isSet(DIVISIBILITY_FLAG)) {
      verify();
    }
    if (flags.isSet(COFACTOR_FLAG)) {
      checkCofactors(min, max, ptests, getCetificateDirectory(x.getValue()));
    }
    if (flags.isSet(NOTKNOWN_FLAG)) {
      dumpNotKnown(min, max);
    }
    if (flags.isSet(ECM_FLAG)) {
      dumpECM(min, max);
    }
    if (flags.isSet(TABLE_FLAG)) {
      dumpTable(min, max);
    }
    if (flags.isSet(GRAPH_FLAG)) {
      graph();
    }
    if (flags.isSet(STATS_FLAG)) {
      stats();
    }
  }
}
