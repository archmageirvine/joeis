package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000290;

/**
 * A054259 Squares having last digit equal to the sum of the other digits.
 * @author Sean A. Irvine
 */
public class A054259 extends A000290 {

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      final long sum = ZUtils.digitSum(s);
      final long r = s.mod(10);
      if (sum - r == r) {
        return s;
      }
    }
  }
}

