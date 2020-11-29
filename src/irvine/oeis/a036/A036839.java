package irvine.oeis.a036;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036839 RATS(n): Reverse Add Then Sort the digits.
 * @author Sean A. Irvine
 */
public class A036839 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ZUtils.sortDigitsAscending(Z.valueOf(LongUtils.reverse(++mN) + mN));
  }
}
