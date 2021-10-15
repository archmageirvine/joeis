package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052008 a(n) = 'n with digits sorted in ascending order' + 'n with digits sorted in descending order'.
 * @author Sean A. Irvine
 */
public class A052008 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return ZUtils.sortDigitsAscending(mN).add(ZUtils.sortDigitsDescending(mN));
  }
}
