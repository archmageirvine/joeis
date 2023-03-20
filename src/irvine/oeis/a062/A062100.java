package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000217;

/**
 * A062100 Triangular numbers with every digit a triangular number.
 * @author Sean A. Irvine
 */
public class A062100 extends A000217 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((ZUtils.syn(t) & 0b1110110100) == 0) {
        return t;
      }
    }
  }
}
