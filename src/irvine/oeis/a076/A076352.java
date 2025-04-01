package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005117;

/**
 * A076352 Squarefree numbers k such that A076341(k) = 0.
 * @author Sean A. Irvine
 */
public class A076352 extends A076341 {

  private final Sequence mA = new A005117();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      if (a(t).isZero()) {
        return t;
      }
    }
  }
}
