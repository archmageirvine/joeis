package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a005.A005117;

/**
 * A062085 Squarefree numbers with all even digits.
 * @author Sean A. Irvine
 */
public class A062085 extends A005117 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((ZUtils.syn(t) & 0b1010101010) == 0) {
        return t;
      }
    }
  }
}
