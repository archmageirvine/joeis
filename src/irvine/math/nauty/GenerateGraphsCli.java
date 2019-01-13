package irvine.math.nauty;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import irvine.util.CliFlags;

/**
 * Generate graphs.
 * @author B. D. McKay
 * @author Sean A. Irvine
 */
public final class GenerateGraphsCli {

  private GenerateGraphsCli() { }

/*  Parameters:
             mod, sRes = a way to restrict the output to a subset.
                        All the graphs in G(n, mine..maxe) are divided into
                        disjoint classes C(0, mod),C(1, mod),...,C(mod-1, mod),
                        of very approximately equal size.
                        Only the class C(sRes, mod) is written.

                        If the -x or -X switch is used, they must have the
                        same value for different values of sRes; otherwise
                        the partitioning may not be valid.  In this case
                        (-x,-X with constant value), the usual relationships
                        between modulo classes are obeyed; for example
                        C(3,4) = C(3,8) union C(7,8).  This is not true
                        if 3/8 and 7/8 are done with -x or -X values
                        different from those used for 3/4.

             -x<int> : specify a parameter that determines how evenly
                     the sRes/mod facility splits the graphs into subsets.
                     High values mean more even splitting at slight cost
                     to the total time.  The default is 20*mod, and the
                     the legal minimum is 3*mod.  More information is given
                     under "sRes/mod" above.
             -X<lev> : move the initial splitting level higher by <lev>,
                     in order to force more even splitting at the cost
                     of speed.  Default is -X0.  More information is given
                     under "sRes/mod" above.

Output formats.

  The output format is determined by the mutually exclusive switches
  -u, -n, -y, -g and -s.  The default is -g.

  -u suppresses output of graphs completely.

  -s and -g specify mSparse6 and mGraph6 format, defined elsewhere.
  In this case a header is also written if -h is present.

  If -n is present, any output graphs are written in nauty format.

    For a graph of n vertices, the output consists of one int giving
    the number of vertices, and n setwords containing the adjacency
    matrix.  Note that this is system dependent (i.e. don't use it).
    It will not work properly if the output is to stdout and your
    system distinguishes binary and text files.

prune feature.

   By defining the C preprocessor variable prune at compile time, geng
   can be made to call
        int prune(graph *g, int n, int maxn)
   for each intermediate (and final) graph, and reject it if
   the value returned is nonzero.  The arguments are:

     g      = the graph in nauty format (m=1)
     n      = the number of vertices in g
     maxn   = the number of vertices for output
              (the value you gave on the command line to geng)

   geng constructs the graph starting with vertex 0, then adding
   vertices 1,2,3,... in that order.  Each graph in the sequence is
   an induced subgraph of all later graphs in the sequence.

   A call is made for all orders from 1 to maxn.  In testing for
   a uniform property (such as a forbidden subgraph or forbidden
   induced subgraph) it might save time to notice that a call to
   prune for n implies that the call for n-1 already passed.

   For very fast tests, it might be worthwhile using preprune as
   well.  It has the same meaning but is applied earlier and more
   often.

**************************************************************************

Sample performance statistics (from the C version).

    Here we give some graph counts and execution times on a Linux
    Pentium III running at 550 MHz.  Times are with the -u option
    (generate but don't write); add 3-5 microseconds per graph for
    output to a file.  Add another 0.2-0.3 microseconds per graph
    if you specify connectivity (-c), or 0.6-0.7 microseconds per
    graph if you specific biconnectivity (-C).


      General Graphs                     C3-free Graphs (-t)

      1              1                    1              1
      2              2                    2              2
      3              4                    3              3
      4             11                    4              7
      5             34                    5             14
      6            156                    6             38
      7           1044                    7            107
      8          12346   0.11 sec         8            410
      9         274668   1.77 sec         9           1897
     10       12005168   1.22 min        10          12172   0.21 sec
     11     1018997864   1.72 hr         11         105071   1.49 sec
     12   165091172592    285 hr         12        1262180   15.9 sec
     13 50502031367952  ~10 years        13       20797002   4.08 min
    These can be done in about half      14      467871369   1.50 hr
    the time by setting the edge limit   15    14232552452   45.6 hr
    half way then adding complements.    16   581460254001   79 days
                                         17 31720840164950

     C4-free Graphs  (-f)              (C3,C4)-free Graphs (-tf)

      1             1                      1            1
      2             2                      2            2
      3             4                      3            3
      4             8                      4            6
      5            18                      5           11
      6            44                      6           23
      7           117                      7           48
      8           351                      8          114
      9          1230                      9          293
     10          5069   0.11 sec          10          869
     11         25181   0.48 sec          11         2963   0.10 sec
     12        152045   2.67 sec          12        12066   0.36 sec
     13       1116403   18.0 sec          13        58933   1.50 sec
     14       9899865   2.50 min          14       347498   7.76 sec
     15     104980369   25.7 min          15      2455693   50.9 sec
     16    1318017549   5.33 hr           16     20592932   6.79 min
     17   19427531763   82.6 hr           17    202724920   1.11 hr
     18  333964672216   62 days           18   2322206466   12.7 hr
     19 6660282066936                     19  30743624324   168 hr
                                          20 468026657815   110 days

                   Old value was wrong:  18   2142368552  (The program was
                   ok, but somehow we tabulated the answer incorrectly.)


     Bipartite Graphs (-b)            C4-free Bipartite Graphs (-bf)

      1              1                      1            1
      2              2                      2            2
      3              3                      3            3
      4              7                      4            6
      5             13                      5           10
      6             35                      6           21
      7             88                      7           39
      8            303                      8           86
      9           1119                      9          182
     10           5479   0.11 sec          10          440
     11          32303   0.59 sec          11         1074
     12         251135   3.99 sec          12         2941   0.15 sec
     13        2527712   35.1 sec          13         8424   0.43 sec
     14       33985853   7.22 min          14        26720   1.37 sec
     15      611846940   2.05 hr           15        90883   4.30 sec
     16    14864650924   48.9 hr           16       340253   14.9 sec
     17   488222721992   70 days           17      1384567   57.1 sec
     18 21712049275198                     18      6186907   4.01 min
                                           19     30219769   18.4 min
                                           20    161763233   1.57 hr
                                           21    946742190   8.85 hr
                                           22   6054606722   56.2 hr
                                           23  42229136988   16.6 days
                                           24 320741332093   121 days

If you know any more of these counts, please tell me.

**************************************************************************

Hints:

To make all the graphs of order n, without restriction on type,
it is fastest to make them up to binomial(n,2)/2 edges and append
the complement of those with strictly less than binomial(n,2)/2 edges.

If it is necessary to split the computation into pieces, it is more
efficient to use the sRes/mod feature than to split by numbers of edges.

The memory requirements are exponential in n if no maxdeg is given.
For maxdeg=D, the requirements are still exponential (but smaller)
for general graphs, but O(n^D) for other graphs.  Use -m to reduce
the memory requirements to O(n^D) for general graphs too, at the
cost of a small increase in cpu time.

**************************************************************************

    Author:   B. D. McKay, Sep 1991 and many later dates.
              Copyright  B. McKay (1991-2013).  All rights reserved.
              This software is subject to the conditions and waivers
              detailed in the file nauty.h.

**************************************************************************/

