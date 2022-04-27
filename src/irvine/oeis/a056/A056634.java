package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a002.A002931;
import irvine.util.Point;

/**
 * A056634 Number of polygons of length 2n with one hole on square lattice (not allowing rotations).
 * @author Sean A. Irvine
 */
public class A056634 extends A002931 {

  private final long[] mCnt = new long[100];
  {
    super.next(); // 2
    super.next(); // 4
    super.next(); // 6
    super.next(); // 8
    super.next(); // 10
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
      if (y > Math.min(p1y, p2y) && y <= Math.max(p1y, p2y) && x <= Math.max(p1x, p2x) && p1y != p2y) {
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

  @Override
  protected Z postFilter() {
    long cnt = 0;
    for (final Polygon polygon : mPolygons) {
      // Check if a small polygon can be embedded completely inside

      // todo as initial test could try an embed at (1,1)
      // P larger polygon
      // Q smaller polygon
      // 2n = perim(P) + perim(Q)
      // How many ways can Q be embedded completely inside P

      // Compute bounds
      int maxX = 0;
      int maxY = 0;
      int minX = Integer.MAX_VALUE;
      int minY = Integer.MAX_VALUE;
      for (final Point pt : polygon) {
        final int x = pt.left();
        if (x > maxX) {
          maxX = x;
        }
        if (x < minX) {
          minX = x;
        }
        final int y = pt.right();
        if (y > maxY) {
          maxY = y;
        }
        if (y < minY) {
          minY = y;
        }
      }
      // Test each point potentially inside the bounding rectangle
      for (int y = minY + 1; y < maxY; ++y) {
        for (int x = minX + 1; x < maxX; ++x) {
          // Cast a ray
          if (isInside(polygon, x, y)) {
            // See if we can play a smaller polygon at this point (1x1 square)
            if (!polygon.contains(new Point(x + 1, y)) && !polygon.contains(new Point(x + 1, y + 1)) && !polygon.contains(new Point(x, y + 1))) {
              //System.out.println("outerperim=" + polygon.size() + " " + polygon + " can be made holey at (" + x + "," + y + ")");
              ++mCnt[mN + 4];

              // If the above succeeded we can try larger Polygons
              final int x0 = x;
              final int y0 = y;
              final A002931 mInnerPoly = new A002931() {

                {
                  mN = 4;
                }

                private boolean isOk(final Polygon q, final int x, final int y) {
                  for (final Point pt : q) {
                    if (polygon.contains(new Point(pt.left() + x, pt.right() + y))) {
                      return false;
                    }
                  }
                  return true;
                }

                @Override
                protected Z postFilter() {
                  for (final Polygon q : mPolygons) {
                    if (isOk(q, x0, y0)) {
                      ++mCnt[polygon.size() + q.size()];
                    }
                  }
                  return Z.ZERO;
                }
              };
              // Largest internal is mN - 8
              for (int j = 6; j <= mN - 8; j += 2) {
                mInnerPoly.next();
              }

//              // Try extending to 6 sides horizontal
//              if (!polygon.contains(new Point(x + 2, y)) && !polygon.contains(new Point(x + 2, y + 1))) {
//                //System.out.println("outerperim=" + polygon.size() + " " + polygon + " can be made holey at (" + x + "," + y + ")");
//                ++mCnt[mN + 6];
//              }
//              // Try extending to 6 sides vertical
//              if (!polygon.contains(new Point(x + 1, y + 2)) && !polygon.contains(new Point(x, y + 2))) {
//                ++mCnt[mN + 6];
//              }
            }
          }
        }
      }
    }
    for (int j = 0; j < mCnt.length; ++j) {
      if (mCnt[j] > 0) {
        System.out.println(j + " " + mCnt[j]);
      }
    }
    return Z.valueOf(mCnt[mN + 4]);
  }
}
