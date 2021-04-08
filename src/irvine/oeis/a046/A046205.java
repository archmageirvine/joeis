package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a003.A003506;

/**
 * A046205 In Leibniz's Harmonic Triangle, write numerator first and then denominator of each element.
 * @author Sean A. Irvine
 */
public class A046205 extends A003506 {

  private boolean mNumerator = false;

  @Override
  public Z next() {
    mNumerator = !mNumerator;
    return mNumerator ? Z.ONE : super.next();
  }
}
