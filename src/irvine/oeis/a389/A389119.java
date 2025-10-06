package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A389119 extends Sequence1 {

  private long mN = -1;

  private boolean is(Z t) {
    while (!t.isZero()) {
      final Z[] qr = t.divideAndRemainder(Z.THREE);
      if (qr[1].equals(Z.TWO)) {
        return false;
      }
      t = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z(Long.toBinaryString(++mN));
      if (is(t)) {
        return t;
      }
    }
  }
}

