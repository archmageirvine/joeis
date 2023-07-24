package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000404;

/**
 * A064716 Smallest member of three consecutive numbers each of which is the sum of two nonzero squares (not necessarily different).
 * @author Sean A. Irvine
 */
public class A064716 extends A000404 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (mB.subtract(t).equals(Z.TWO)) {
        return t;
      }
    }
  }
}

