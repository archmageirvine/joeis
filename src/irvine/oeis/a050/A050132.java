package irvine.oeis.a050;
// manually 2021-08-07

import irvine.math.z.Z;

/**
 * A050132 a(n) = floor(a(n-1)/2) if this is not among 0,a(1),...,a(n-1); otherwise a(n) = 3*n.
 * @author Georg Fischer
 */
public class A050132 extends A050000 {

  /** Construct the sequence. */
  public A050132() {
    this(3, 2);
  }

  /**
   * Generic constructor with parameter
   * @param parm1 multiplicator for a(n-1)
   * @param parm2 divisor in floor()
   */
  public A050132(final int parm1, final int parm2) {
    super(parm1, parm2);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      mPrev = Z.ONE;
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
