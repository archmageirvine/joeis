package irvine.oeis.a030;

import irvine.math.Polyomino;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

import java.util.HashSet;

/**
 * A030222 Number of n-polyplets (polyominoes connected at edges or corners); may contain holes.
 * @author Sean A. Irvine
 */
public class A030222 implements Sequence {

  protected HashSet<Polyomino> mA = new HashSet<>();

  private static final int[] DX = {0, 0, 1, -1, 1, 1, -1, -1};
  private static final int[] DY = {1, -1, 0, 0, 1, -1, 1, -1};

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
          final int left = cell.left();
          final int right = cell.right();
          for (int k = 0; k < DX.length; ++k) {
            final Point c = new Point(left + DX[k], right + DY[k]);
            if (!p.contains(c)) {
              final Polyomino np = new Polyomino(p);
              np.add(c);
              nextSet.add(np.freeCanonical());
            }
          }
        }
      }
      mA = nextSet;
      //System.out.println(mA);
    }
    return Z.valueOf(mA.size());
  }
}
