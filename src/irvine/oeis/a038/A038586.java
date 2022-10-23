package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A038586 Write n in ternary then sort the digits.
 * @author Sean A. Irvine
 */
public class A038586 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ZUtils.sortDigitsAscending(Z.valueOf(++mN), 3, false);
  }
}
