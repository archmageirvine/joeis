package irvine.oeis.a307;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A307481 Numbers that can be expressed as x+2y+z such that x, y, z, x+y, y+z, and x+2y+z are all positive squares.
 * @author Sean A. Irvine
 */
public class A307481 extends Sequence1 {

  private final TreeSet<Z> mS = new TreeSet<>();
  private Z mZ = Z.ZERO;
  private Z mZ2 = Z.ZERO;

  @Override
  public Z next() {
    while (mS.isEmpty() || mS.first().compareTo(mZ2) >= 0) {
      // Add any solutions arising for the next larger square
      mZ = mZ.add(1);
      mZ2 = mZ.square();
      for (Z y = Z.ONE; y.compareTo(mZ) <= 0; y = y.add(1)) {
        final Z y2 = y.square();
        final Z y2z2 = y2.add(mZ2);
        y2z2.sqrt();
        if (y2z2.auxiliary() == 1) {
          for (Z x = Z.ONE; x.compareTo(mZ) <= 0; x = x.add(1)) {
            final Z x2 = x.square();
            final Z x2y2 = x2.add(y2);
            x2y2.sqrt();
            if (x2y2.auxiliary() == 1) {
              final Z s = x2y2.add(y2z2);
              if (s.isSquare()) {
                mS.add(s);
              }
            }
            final Z x2z2 = x2.add(mZ2);
            x2z2.sqrt();
            if (x2z2.auxiliary() == 1) {
              final Z s = x2z2.add(y2z2);
              if (s.isSquare()) {
                mS.add(s);
              }
            }
          }
        }
      }
    }
    return mS.pollFirst();
  }
}
