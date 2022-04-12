package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a024.A024647;

/**
 * A245355 Sum of digits of n written in fractional base 8/5.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245355 extends A024647 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
