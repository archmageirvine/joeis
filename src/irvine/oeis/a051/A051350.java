package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a141.A141468;

/**
 * A051350 Sum of digit-sums of first n nonprimes.
 * @author Sean A. Irvine
 */
public class A051350 extends A141468 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.add(ZUtils.digitSum(super.next()));
    return mA;
  }
}
