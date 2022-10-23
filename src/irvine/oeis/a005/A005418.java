package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005418 Number of (n-1)-bead black-white reversible strings; also binary grids; also row sums of Losanitsch's triangle A034851; also number of caterpillar graphs on n+2 vertices.
 * @author Sean A. Irvine
 */
public class A005418 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Z.ONE.shiftLeft(mN - 2).add(Z.ONE.shiftLeft(mN / 2 - 1));
  }
}
