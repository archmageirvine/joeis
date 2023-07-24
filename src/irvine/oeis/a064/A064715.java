package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a004.A004431;

/**
 * A064715 Smallest member of triple of consecutive numbers each of which is the sum of two different nonzero squares.
 * @author Sean A. Irvine
 */
public class A064715 extends A004431 {

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

