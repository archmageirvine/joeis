package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005418 Number of <code>(n-1)-bead black-white</code> reversible strings; also binary grids; also row sums of Losanitsch's triangle <code>A034851</code>; also number of caterpillar graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A005418 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Z.ONE.shiftLeft(mN - 2).add(Z.ONE.shiftLeft(mN / 2 - 1));
  }
}
