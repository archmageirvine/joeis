package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002475;
import irvine.oeis.a046.A046932;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073639 extends A002475 {

  private final DirectSequence mA = new A046932();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isZero() && mA.a(t).equals(Z.TWO.pow(t).subtract(1))) {
        return t;
      }
    }
  }
}
