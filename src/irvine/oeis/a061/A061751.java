package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A061751 Numbers k such that k! is divisible by (k+1)^3.
 * @author Georg Fischer
 */
public class A061751 implements Sequence {

  private int mN;
  private int mAdd;
  private int mExpon;
  private Z mFact;

  /** Construct the sequence. */
  public A061751() {
    this(1, 1, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset idnex of first term
   * @param add additive constant
   * @param expon exponent
   */
  public A061751(final int offset, final int add, final int expon) {
    mN = offset - 1;
    mAdd = add;
    mExpon = expon;
    mFact = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    mFact = mFact.multiply(mN);
    while (!mFact.divideAndRemainder(Z.valueOf(mN + mAdd).pow(mExpon))[1].isZero()) {
      ++mN;
      mFact = mFact.multiply(mN);
    }
    return Z.valueOf(mN);
  }
}
