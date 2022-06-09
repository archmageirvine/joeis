package irvine.oeis.a175;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A175434 (Digit sum of 2^n) mod n.
 * @author Georg Fischer
 */
public class A175434 implements Sequence {

  private int mN;
  private int mParm;
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
    return Z.valueOf(ZUtils.digitSum(mPow) % mN);
  }
}
