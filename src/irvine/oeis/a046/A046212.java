package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a002.A002457;

/**
 * A046212 First numerator and then denominator of central elements of Leibniz's Harmonic Triangle.
 * @author Sean A. Irvine
 */
public class A046212 extends A002457 {

  private boolean mNumerator = false;

  @Override
  public Z next() {
    mNumerator = !mNumerator;
    return mNumerator ? Z.ONE : super.next();
  }
}
