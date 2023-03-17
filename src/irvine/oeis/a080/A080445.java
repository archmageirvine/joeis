package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080445 a(1) = 1, a(n) = smallest (nontrivial) multiple of a(n-1) containing n digits, a(n) not equal to 10*a(n-1).
 * @author Georg Fischer
 */
public class A080445 extends Sequence1 {

  private Z mA;
  private Z mPow10; // mA < mPow10

  /** Construct the sequence. */
  public A080445() {
    this(1);
  }

  /**
   * Generic constructor with parameters
   * @param start value of a(1)
   */
  public A080445(final int start) {
    mA = Z.valueOf(start);
    mPow10 = Z.TEN;
  }

  @Override
  public Z next() {
    final Z result = mA;
    final Z mult = mPow10.divide(mA).add(1);
    Z b = mA.multiply(mult);
    mPow10 = mPow10.multiply(10);
    if (mult.equals(Z.TEN)) {
      b = b.add(mA);
    }
    mA = b;
    return result;
  }
}
