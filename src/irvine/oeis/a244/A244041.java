package irvine.oeis.a244;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a024.A024631;

/**
 * A244041 Sum of digits of n written in fractional base 4/3.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A244041 extends A024631 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
