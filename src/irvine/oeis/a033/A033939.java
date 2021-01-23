package irvine.oeis.a033;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.a002.A002385;
import irvine.util.string.StringUtils;

/**
 * A033939 Period of 1/n in sequence A033938.
 * @author Sean A. Irvine
 */
public class A033939 extends A002385 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.TWO.equals(p) || Z.FIVE.equals(p)) {
        return Z.ONE;
      }
      final IntegersModMul r = new IntegersModMul(p);
      final Z period = r.order(Z.TEN.mod(p));
      if (StringUtils.isPalindrome(period.toString())) {
        return period;
      }
    }
  }
}
