package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076492 Number of common decimal digits of n! and (n+1)!.
 * @author Sean A. Irvine
 */
public class A076492 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return Z.valueOf(Integer.bitCount(Functions.SYNDROME.i(mF) & Functions.SYNDROME.i(mF.multiply(mN + 1))));
  }
}
