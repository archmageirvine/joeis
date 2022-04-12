package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a024.A024652;

/**
 * A245350 Sum of digits of n written in fractional base 9/4.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245350 extends A024652 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
