package irvine.oeis.a057;

import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a000.A000228;

/**
 * A057779 Hexagonal polyominoes (or polyhexes, A000228) with perimeter 2n.
 * @author Sean A. Irvine
 */
public class A057779 extends A000228 {

  private int mN = 0;
  private final long[] mPerimeterCounts = new long[1000];

  private int edgePerimeterSize(final List<Point> p) {
    final HashSet<Point> pts = new HashSet<>(p);
    int perim = 0;
    for (final Point pt : p) {
      for (final Point n : neighborhoods(pt)) {
        if (!pts.contains(n)) {
          ++perim;
        }
      }
    }
    return perim;
  }

  @Override
  public Z next() {
    mN += 2;
    int leastChangeIndex;
    do {
      leastChangeIndex = Integer.MAX_VALUE;
      super.next();
      for (final List<Point> p : mPrev) {
        final int perim = edgePerimeterSize(p);
        ++mPerimeterCounts[perim];
        if (perim < leastChangeIndex) {
          leastChangeIndex = perim;
        }
      }
    } while (leastChangeIndex - 1 <= mN);
    return Z.valueOf(mPerimeterCounts[mN]);
  }
}
