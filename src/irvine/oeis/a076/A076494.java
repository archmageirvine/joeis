package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076494 Number of common decimal digits of 2^n and 2^(1+n).
 * @author Sean A. Irvine
 */
public class A076494 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Integer.bitCount(Functions.SYNDROME.i(Z.ONE.shiftLeft(++mN)) & Functions.SYNDROME.i(Z.ONE.shiftLeft(mN + 1))));
  }
}
