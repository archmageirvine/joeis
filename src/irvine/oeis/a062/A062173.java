package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A062173 a(n) = 2^(n-1) mod n.
 * @author Georg Fischer
 */
public class A062173 implements Sequence {

  private long mN;
  private Z mParm;

  /** Construct the sequence. */
  public A062173() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param parm
   */
  public A062173(final int parm) {
    mN = 0;
    mParm = Z.valueOf(parm);
  }

  @Override
  public Z next() {
    ++mN;
    return mParm.pow(mN - 1).mod(Z.valueOf(mN));
  }
}
