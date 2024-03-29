package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a024.A024655;

/**
 * A245353 Sum of digits of n written in fractional base 9/7.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245353 extends A024655 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
