package irvine.oeis.a059;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.r.DoubleUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.LimitedLengthPriorityQueue;

/**
 * A059518 a(n)/n^2 is the minimal average squared Euclidean distance of n points to their center of gravity among all configurations of n points on the hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A059518 extends Sequence1 {

  // WARNING: Heuristic, do not use this to extend the sequence

  private static final int RETAINED_COUNT = 1000;
  private static final Lattice L = Lattices.HEXAGONAL;
  private static final double COS30 = Math.cos(Math.PI / 6);
  private long mN = 0;
  private LimitedLengthPriorityQueue<Diagram> mSolutions = new LimitedLengthPriorityQueue<>(RETAINED_COUNT, false);
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private static final class Diagram extends TreeSet<Long> implements Comparable<Diagram> {

    @Override
    public int compareTo(final Diagram other) {
      final int d = Integer.compare(size(), other.size());
      if (d != 0) {
        return d;
      }
      for (final Iterator<Long> it1 = iterator(), it2 = other.iterator(); it1.hasNext();) {
        final long a = it1.next();
        final long b = it2.next();
        final int cmp = Long.compare(a, b);
        if (cmp != 0) {
          return cmp;
        }
      }
      return 0;
    }

    private boolean isAcceptable() {
      // We only both remembering points where the centre of mass is inside a unit square.
      // This could be made even tighter, but seems good enough in practice.
      long sumX = 0;
      long sumY = 0;
      for (final long pt : this) {
        sumX += L.ordinate(pt, 0);
        sumY += L.ordinate(pt, 1);
      }
      final double cx = 0.5 * sumX / size();
      final double cy = COS30 * sumY / size();
      return cx >= 0 && cx <= 1 && cy >= 0 && cy <= 1;
    }
  }

  private long[] neighbours(final Set<Long> set) {
    final HashSet<Long> t = new HashSet<>();
    for (final long pt : set) {
      for (final long q : L.neighbours(pt)) {
        if (!set.contains(q)) {
          t.add(q);
        }
      }
    }
    final long[] res = new long[t.size()];
    int k = 0;
    for (final long p : t) {
      res[k++] = p;
    }
    return res;
  }

  private double sqDistance(final Set<Long> pts) {
    long sumX = 0;
    long sumY = 0;
    for (final long pt : pts) {
      sumX += L.ordinate(pt, 0);
      sumY += L.ordinate(pt, 1);
    }
    final double cx = 0.5 * sumX / pts.size();
    final double cy = COS30 * sumY / pts.size();
    double sqd = 0;
    for (final long pt : pts) {
      final double rx = cx - 0.5 * L.ordinate(pt, 0);
      final double ry = cy - COS30 * L.ordinate(pt, 1);
      sqd += rx * rx + ry * ry;
    }
    return sqd;
  }

  private String toTikz(final Set<Long> points) {
    long sumX = 0;
    long sumY = 0;
    final StringBuilder sb = new StringBuilder();
    sb.append("\\noindent$n=").append(mN).append("$, $n^2R^2=").append(DoubleUtils.NF4.format(sqDistance(points) * mN)).append("$\\\\\n");
    sb.append("\\begin{tikzpicture}[scale=0.5]\n");
    for (final long point : points) {
      final long x = L.ordinate(point, 0);
      final long y = L.ordinate(point, 1);
      sumX += x;
      sumY += y;
      sb.append("  \\draw[fill] (")
        .append(DoubleUtils.NF4.format(0.5 * x))
        .append(',')
        .append(DoubleUtils.NF4.format(COS30 * y))
        .append(") circle (.5ex);\n");
    }
    final double cx = 0.5 * sumX / points.size();
    final double cy = COS30 * sumY / points.size();
    sb.append("  \\draw[red] (")
      .append(DoubleUtils.NF4.format(cx))
      .append(',')
      .append(DoubleUtils.NF4.format(cy))
      .append(") circle (.5ex);\n");
    sb.append("\\end{tikzpicture}");
    return sb.toString();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      final Diagram root = new Diagram();
      root.add(L.origin());
      mSolutions.add(sqDistance(root), root);
      return Z.ZERO;
    } else {
      final LimitedLengthPriorityQueue<Diagram> newSolutions = new LimitedLengthPriorityQueue<>(RETAINED_COUNT, false);
      for (final LimitedLengthPriorityQueue.Node<Diagram> node : mSolutions) {
        final Diagram n = node.getValue();
        final long[] neighbours = neighbours(n);
        for (final long v : neighbours) {
          final Diagram u = new Diagram();
          u.addAll(n);
          u.add(v);
          if (u.isAcceptable()) {
            newSolutions.add(sqDistance(u), u);
          }
        }
      }
      mSolutions = newSolutions;
      if (mVerbose) {
        System.out.println(toTikz(mSolutions.first().getValue()));
      }
      return Z.valueOf(Math.round(mSolutions.first().getScore() * mN));
    }
  }
}

