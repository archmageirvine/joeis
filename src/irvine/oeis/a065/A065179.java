package irvine.oeis.a065;

import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065179 Number of site swap patterns with 3 balls and exact period n.
 * @author Sean A. Irvine
 */
public class A065179 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.ONE.shiftLeft(2L * d).subtract(Z.THREE.pow(d)).multiply(Mobius.mobius(mN / d))).divide(mN);
  }
}
