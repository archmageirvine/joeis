package irvine.oeis.a131;
// manually 2021-01-20

import irvine.math.z.Z;
import irvine.oeis.a000.A000129;

/**
 * A131621 Sum of all n-digit Pell numbers.
 * @author Georg Fischer
 */
public class A131621 extends A000129 {

  protected Z mPell; // next Pell number
  protected Z mSum; // current sum
  protected Z mPow10; // least power of 10 > Pell number

  /**
   * Construct the sequence.
   */
  public A131621() {
    mPell = super.next();
    mSum = Z.ZERO;
    mPow10 = Z.TEN;
  }

  @Override
  public Z next() {
    while (mPell.compareTo(mPow10) < 0) {
      mSum = mSum.add(mPell);
      mPell = super.next();
    }
    final Z result = mSum;
    mSum = Z.ZERO;
    mPow10 = mPow10.multiply(Z.TEN);
    return result;
  }
}
