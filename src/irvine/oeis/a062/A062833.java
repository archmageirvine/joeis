package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062833 2n! / number of divisors of n.
 * @author Sean A. Irvine
 */
public class A062833 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.divide(Functions.SIGMA0.z(mN));
  }
}
