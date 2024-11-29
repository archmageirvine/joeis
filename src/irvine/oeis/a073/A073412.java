package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000404;

/**
 * A073412 Lesser of three consecutive nonsquare integers each of which is the sum of two squares.
 * @author Sean A. Irvine
 */
public class A073412 extends A000404 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (Z.TWO.equals(mB.subtract(t)) && !Predicates.SQUARE.is(t) && !Predicates.SQUARE.is(mA) && !Predicates.SQUARE.is(mB)) {
        return t;
      }
    }
  }
}
