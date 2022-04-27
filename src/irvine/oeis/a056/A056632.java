package irvine.oeis.a056;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import irvine.math.z.Z;
import irvine.oeis.a002.A002931;
import irvine.util.Point;

/**
 * A056632 Series expansion for first perimeter weighted moment for square lattice.
 * @author Sean A. Irvine
 */
public class A056632 extends A002931 {

  private final List<AtomicLong> mCounts = Collections.synchronizedList(new ArrayList<>());
  {
    super.next();
  }
  private int mM = 0;

  @Override
  protected Z postFilter() {
    for (final Polygon polygon : mPolygons) {
      // Area
      int area = 0;
      Point pt0 = null;
      for (final Point pt1 : polygon) {
        if (pt0 != null) {
          area += pt0.left() * pt1.right() - pt1.left() * pt0.right();
        }
        pt0 = pt1;
      }
      // Wrap around to get the last point closing the polygon
      for (final Point pt1 : polygon) {
        area += pt0.left() * pt1.right() - pt1.left() * pt0.right();
        break;
      }
      area /= 2;
      while (area >= mCounts.size()) {
        mCounts.add(new AtomicLong());
      }
      mCounts.get(area).addAndGet(mN);
    }
    return Z.valueOf(mCounts.get(++mM).get());
  }
}
