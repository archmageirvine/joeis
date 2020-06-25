package irvine.oeis.a000;

import java.util.HashSet;

import irvine.math.Polyomino;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A000988 Number of one-sided polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A000988 implements Sequence {

  protected HashSet<Polyomino> mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new HashSet<>();
      return Z.ONE;
    }
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
            nextSet.add(np.oneSidedCanonical());
          }
          final Point c2 = new Point(x + 1, y);
          if (!p.contains(c2)) {
            final Polyomino np = new Polyomino(p);
            np.add(c2);
            nextSet.add(np.oneSidedCanonical());
          }
          final Point c3 = new Point(x, y - 1);
          if (!p.contains(c3)) {
            final Polyomino np = new Polyomino(p);
            np.add(c3);
            nextSet.add(np.oneSidedCanonical());
          }
          final Point c4 = new Point(x, y + 1);
          if (!p.contains(c4)) {
            final Polyomino np = new Polyomino(p);
            np.add(c4);
            nextSet.add(np.oneSidedCanonical());
          }
        }
      }
      mA = nextSet;
      //System.out.println(mA);
    }
    return Z.valueOf(mA.size());
  }
}
