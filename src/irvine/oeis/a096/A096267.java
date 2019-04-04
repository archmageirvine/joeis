package irvine.oeis.a096;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A096267.
 * @author Sean A. Irvine
 */
public class A096267 implements Sequence {

  // Polysticks or polyedges
  // Better methods are known
  // This only good for a few terms
  // Note other sequences extend this one, so be careful with any change to a better algorithm

  // Pack coordinates into an int (16-bits per coordinate with offset of BIAS to avoid
  // having to deal with negative values).

  protected static final int BIAS = 1 << 15; // to avoid having to worry about negatives
  private static final int BITS = Short.SIZE;
  private static final int[] DELTAS = {1, -1, 1 << BITS, -1 << BITS};

  private int mN = 0;
  protected Set<TreeSet<Long>> mPolystickDiagrams = new HashSet<>();

  protected static int pack(final int x, final int y) {
    return ((x + BIAS) << BITS) + (y & 0xFFFF) + BIAS;
  }

  protected static long edge(final int u, final int v) {
    return u < v ? ((long) u << Integer.SIZE) + (v & 0xFFFFFFFFL) : ((long) v << Integer.SIZE) + (u & 0xFFFFFFFFL);
  }

  protected TreeSet<Long> translate(final TreeSet<Long> diagram) {
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;
    for (final long edge : diagram) {
      final int u = (int) edge;
      final int x0 = (u >>> BITS) - BIAS;
      if (x0 < minX) {
        minX = x0;
      }
      final int y0 = (u & 0xFFFF) - BIAS; // does sign extension up to int
      if (y0 < minY) {
        minY = y0;
      }
      final int v = (int) (edge >>> Integer.SIZE);
      final int x1 = (v >>> BITS) - BIAS;
      if (x1 < minX) {
        minX = x1;
      }
      final int y1 = (v & 0xFFFF) - BIAS;
      if (y1 < minY) {
        minY = y1;
      }
    }
    if (minX == 0 && minY == 0) {
      return diagram; // already at right place
    }
    final int t = (-minX << Short.SIZE) - minY;
    final TreeSet<Long> canon = new TreeSet<>();
    for (final long e : diagram) {
      canon.add(edge((int) (e >>> Integer.SIZE) + t, (int) e + t));
    }
    return canon;
  }

  protected TreeSet<Long> canon(final TreeSet<Long> diagram) {
    return translate(diagram);
  }

  private void step(final Set<TreeSet<Long>> newDiagrams, final Set<Long> diagram) {
    final Set<Integer> vertices = new TreeSet<>();
    for (final long edge : diagram) {
      vertices.add((int) edge);
      vertices.add((int) (edge >>> Integer.SIZE));
    }
    for (final int v : vertices) {
      for (final int delta : DELTAS) {
        final int u = v + delta;
        final long e = edge(u, v);
        if (!diagram.contains(e)) {
          final TreeSet<Long> newDiagram = new TreeSet<>(diagram);
          newDiagram.add(e);
          newDiagrams.add(canon(newDiagram));
        }
      }
    }
  }

  // Add one more edge in all possible ways
  private Set<TreeSet<Long>> step(final Set<TreeSet<Long>> diagrams) {
    final Set<TreeSet<Long>> newDiagrams = new HashSet<>();
    for (final Set<Long> diagram : diagrams) {
      step(newDiagrams, diagram);
    }
    return newDiagrams;
  }

//  private void coords(final StringBuilder sb, final int u) {
//    sb.append('(').append((u >>> BITS) - BIAS).append(',').append((u & 0xFFFF) - BIAS).append(')');
//  }
//
//  private String toString(final Set<Long> diagram) {
//    final StringBuilder sb = new StringBuilder();
//    sb.append('[');
//    for (final long e : diagram) {
//      if (sb.length() > 1) {
//        sb.append(", ");
//      }
//      final int u = (int) (e >> Integer.SIZE);
//      coords(sb, u);
//      sb.append("--");
//      coords(sb, (int) e);
//    }
//    sb.append(']');
//    return sb.toString();
//  }
//
//  private void dump() {
//    for (final Set<Long> diagram : mPolystickDiagrams) {
//      System.out.println(toString(diagram));
//    }
//  }

  protected void init() {
    final TreeSet<Long> d0 = new TreeSet<>();
    d0.add(edge(pack(0, 0), pack(0, 1)));
    mPolystickDiagrams.add(d0);
    final TreeSet<Long> d1 = new TreeSet<>();
    d1.add(edge(pack(0, 0), pack(1, 0)));
    mPolystickDiagrams.add(d1);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      init();
    } else {
      mPolystickDiagrams = step(mPolystickDiagrams);
    }
    //dump();
    return Z.valueOf(mPolystickDiagrams.size());
  }

}
