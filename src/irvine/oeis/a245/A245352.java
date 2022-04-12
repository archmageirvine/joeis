package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a024.A024642;

/**
 * A245352 Sum of digits of n written in fractional base 7/5.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245352 extends A024642 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
