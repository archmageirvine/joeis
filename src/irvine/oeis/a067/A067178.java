package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a056.A056991;

/**
 * A067178 Smallest square whose sum of digits is A056991(n).
 * @author Sean A. Irvine
 */
public class A067178 extends A056991 {

  @Override
  public Z next() {
    final long t = super.next().longValueExact();
    long k = 0;
    while (true) {
      final Z k2 = Z.valueOf(++k).square();
      if (ZUtils.digitSum(k2) == t) {
        return k2;
      }
    }
  }
}
