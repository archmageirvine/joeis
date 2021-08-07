package irvine.oeis.a050;
// manually 2021-08-07

import irvine.math.z.Z;

/**
 * A050138 a(1)=2, a(2)=6.  For n &gt;= 2, a(n) = floor(a(n-1)/2) if this is not among 0,a(1),...,a(n-1); otherwise a(n) = 3*n.
 * @author Georg Fischer
 */
public class A050138 extends A050137 {

  /** Construct the sequence. */
  public A050138() {
    super(3, 2);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      mPrev = Z.TWO;
      mA.add(mPrev);
      return mPrev;
    } 
    if (mN == 2) {
      mPrev = Z.SIX;
      mA.add(mPrev);
      return mPrev;
    } 
    Z result = mPrev.divide(mParm2);
    if (mA.contains(result) || result.equals(mPrev)) {
      result = Z.valueOf(mN).multiply(mParm1);
    }
    mA.add(result);
    mPrev = result;
    return result;
  }

}
