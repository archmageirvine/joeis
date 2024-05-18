package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A070939 Length of binary representation of n.
 * @author Georg Fischer
 */
public class A070939 extends Sequence0 implements DirectSequence {

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

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ONE : Functions.DIGIT_LENGTH.z(2, n);
  }

  @Override
  public Z a(final int n) {
    return n == 0 ? Z.ONE : Functions.DIGIT_LENGTH.z(2, n);
  }

}
