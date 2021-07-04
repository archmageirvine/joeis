package irvine.oeis.a133;
// manually at 2021-07-04

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A133058 a(0) = a(1) = 1; for n > 1, a(n) = a(n-1) + n + 1 if a(n-1) and n are coprime, otherwise a(n) = a(n-1)/gcd(a(n-1),n).
 * @author Georg Fischer
 */
public class A133058 implements Sequence {

  private Z mAn_1;
  protected int mN;
  
  /** Construct the sequence. */
  public A133058() {
    mN = -1;
    mAn_1 = Z.ONE;
  }
  
  public Z next() {
    ++mN; 
    Z mAn = Z.ONE;
    if (mN > 1) {
      final Z n = Z.valueOf(mN);
      final Z common = mAn_1.gcd(n);
      mAn = common.equals(Z.ONE) ? mAn_1.add(n).add(Z.ONE) : mAn_1.divide(common);
    }
    mAn_1 = mAn;
    return mAn;
  }
}
