package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076493 Number of common (distinct) decimal digits of n and n^2.
 * @author Sean A. Irvine
 */
public class A076493 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Integer.bitCount(Functions.SYNDROME.i(++mN) & Functions.SYNDROME.i(Z.valueOf(mN).square())));
  }
}
