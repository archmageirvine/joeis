package irvine.oeis.a050;
// manually 2021-08-07

import irvine.math.z.Z;

/**
 * A050137 a(1)=2; a(n) = floor(a(n-1)/2) if this is not among 0,a(1),...,a(n-1); otherwise a(n) = 2*n.
 * @author Georg Fischer
 */
public class A050137 extends A050000 {

  /** Construct the sequence. */
  public A050137() {
    this(2, 2);
  }

  /**
   * Generic constructor with parameter
   * @param parm1 multiplicator for a(n-1)
   * @param parm2 divisor in floor()
   */
  public A050137(final int parm1, final int parm2) {
    super(parm1, parm2);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      mPrev = Z.TWO;
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
