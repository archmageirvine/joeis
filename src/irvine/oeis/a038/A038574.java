package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038574 Write n in ternary, sort digits into increasing order.
 * @author Sean A. Irvine
 */
public class A038574 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ZUtils.sortDigitsAscending(Z.valueOf(++mN), 3);
  }
}