  static final String NO_OUTPUT_FLAG = "count-only";
  private static final String NAUTY_OUTPUT_FLAG = "nauty";
  private static final String GRAPH6_OUTPUT_FLAG = "graph6";
  static final String MIN_DEGREE_FLAG = "min-degree";
  static final String MAX_DEGREE_FLAG = "max-degree";
  private static final String MIN_EDGES_FLAG = "min-edges";
  static final String MAX_EDGES_FLAG = "max-edges";
  private static final String CONNECTED_FLAG = "connected";
  private static final String BICONNECTED_FLAG = "biconnected";
  private static final String TRIANGLE_FREE_FLAG = "triangle-free";
  private static final String SQUARE_FREE_FLAG = "square-free";
  private static final String BIPARTITE_FLAG = "bipartite";
  private static final String OUTPUT_FLAG = "output";
  private static final String CANONISE_FLAG = "canonise";
  private static final String SAVE_MEMORY_FLAG = "save-memory";
  static final String VERBOSE_FLAG = "verbose";
  private static final String SPLIT_LEVEL_INC_FLAG = "split-level-int";
  static final String QUIET_FLAG = "quiet";
  private static final String SAFE_FLAG = "safe";
  private static final String SUBSET_FLAG = "subset";

  private static final String[] OUTPUT_TYPE_FLAGS = {NO_OUTPUT_FLAG, NAUTY_OUTPUT_FLAG, GRAPH6_OUTPUT_FLAG};

