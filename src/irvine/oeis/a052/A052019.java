package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A052018.
 * @author Sean A. Irvine
 */
public class A052019 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long sum = ZUtils.digitSum(p);
      if (p.toString().contains(String.valueOf(sum))) {
        return p;
      }
    }
  }
}
