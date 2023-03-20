package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a061.A061248;

/**
 * A062132 Digit sums of the primes resulting from A061248.
 * @author Sean A. Irvine
 */
public class A062132 extends A061248 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
