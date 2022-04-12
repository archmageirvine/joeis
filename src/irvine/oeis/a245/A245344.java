package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a024.A024640;

/**
 * A245344 Sum of digits of n written in fractional base 7/3.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245344 extends A024640 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
