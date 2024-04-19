package irvine.oeis.a175;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A175434 (Digit sum of 2^n) mod n.
 * @author Georg Fischer
 */
public class A175434 extends Sequence1 {

  private int mN;
  private final int mParm;
  private Z mPow;

  /** Construct the sequence. */
  public A175434() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param parm
   */
  public A175434(final int parm) {
    mN = 0;
    mParm = parm;
    mPow = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    mPow = mPow.multiply(mParm);
    return Z.valueOf(Functions.DIGIT_SUM.l(mPow) % mN);
  }
}
