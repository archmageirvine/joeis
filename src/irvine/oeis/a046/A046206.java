package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a003.A003506;

/**
 * A046206 In Leibniz's Harmonic Triangle, write denominator first and then numerator of each element.
 * @author Sean A. Irvine
 */
public class A046206 extends A003506 {

  private boolean mNumerator = true;

  @Override
  public Z next() {
    mNumerator = !mNumerator;
    return mNumerator ? Z.ONE : super.next();
  }
}
