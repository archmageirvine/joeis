package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a005.A005117;

/**
 * A062086 Squarefree numbers with all odd digits.
 * @author Sean A. Irvine
 */
public class A062086 extends A005117 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((ZUtils.syn(t) & 0b0101010101) == 0) {
        return t;
      }
    }
  }
}
