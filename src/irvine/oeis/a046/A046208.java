package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046208 In Leibniz's Harmonic Triangle, write the numerator first and then the denominator of each element to the right of the central elements.
 * @author Sean A. Irvine
 */
public class A046208 extends A046207 {

  private boolean mNumerator = false;

  @Override
  public Z next() {
    mNumerator = !mNumerator;
    return mNumerator ? Z.ONE : super.next();
  }
}
