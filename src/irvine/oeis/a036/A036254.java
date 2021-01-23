package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A036254 Denominator of fraction equal to the continued fraction [ 3, 1, 4, 1, 5... ] (first n digits of Pi).
 * @author Sean A. Irvine
 */
public class A036254 extends A000796 {

  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    final Z u = super.next();
    if (mB == null) {
      mB = Z.ONE;
    } else {
      final Z t = mB.multiply(u).add(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

