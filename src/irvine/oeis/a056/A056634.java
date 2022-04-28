package irvine.oeis.a056;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a002.A002931;
import irvine.util.Point;

/**
 * A056634 Number of polygons of length 2n with one hole on square lattice (not allowing rotations).
 * @author Sean A. Irvine
 */
public class A056634 extends A002931 {

  // WARNING: This is insanely slow

  private static final Point ORIGIN = new Point(0, 0);
  private final List<List<Polygon>> mSmall = new ArrayList<>();
  private final List<List<int[]>> mSmallBounds = new ArrayList<>();
  {
    mSmall.add(Collections.emptyList()); // 0
  }
  private final A002931 mSmallGenerator = new A002931() {
    @Override
    protected Z postFilter() {
      final ArrayList<Polygon> polys = new ArrayList<>();
      for (final Polygon p : mPolygons) {
        if (p.contains(ORIGIN)) {
          polys.add(p);
        } else {
          // To an evil back translation to ensure (0,0) is a point
          final Polygon trans = new Polygon(null, null);
          boolean first = true;
          int dx = 0;
          int dy = 0;
          for (final Point pt : p) {
            if (first) {
              dx = pt.left();
              dy = pt.right();
              first = false;
            }
            trans.add(new Point(pt.left() - dx, pt.right() - dy));
          }
          polys.add(trans);
        }
      }
      mSmall.add(polys);
      return Z.ZERO;
    }
  };
  private final long[] mCnt = new long[100];
  {
    super.next(); // 2
    super.next(); // 4
    super.next(); // 6
    super.next(); // 8
    super.next(); // 10
  }

  private int[] getBounds(final Polygon polygon) {
    int maxX = 0;
    int maxY = 0;
    for (final Point pt : polygon) {
      final int x = pt.left();
      if (x > maxX) {
        maxX = x;
      }
      final int y = pt.right();
      if (y > maxY) {
        maxY = y;
      }
    }
    return new int[] {maxX, maxY};
  }

  private List<Polygon> polys(final int n) {
    while (n >= mSmall.size()) {
      mSmallGenerator.next();
      final ArrayList<int[]> bounds = new ArrayList<>();
      for (final Polygon p : mSmall.get(mSmall.size() - 1)) {
        bounds.add(getBounds(p));
      }
      mSmallBounds.add(bounds);
    }
    return mSmall.get(n);
  }

  private boolean isInside(final Polygon polygon, final int x, final int y) {
    if (polygon.contains(new Point(x, y))) {
      return false; // Quick exit if this point hits the polygon
    }
    boolean inside = false;
    final int[] vertx = new int[polygon.size()];
    final int[] verty = new int[polygon.size()];
    int k = 0;
    for (final Point pt : polygon) {
      vertx[k] = pt.left();
      verty[k] = pt.right();
      ++k;
    }
    int p1x = vertx[0];
    int p1y = verty[0];
    for (int i = 1; i <= vertx.length; i++) {
      final int p2x = vertx[i % vertx.length];
      final int p2y = verty[i % vertx.length];
      if (y > Math.min(p1y, p2y) && y <= Math.max(p1y, p2y) && x <= Math.max(p1x, p2x) /*&& p1y != p2y*/) {
        final int c = (y - p1y) * (p2x - p1x) / (p2y - p1y) + p1x;
        if (p1x == p2x || x <= c) {
          inside = !inside;
        }
      }
      p1x = p2x;
      p1y = p2y;
    }

    return inside;
  }

  private boolean isOk(final Polygon p, final Polygon q, final int x, final int y) {
    for (final Point pt : q) {
      if (p.contains(new Point(pt.left() + x, pt.right() + y))) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z postFilter() {
    for (final Polygon polygon : mPolygons) {
      // Compute bounds
      final int[] bounds = getBounds(polygon);
      final int maxX = bounds[0];
      final int maxY = bounds[1];
      // Test each point potentially inside the bounding rectangle
      for (int y = 1; y < maxY; ++y) {
        for (int x = 1; x < maxX; ++x) {
          if (isInside(polygon, x, y)) {
            // See if we can play a smaller polygon inside
            for (int j = 1; j < mN / 2 - 4; ++j) {
              final List<Polygon> qp = polys(j);
              final List<int[]> qbounds = mSmallBounds.get(j);
              for (int k = 0; k < qp.size(); ++k) {
                final Polygon q = qp.get(k);
                final int[] qxy = qbounds.get(k);
                if (qxy[0] + x < maxX && qxy[1] + y < maxY && isOk(polygon, q, x, y)) {
                  ++mCnt[polygon.size() + q.size()];
                }
              }
            }
          }
        }
      }
    }
//    for (int j = 0; j < mCnt.length; ++j) {
//      if (mCnt[j] > 0) {
//        System.out.println(j + " " + mCnt[j]);
//      }
//    }
    return Z.valueOf(mCnt[mN + 4]);
  }
}
