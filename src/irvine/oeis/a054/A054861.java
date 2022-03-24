package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054861 Highest power of 3 dividing n!.
 * @author Georg Fischer
 */
public class A054861 implements Sequence {

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
      mResult = mResult.add(ZUtils.valuation(Z.valueOf(mN), Z.valueOf(mBase)));
    }
    return mResult;
  }
}
