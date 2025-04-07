package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076489 Number of common (distinct) digits of consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A076489 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Integer.bitCount(Functions.SYNDROME.i(++mN) & Functions.SYNDROME.i(mN + 1)));
  }
}
