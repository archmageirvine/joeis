package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065178 Number of site swap patterns with 2 balls and exact period n.
 * @author Sean A. Irvine
 */
public class A065178 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.THREE.pow(d).subtract(Z.ONE.shiftLeft(d)).multiply(Functions.MOBIUS.i((long) (mN / d)))).divide(mN);
  }
}
