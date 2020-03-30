package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A030291.
 * @author Sean A. Irvine
 */
public class A030291 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Integer.bitCount(ZUtils.syn(p)) <= 2) {
        return p;
      }
    }
  }
}
