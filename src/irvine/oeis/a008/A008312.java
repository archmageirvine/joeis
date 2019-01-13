package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a053.A053117;

/**
 * A008312.
 * @author Sean A. Irvine
 */
public class A008312 extends A053117 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.ZERO.equals(t)) {
        return t;
      }
    }
  }
}
