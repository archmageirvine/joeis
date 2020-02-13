package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A028865.
 * @author Sean A. Irvine
 */
public class A028865 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (ZUtils.isNondecreasingDigits(p.square())) {
        return p;
      }
    }
  }
}
