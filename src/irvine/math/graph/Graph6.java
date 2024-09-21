package irvine.math.graph;

/**
 * Routines pertaining to the <code>graph6</code> format defined by Brendan McKay.
 * See <code>http://cs.anu.edu.au/~bdm/data/formats.txt</code>.
 * @author Sean A. Irvine
 */
public final class Graph6 {

  private Graph6() { }

  private static final int BIAS6 = 63;
  private static final int C6MASK = 63;
  private static final int TOPBIT6 = 32;
  private static final char MAXBYTE = 126;
  private static final long SMALL_N = 62;
  private static final long MEDIUM_N = 258047;
  private static final long MAX_N = 1L << 36 - 1;

  private static char toChar(final long n) {
    return (char) (BIAS6 + n);
  }

  // Encode a non-negative integer
  private static String encode(final long n) {
    if (n < 0 || n > MAX_N) {
      throw new IllegalArgumentException();
    }
    if (n <= SMALL_N) {
      return String.valueOf(toChar(n));
    }
    if (n <= MEDIUM_N) {
      return String.valueOf(MAXBYTE) + toChar(n >> 12) + toChar((n >> 6) & C6MASK) + toChar(n & C6MASK);
    }
    return String.valueOf(MAXBYTE) + String.valueOf(MAXBYTE) + toChar(n >> 30) + toChar((n >> 24) & C6MASK)
      + toChar((n >> 18) & C6MASK)  + toChar((n >> 12) & C6MASK)  + toChar((n >> 6) & C6MASK) + toChar(n & C6MASK);
  }

  private static int toInt(final String s, final int pos) {
    if (pos >= s.length()) {
      throw new IllegalArgumentException(s);
    }
    final int res = s.charAt(pos) - BIAS6;
    if (res < 0 || res > BIAS6) {
      throw new IllegalArgumentException(s);
    }
    return res;
  }

  private static long decode(final String n) {
    final long v0 = toInt(n, 0);
    if (v0 <= SMALL_N) {
      return v0;
    }
    final long v1 = toInt(n, 1);
    if (v1 <= SMALL_N) {
      return (v1 << 12) + ((long) toInt(n, 2) << 6) + toInt(n, 3);
    }
    long r = 0;
    for (int k = 2; k < 8; ++k) {
      r <<= 6;
      r += toInt(n, k);
    }
    return r;
  }

  private static int consume(final long n) {
    if (n <= SMALL_N) {
      return 1;
    }
    if (n <= MEDIUM_N) {
      return 4;
    }
    return 8;
  }

  /**
   * Convert a graph to its <code>graph6</code> representation
   * @param graph graph to convert
   * @return representation
   */
  public static String toGraph6(final Graph graph) {
    final StringBuilder p = new StringBuilder();
    p.append(encode(graph.order()));
    int k = 6;
    char x = 0;
    for (int j = 1; j < graph.order(); ++j) {
      for (int i = 0; i < j; ++i) {
        x <<= 1;
        if (graph.isAdjacent(j, i)) {
          x |= 1;
        }
        if (--k == 0) {
          p.append((char) (BIAS6 + x));
          k = 6;
          x = 0;
        }
      }
    }

    if (k != 6) {
      p.append((char) (BIAS6 + (x << k)));
    }
    return p.toString();
  }

  /**
   * Convert a <code>graph6</code> string into a graph
   * @param graph6 graph description
   * @return the graph
   */
  public static Graph toGraph(final String graph6) {
    final long order = decode(graph6);
    if (order > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    final int n = (int) order;
    int parsePos = consume(order);
    final Graph g = GraphFactory.create(n);
    int k = 1;
    int x = 0;
    for (int j = 1; j < n; ++j) {
      for (int i = 0; i < j; ++i) {
        if (--k == 0) {
          k = 6;
          x = toInt(graph6, parsePos++);
        }
        if ((x & TOPBIT6) != 0) {
          g.addEdge(i, j);
        }
        x <<= 1;
      }
    }
    return g;
  }
}
