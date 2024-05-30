package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054861 Greatest k such that 3^k divides n!.
 * @author Georg Fischer
 */
public class A054861 extends Sequence0 {

  protected long mN;
  protected long mBase;
  protected Z mResult;

  /** Construct the sequence. */
  public A054861() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param base take the power of this parameter
   */
  public A054861(final int base) {
    mBase = base;
    mN = -1;
    mResult = Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN % mBase == 0) {
      mResult = mResult.add(Functions.VALUATION.i(mN, mBase));
    }
    return mResult;
  }
}
