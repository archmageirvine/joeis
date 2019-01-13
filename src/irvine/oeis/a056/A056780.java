package irvine.oeis.a056;

import java.util.HashSet;

import irvine.math.Polyomino;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A056780.
 * @author Sean A. Irvine
 */
public class A056780 implements Sequence {

  private HashSet<Polyomino> mA = new HashSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Polyomino p = new Polyomino();
      p.add(new Point(0, 0));
      mA.add(p);
    } else {
      final HashSet<Polyomino> nextSet = new HashSet<>();
      for (final Polyomino p : mA) {
        for (final Point cell : p) {
          final int x = cell.left();
          final int y = cell.right();
          final Point c1 = new Point(x - 1, y);
          if (!p.contains(c1)) {
            final Polyomino np = new Polyomino(p);
            np.add(c1);
            nextSet.add(np.twoSidedRectangleCanonical());
          }
          final Point c2 = new Point(x + 1, y);
          if (!p.contains(c2)) {
            final Polyomino np = new Polyomino(p);
            np.add(c2);
            nextSet.add(np.twoSidedRectangleCanonical());
          }
          final Point c3 = new Point(x, y - 1);
          if (!p.contains(c3)) {
            final Polyomino np = new Polyomino(p);
            np.add(c3);
            nextSet.add(np.twoSidedRectangleCanonical());
          }
          final Point c4 = new Point(x, y + 1);
          if (!p.contains(c4)) {
            final Polyomino np = new Polyomino(p);
            np.add(c4);
            nextSet.add(np.twoSidedRectangleCanonical());
          }
        }
      }
      mA = nextSet;
      //System.out.println(mA);
    }
    return Z.valueOf(mA.size());
  }

}
