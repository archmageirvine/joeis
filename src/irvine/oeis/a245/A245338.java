package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a024.A024656;

/**
 * A245338 Sum of digits of n written in fractional base 9/8.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245338 extends A024656 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
