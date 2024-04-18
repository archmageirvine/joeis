package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065180 Number of site swap patterns with 4 balls and exact period n.
 * @author Sean A. Irvine
 */
public class A065180 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.FIVE.pow(d).subtract(Z.ONE.shiftLeft(2L * d)).multiply(Functions.MOBIUS.i((long) (mN / d)))).divide(mN);
  }
}
