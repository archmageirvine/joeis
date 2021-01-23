package irvine.oeis.a336;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A336705 Coordination sequence for the half-Manhattan lattice.
 * @author Sean A. Irvine
 */
public class A336705 implements Sequence {

  private static final Point ORIGIN = new Point(0, 0);
  private final HashSet<Point> mSeen = new HashSet<>();
  private Collection<Point> mNew = new HashSet<>();

  private int d(final int z) {
    //return (z & 1) == 0 ? 1 : -1;
    return 1 - ((z & 1) << 1);
  }

//  // Used to (partially) make the illustration (manhattan.sh)
//  private int mStep = -1;
//  private static final String[] COLOR = {"black", "red", "blue", "brown4", "cyan", "magenta", "darkgreen", "deeppink"};
//  private void dump() {
//    ++mStep;
//    for (final Point p : mNew) {
//      System.out.println("  l" + (7 - p.left()) + "_" + (7 - p.right()) + " [pos=\"" + (7.15 - p.left()) + "," + (7.15 - p.right()) + "!\", shape=none, label=<<font color='" + COLOR[mStep % COLOR.length] + "'><b>" + mStep + "</b></font>>];");
//    }
//  }

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
        final Point b = new Point(p.left(), p.right() + 1);
        if (mSeen.add(b)) {
          next.add(b);
        }
        final Point c = new Point(p.left(), p.right() - 1);
        if (mSeen.add(c)) {
          next.add(c);
        }
      }
      mNew = next;
    }
    //dump();
    return Z.valueOf(mNew.size());
  }
}
