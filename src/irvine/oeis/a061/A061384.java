package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061384 Numbers n such that sum of digits = number of digits.
 * @author Georg Fischer
 */
public class A061384 extends Sequence1 {

  private Z mK;
  private long mMult;

  /** Construct the sequence. */
  public A061384() {
    this(1);
  }

  /**
   * Generic constructor with parameters
   * @param mult
   */
  public A061384(final int mult) {
    mK = Z.ZERO;
    mMult = mult;
  }

  @Override
  public Z next() {
    mK = mK.add(1);
    while (Functions.DIGIT_SUM.l(mK) != mK.toString().length() * mMult) {
      mK = mK.add(1);
    }
    return mK;
  }
}
