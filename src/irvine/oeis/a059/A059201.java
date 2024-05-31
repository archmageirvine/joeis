package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059201 Number of T_0-covers of a labeled n-set.
 * @author Sean A. Irvine
 */
public class A059201 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Functions.STIRLING1.z(mN, (long) k).shiftLeft((1L << (k - 1)) - 1));
  }
}
