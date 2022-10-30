package irvine.oeis.a101;
// manually 2021-08-04

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A101264 a(n) = 1 if 2*n + 1 is prime, otherwise a(n) = 0.
 * 0, 1, 1, 1, 0, 1, 1, 0, 1, 1; Offset 0.
 * 0  1  2  3  4  5
 * 1  3  5  7  9 11 13 15 17 19
 * @author Georg Fischer
 */
public class A101264 extends A000040 {

  protected int mN;
  protected int mExpect;

  /** Construct the sequence. */
  public A101264() {
    setOffset(0);
    mN = -1;
    super.next(); // skip the 2
    mExpect = super.next().intValue(); // = 3
  }
  
  @Override
  public Z next() {
    mN += 2;
    Z result = Z.ZERO;
    if (mN >= mExpect) {
      result = Z.ONE;
      mExpect = super.next().intValue();
    }
    return result;
  }
}
