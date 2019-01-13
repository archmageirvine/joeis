package irvine.factor.project.factorial;

import java.util.List;

import irvine.graph.Graph;
import irvine.graph.Vertex;
import irvine.math.z.Z;
import irvine.util.string.Date;

/**
 * Component factorial graph support functions.
 *
 * @author Sean A. Irvine
 */
public final class GraphSupport {

  private GraphSupport() { }

  private static void addEdge(final Graph<String, String> g, final Vertex<String, String> s, final Z z) {
    if (z.bitLength() < 1000 && z.bitLength() > 1) {
      final String label = z.toString();
      Vertex<String, String> v = g.getVertex(label);
      if (v == null) {
        v = g.addVertex(label);
      }
      g.addEdge(s, v, null);
    }
  }

  private static void applyReflection(final Graph<String, String> g, final Z z, final int k) {
    // Reflection formula p | n!+-1 => p | h!+-1 where h = p - n - 1
    final Z h = z.add(-k - 1);
    if (h.bitLength() < 64 && h.bitLength() > 1) {
      final String yl = h.toString() + "!";
      Vertex<String, String> y = g.getVertex(yl);
      if (y == null) {
        y = g.addVertex(yl);
      }
      if (!y.isAdjacent(g.getVertex(z.toString()))) {
        addEdge(g, y, z);
      }
    }
  }

  static void augmentGraph(final Graph<String, String> g, final List<List<Z>> a, final long inc) {
    Z fac = Z.ONE;
    for (int k = 2; k < a.size(); ++k) {
      fac = fac.multiply(k);
      Z zf = fac.add(inc);
      final Vertex<String, String> fv = g.getVertex(k + "!");
      final List<Z> f = a.get(k);
      if (f != null) {
        for (final Z z : f) {
          if (!z.equals(Z.ZERO)) {
            zf = zf.divide(z);
            addEdge(g, fv, z);
            applyReflection(g, z, k);
          }
        }
        if (!Z.ZERO.equals(zf)) {
          addEdge(g, fv, zf);
          applyReflection(g, zf, k);
        }
      }
    }
  }

  static void dump(final Graph<String, String> g, final int threshold, final Graph<String, String> parent) {
    // This is an example of a way to print all the contributors to a component
    if (g.getVertex("2!") != null) {
      for (final Vertex<String, String> v : g.vertices()) {
        if (v.label().endsWith("!")) {
          System.err.println(v.label());
        }
      }
    }
    // Apply: if p is a prime, then p | (p-1)!+1 and p | (p-2)!-1
    // Apply: n odd, 2n+1 prime, then 2n+1 | n! + 1 xor 2n+1 | n!-1
    for (final Vertex<String, String> v : g.vertices()) {
      final String l = v.label();
      if (l.endsWith("!")) {
        final Z z = new Z(l.substring(0, l.length() - 1));
        if (z.compareTo(Z.valueOf(100000)) > 0) {
          final Z zp1 = z.add(1);
          final String sp1 = zp1.toString();
          if (g.getVertex(sp1) == null && parent.getVertex(sp1) != null && zp1.isProbablePrime(30)) {
            System.err.println(Date.getDate() + z + "!+1 " + sp1 + " SAI");
          } else {
            final Z zp2 = z.add(2);
            final String sp2 = zp2.toString();
            if (g.getVertex(sp2) == null && parent.getVertex(sp2) != null && zp2.isProbablePrime(30)) {
              System.err.println(Date.getDate() + z + "!-1 " + sp2 + " SAI");
            }
          }
          if (!z.isEven()) {
            final Z q = z.multiply2().add(1);
            final String sq = q.toString();
            if (g.getVertex(sq) == null && parent.getVertex(sq) != null && q.isProbablePrime(30)) {
              if (z.compareTo(Z.valueOf(100000000)) < 0) {
                // Attempt real resolution of side
                final long lz = z.longValue();
                final long m = 2 * lz + 1;
                long f = 1;
                for (long k = 2; k <= lz; ++k) {
                  f *= k;
                  f %= m;
                }
                if (f == 1) {
                  System.err.println(Date.getDate() + z + "!-1 " + sq + " SAI");
                } else if (f == m - 1) {
                  System.err.println(Date.getDate() + z + "!+1 " + sq + " SAI");
                } else {
                  System.err.println("Huh: " + z + " " + sq);
                }
              } else {
                System.err.println(Date.getDate() + z + "!?1 " + sq + " SAI");
              }
            }
          }
        }
      }
    }
    int f = 0;
    String rep = null;
    for (final Vertex<String, String> v : g.vertices()) {
      final String l = v.label();
      if (l.endsWith("!") && Long.parseLong(l.substring(0, l.length() - 1)) < 100000) {
        ++f;
        if (rep == null) {
          rep = v.label();
        }
      }
    }
    if (f > threshold) {
      System.err.println(rep + " order of component=" + f);
    }
  }
}
