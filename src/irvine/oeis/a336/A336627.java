package irvine.oeis.a336;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A336627 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A336627 implements Sequence {

  private static final Point ORIGIN = new Point(0, 0);
  private final HashSet<Point> mSeen = new HashSet<>();
  private Collection<Point> mNew = new HashSet<>();

  private int d(final int z) {
    //return (z & 1) == 0 ? 1 : -1;
    return 1 - ((z & 1) << 1);
  }

  @Override
  public Z next() {
    if (mNew.isEmpty()) {
      mNew.add(ORIGIN);
      mSeen.add(ORIGIN);
    } else {
      final Collection<Point> next = new ArrayList<>(2 * mNew.size());
      for (final Point p : mNew) {
        final Point a = new Point(p.left() + d(p.right()), p.right());
        if (mSeen.add(a)) {
          next.add(a);
        }
        final Point b = new Point(p.left(), p.right() + d(p.left()));
        if (mSeen.add(b)) {
          next.add(b);
        }
      }
      mNew = next;
    }
    return Z.valueOf(mNew.size());
  }
}
