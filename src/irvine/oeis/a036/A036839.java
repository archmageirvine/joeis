package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A036839 RATS(n): Reverse Add Then Sort the digits.
 * @author Sean A. Irvine
 */
public class A036839 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ZUtils.sortDigitsAscending(Z.valueOf(Functions.REVERSE.l(++mN) + mN));
  }
}
