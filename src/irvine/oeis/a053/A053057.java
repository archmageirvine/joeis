package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000290;

/**
 * A053057 Squares whose digit sum is also a square.
 * @author Sean A. Irvine
 */
public class A053057 extends A000290 {

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      final long d = ZUtils.digitSum(square);
      final long s = LongUtils.sqrt(d);
      if (s * s == d) {
        return square;
      }
    }
  }
}
