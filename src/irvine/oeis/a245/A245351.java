package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a024.A024662;

/**
 * A245351 Sum of digits of n written in fractional base 10/7.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245351 extends A024662 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
