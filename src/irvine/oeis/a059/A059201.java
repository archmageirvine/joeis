package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Stirling;
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
    return Integers.SINGLETON.sum(0, ++mN, k -> Stirling.firstKind(mN, k).shiftLeft((1 << (k - 1)) - 1));
  }
}
