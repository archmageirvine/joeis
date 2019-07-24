package irvine.oeis.a072;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.Cell;
import irvine.math.z.Z;
import irvine.oeis.a249.A249795;

/**
 * A072154 Coordination sequence for the planar net 4.6.12.
 * @author Sean A. Irvine
 */
public class A072154 extends A249795 {

  private final Set<Cell> mSeen = new HashSet<>();
  private Set<Cell> mPrev = null;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Collections.singleton(new Cell(0, 0, 'A'));
      mSeen.addAll(mPrev);
    } else {
      final Set<Cell> next = new HashSet<>();
      for (final Cell c : mPrev) {
        for (int theta = 0; theta < 3; ++theta) {
          final Cell newCell = transit(c, theta);
          if (mSeen.add(newCell)) {
            next.add(newCell);
          }
        }
      }
      mPrev = next;
    }
    return Z.valueOf(mPrev.size());
  }
}
