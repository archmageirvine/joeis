package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A052008 a(n) = 'n with digits sorted in ascending order' + 'n with digits sorted in descending order'.
 * @author Sean A. Irvine
 */
public class A052008 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Functions.DIGIT_SORT_ASCENDING.z(mN).add(ZUtils.sortDigitsDescending(mN));
  }
}
