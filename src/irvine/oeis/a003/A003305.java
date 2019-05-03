package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.z.Z;
import irvine.oeis.a002.A002931;
import irvine.util.Point;

/**
 * A003305 Figure <code>8</code>'s with <code>2n</code> edges on the square lattice.
 * @author Sean A. Irvine
 */
public class A003305 extends A002931 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final ArrayList<Collection<Polygon>> mFigures = new ArrayList<>();

  {
    mFigures.add(null); // No polygons of length 0
    super.next();
    mFigures.add(null); // No polygons of length 2
  }

  private boolean juxtapose(final Polygon big, final Polygon small, final int crossX, final int crossY, final int dx, final int dy) {
    for (final Point pt : small) {
      final int x = pt.left() + dx;
      final int y = pt.right() + dy;
      if (x != crossX || y != crossY) {
        final Point p = new Point(x, y);
        if (big.contains(p)) {
          return false;
        }
      }
    }
    return true;
  }

  private long juxtapose(final Polygon big, final Polygon small) {
    // Add s to big in all possible ways
    long count = 0;
    for (final Point pt : big) {
      // Select the point where the two polygons will intersect
      final int crossX = pt.left();
      final int crossY = pt.right();
      for (final Point pt2 : small) {
        final int sx = pt2.left();
        final int sy = pt2.right();
        // Compute translation to adjoin small to big at selected points
        final int dx = crossX - sx;
        final int dy = crossY - sy;
        if (juxtapose(big, small, crossX, crossY, dx, dy)) {
          ++count;
        }
      }
    }
    return count;
  }

  private long count(final int k, final int j) {
    assert k >= j;
    long count = 0;
    final Collection<Polygon> small = mFigures.get(j / 2);
    final Collection<Polygon> big = mFigures.get(k / 2);
    for (final Polygon b : big) {
      for (final Polygon s : small) {
        count += juxtapose(b, s);
      }
    }
    if (k == j) {
      // If k == j we will have counted each figure twice, so make the correction here
      assert (count & 1) == 0;
      count /= 2;
    }
    if (mVerbose) {
      System.out.println("(" + k + "," + j + ")=" + count);
    }
    return count;
  }

  @Override
  public Z next() {
    super.next(); // Adds one more set of polygons to mFigures
    mFigures.add(new ArrayList<>(mPolygons));
    final int n = mN + 4;
    Z sum = Z.ZERO;
    for (int k = n - 4; 2 * k >= n; k -= 2) {
      // k tracks the larger of the two polygons in the figure
      sum = sum.add(count(k, n - k));
    }
    return sum;
  }

}

