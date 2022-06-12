package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a033.A033950;

/**
 * A057529 Numbers n with property that n is divisible by the number of divisors of n and by the sum of the digits of n.
 * @author Sean A. Irvine
 */
public class A057529 extends A033950 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(ZUtils.digitSum(t)) == 0) {
        return t;
      }
    }
  }
}
