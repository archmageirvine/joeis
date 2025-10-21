package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000328;

/**
 * A389588 Number of integer lattice points (x,y) with x^2 + y^2 &lt;= n^2 that lie outside the interior of the regular hexagon inscribed in the circle of radius n centered at the origin.
 * @author Sean A. Irvine
 */
public class A389588 extends Sequence1 {

  private static final CR SQRT3 = CR.THREE.sqrt();
  private final Sequence mS = new A000328().skip();
  private int mN = 0;

  @Override
  public Z next() {
    final int m = SQRT3.multiply(++mN).divide(2).floor().intValue();
    final CR n = CR.valueOf(mN);
    final Z sum = Integers.SINGLETON.sum(1, m, k -> n.subtract(CR.valueOf(k).divide(SQRT3)).ceil()).multiply(4);
    return mS.next().subtract(sum).subtract(2L * (mN - m) - 1);
  }
}

