package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070939 Length of binary representation of n.
 * @author Georg Fischer
 */
public class A070939 implements Sequence {

  protected long mN; // current index
  protected long mPow2; // next power of 2
  protected Z mLen; // current length

  /** Construct the sequence. */
  public A070939() {
    mN = -1; // offset1 = 0
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      mPow2 = 1;
      mLen = Z.ZERO;
      return Z.ONE;
    }
    if (mN == mPow2) {
      mPow2 <<= 1;
      mLen = mLen.add(Z.ONE);
    }
    return mLen;
  }
}
