package irvine.oeis.a057;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.Polyiamond;
import jmason.poly.PolyiamondCounter;

/**
 * A057729 Number of triangular polyominoes (or polyiamonds) [A000577] with perimeter n.
 * @author Sean A. Irvine
 */
public class A057729 implements Sequence {

  private int mM = 0;
  private int mN = 0;
  private List<Polyiamond> mPrevList = null;
  private final long[] mPerimeterCounts = new long[1000];

  @Override
  public Z next() {
    ++mN;
    int leastChangeIndex;
    do {
      leastChangeIndex = Integer.MAX_VALUE;
      final PolyiamondCounter pc = new PolyiamondCounter(++mM);
      pc.run(true, false, false, mPrevList, true);
      mPrevList = pc.getList();
      for (final Polyiamond p : mPrevList) {
        final int perim = p.edgePerimeterSize();
        ++mPerimeterCounts[perim];
        if (perim < leastChangeIndex) {
          leastChangeIndex = perim;
        }
      }
    } while (leastChangeIndex - 1 <= mN); // somewhat heuristic
    return Z.valueOf(mPerimeterCounts[mN]);
  }    
}
