package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070939 Length of binary representation of n.
 * @author Georg Fischer
 */
public class A070939 extends Sequence0 {

  private long mN = -1; // current index
  private long mPow2 = 1; // next power of 2
  private Z mLen = Z.ZERO; // current length

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    if (mN == mPow2) {
      mPow2 <<= 1;
      mLen = mLen.add(Z.ONE);
    }
    return mLen;
  }
}
