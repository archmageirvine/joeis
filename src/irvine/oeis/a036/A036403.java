package irvine.oeis.a036;

import java.util.HashSet;

import irvine.math.r.Constants;
import irvine.math.r.DoubleUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036403.
 * @author Sean A. Irvine
 */
public class A036403 implements Sequence {

  // Brute force, there is probably symmetry to do this smarter ...
  // This will likely encounter accuracy problems at some point.

  private static final double TOLERANCE = 1e-6;
  private int mN = 0;

  private static class RealPoint {

    private final double mRealX;
    private final double mRealY;
    private final long mX;
    private final long mY;

    private RealPoint(final double x, final double y) {
      mRealX = x;
      mRealY = y;
      mX = Math.round(x / TOLERANCE);
      mY = Math.round(y / TOLERANCE);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof RealPoint)) {
        return false;
      }
      final RealPoint o = (RealPoint) obj;
      return mX == o.mX && mY == o.mY;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(mX) * 65537 + Long.hashCode(mY);
    }

    @Override
    public String toString() {
      return "(" + DoubleUtils.NF4.format(mRealX) + "," + DoubleUtils.NF4.format(mRealY) + ")";
    }
  }

  @Override
  public Z next() {
    ++mN;
    // Compute coordinates for 3*n points of 3n-gon.
    // Put the center of the 3n-gon at (0,0), so that (xk,yk)=(cos(k*theta),sin(k*theta))
    final double[] x = new double[3 * mN];
    final double[] y = new double[3 * mN];
    final double theta = Constants.TAU / (3 * mN);
    for (int k = 0; k < x.length; ++k) {
      x[k] = Math.cos(k * theta);
      y[k] = Math.sin(k * theta);
    }
//    System.out.println("x: " + Arrays.toString(x));
//    System.out.println("y: " + Arrays.toString(y));

    // Every (distinct) pair of these points defines a line.
    // Choose two distinct lines and compute their unique point of intersection
    final HashSet<RealPoint> points = new HashSet<>();
    for (int a = 0; a < x.length; ++a) {
      for (int b = a + 1; b < x.length; ++b) {
        // (x[a],y[b]) -- (x[b],y[b]) is a line
        for (int c = a; c < x.length; ++c) {
          for (int d = c == a ? b + 1 : c + 1; d < x.length; ++d) {
            if (c != a || d != b) {
              // (x[c],y[c]) -- (x[d],y[d]) is a different line
              final double r = x[a] * y[b] - y[a] * x[b];
              final double s = x[c] * y[d] - y[c] * x[d];
              final double w = (x[a] - x[b]) * (y[c] - y[d]) - (y[a] - y[b]) * (x[c] - x[d]);
              if (Math.abs(w) > TOLERANCE) { // non-parallel
                final double tx = (r * (x[c] - x[d]) - s * (x[a] - x[b])) / w;
                final double ty = (r * (y[c] - y[d]) - s * (y[a] - y[b])) / w;
                points.add(new RealPoint(tx, ty));
              }
            }
          }
        }
      }
    }
    //System.out.println(points.size() + " " + points);

    // Test triples for equilateral
    long count = 0;
    final RealPoint[] pts = points.toArray(new RealPoint[0]);
    for (int k = 0; k < pts.length; ++k) {
      for (int j = k + 1; j < pts.length; ++j) {
        // Compute distance between points k and j
        final double dx = pts[k].mRealX - pts[j].mRealX;
        final double dy = pts[k].mRealY - pts[j].mRealY;
        final double dist2 = dx * dx + dy * dy;
        for (int i = j + 1; i < pts.length; ++i) {
          // Check if distance to a third point matches
          final double dxk = pts[k].mRealX - pts[i].mRealX;
          final double dyk = pts[k].mRealY - pts[i].mRealY;
          final double dist2k = dxk * dxk + dyk * dyk;
          if (Math.abs(dist2k - dist2) < TOLERANCE) {
            final double dxj = pts[j].mRealX - pts[i].mRealX;
            final double dyj = pts[j].mRealY - pts[i].mRealY;
            final double dist2j = dxj * dxj + dyj * dyj;
            if (Math.abs(dist2j - dist2) < TOLERANCE) {
              ++count;
            }
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