  private static final int PRUNEMULT = 20; /* bigger -> more even split at greater cost */

  private static class GenerateGraphsCliValidator implements CliFlags.Validator {
    @Override
    public boolean isValid(final CliFlags flags) {
      int mutex = 0;
      for (final String flagName : OUTPUT_TYPE_FLAGS) {
        if (flags.isSet(flagName)) {
          ++mutex;
        }
      }
      if (mutex > 1) {
        flags.setParseMessage("Only one of -u, -g can be specified");
        return false;
      }
      final int n = (Integer) flags.getAnonymousValue(0);
      if (n < 1 || n > GenerateGraphs.MAXN) {
        flags.setParseMessage("Number of vertices must be in range 1.." + GenerateGraphs.MAXN);
        return false;
      }
      return true;
    }
  }

  private static CliFlags initFlags() {
    final CliFlags flags = new CliFlags("GenerateGraphs", "Generate all graphs of a specified class.");
    flags.registerOptional('n', NAUTY_OUTPUT_FLAG, "output graphs in nauty format");
    flags.registerOptional('g', GRAPH6_OUTPUT_FLAG, "output graphs in graph6 format (default)");
    flags.registerOptional('u', NO_OUTPUT_FLAG, "do not output generated graphs, just count them");
    flags.registerOptional('d', MIN_DEGREE_FLAG, Integer.class, "INTEGER", "lower bound for the minimum degree");
    flags.registerOptional('D', MAX_DEGREE_FLAG, Integer.class, "INTEGER", "upper bound for the maximum degree");
    flags.registerOptional('m', MIN_EDGES_FLAG, Integer.class, "INTEGER", "minimum number of edges");
    flags.registerOptional('M', MAX_EDGES_FLAG, Integer.class, "INTEGER", "maximum number of edges");
    flags.registerOptional('c', CONNECTED_FLAG, "only generate connected graphs");
    flags.registerOptional('C', BICONNECTED_FLAG, "only generate biconnected graphs");
    flags.registerOptional('t', TRIANGLE_FREE_FLAG, "only generate triangle-free graphs");
    flags.registerOptional('f', SQUARE_FREE_FLAG, "only generate 4-cycle-free graphs");
    flags.registerOptional('b', BIPARTITE_FLAG, "only generate bipartite graphs");
    flags.registerOptional('o', OUTPUT_FLAG, String.class, "FILE", "name of file to write output into (default is stdout)");
    flags.registerOptional('l', CANONISE_FLAG, "canonically label output graphs");
    flags.registerOptional(SAVE_MEMORY_FLAG, "save memory at the expense of time (only affects certain cases)");
    flags.registerOptional('v', VERBOSE_FLAG, "display counts by number of edges");
    flags.registerOptional('q', QUIET_FLAG, "produce less output");
    flags.registerOptional('r', SUBSET_FLAG, String.class, "r/n", "only generate residue class r out of n", "0/1");
    flags.registerOptional('X', SPLIT_LEVEL_INC_FLAG, Integer.class, "INTEGER", "split level increment", 0);
    flags.registerOptional('S', SAFE_FLAG, "use extra safety margin on edges in some circumstances");
    flags.registerRequired(Integer.class, "n", "number of vertices");
    return flags;
  }

  private static OutputStream getOutputStream(final CliFlags flags) throws IOException {
    if (flags.isSet(OUTPUT_FLAG)) {
      final String value = (String) flags.getValue(OUTPUT_FLAG);
      return "-".equals(value) ? System.out : new BufferedOutputStream(new FileOutputStream(value));
    }
    return System.out;
  }

