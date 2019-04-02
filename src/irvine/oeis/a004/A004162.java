package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000326;

/**
 * A004162 Sum of digits of pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A004162 extends A000326 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
