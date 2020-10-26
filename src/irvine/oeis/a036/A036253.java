package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A036253 Numerator of fraction equal to the continued fraction [ 3, 1, 4, 1, 5... ] (first n digits of Pi).
 * @author Sean A. Irvine
 */
public class A036253 extends A000796 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(super.next()).add(mA);
    mA = mB;
    mB = t;
    return mB;
  }
}