  /**
   * Main program. See help text.
   * @param args see help
   * @throws java.io.IOException if an I/O error occurs.
   */
  public static void main(final String... args) throws IOException {
    final CliFlags flags = initFlags();
    flags.setValidator(new GenerateGraphsCliValidator());
    flags.setFlags(args);

    final boolean triangleFree = flags.isSet(TRIANGLE_FREE_FLAG);
    final boolean bipartite = flags.isSet(BIPARTITE_FLAG);
    final boolean squareFree = flags.isSet(SQUARE_FREE_FLAG);
    final boolean connec1 = flags.isSet(CONNECTED_FLAG);
    final boolean connec2 = flags.isSet(BICONNECTED_FLAG);

    final boolean quiet = flags.isSet(QUIET_FLAG);
    final boolean verbose = flags.isSet(VERBOSE_FLAG);

    final String resMod = (String) flags.getValue(SUBSET_FLAG);
    final int slash = resMod.indexOf('/');
    if (slash == -1) {
      System.err.println("Invalid subset: " + resMod);
    }
    final int res = Integer.parseInt(resMod.substring(0, slash));
    final int mod = Integer.parseInt(resMod.substring(slash + 1));
    if (res < 0 || res >= mod) {
      System.err.println("Invalid subset: " + resMod);
    }

    final GenerateGraphs gg = new GenerateGraphs(mod);
    final int n = (Integer) flags.getAnonymousValue(0);
    gg.setVertices(n);
    gg.mCanonise = flags.isSet(CANONISE_FLAG);
    if (flags.isSet(MIN_DEGREE_FLAG)) {
      gg.setMinDeg((Integer) flags.getValue(MIN_DEGREE_FLAG));
    }
    if (flags.isSet(MAX_DEGREE_FLAG)) {
      gg.setMaxDeg((Integer) flags.getValue(MAX_DEGREE_FLAG));
    }
    if (flags.isSet(MIN_EDGES_FLAG)) {
      gg.setMinEdges((Integer) flags.getValue(MIN_EDGES_FLAG));
    }
    if (flags.isSet(MAX_EDGES_FLAG)) {
      gg.setMaxEdges((Integer) flags.getValue(MAX_EDGES_FLAG));
    } else {
      gg.setMaxEdges((n * n - n) / 2);
    }

    if (connec2) {
      gg.setConnectionLevel(2);
    } else if (connec1) {
      gg.setConnectionLevel(1);
    } else {
      gg.setConnectionLevel(0);
    }
    gg.sanitizeParams();

    int tmaxe;
    if (bipartite) {
      if (squareFree) {
        tmaxe = new MaxEdgesBipartiteSquareFree().getMaxEdges(gg.mMaxN);
      } else {
        tmaxe = new MaxEdgesTriangleFree().getMaxEdges(gg.mMaxN); // bipartite maximum is the same as triangle free
      }
    } else if (triangleFree) {
      if (squareFree) {
        tmaxe = new MaxEdgesTriangleAndSquareFree().getMaxEdges(gg.mMaxN);
      } else {
        tmaxe = new MaxEdgesTriangleFree().getMaxEdges(gg.mMaxN);
      }
    } else if (squareFree) {
      tmaxe = new MaxEdgesSquareFree().getMaxEdges(gg.mMaxN);
    } else {
      tmaxe = (gg.mMaxN * gg.mMaxN - gg.mMaxN) / 2;
    }

    if (flags.isSet(SAFE_FLAG)) {
      ++tmaxe;
    }

    if (gg.mMaxE > tmaxe) {
      gg.setMaxEdges(tmaxe);
    }

    GenerateGraphs.sMultiplicity = PRUNEMULT * mod;
    if (!quiet) {
      System.err.println(">A " + Arrays.toString(args));
    }

    try (OutputStream out = getOutputStream(flags)) {
      if (flags.isSet(NAUTY_OUTPUT_FLAG)) {
        gg.setProcessor(new WriteNauty(out));
      } else if (flags.isSet(NO_OUTPUT_FLAG)) {
        gg.setProcessor(new NullWrite());
      } else {
        gg.setProcessor(new WriteG6X(new OutputStreamWriter(out)));
      }

      final long t1 = System.currentTimeMillis();

      gg.run(bipartite, squareFree, triangleFree, (Integer) flags.getValue(SPLIT_LEVEL_INC_FLAG), res);

      final long t2 = System.currentTimeMillis();
      final long nout = gg.totalCount();

      if (verbose) {
        gg.dumpEdgeCounts(System.err);
      }

      if (!quiet) {
        System.err.printf(">Z " + nout + " graphs generated in %3.2f sec\n", (t2 - t1) / 1000.0);
      }
    }
  }

}
