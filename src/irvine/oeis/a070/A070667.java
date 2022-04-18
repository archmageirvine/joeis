package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070667 Smallest m in range 2..n-1 such that m^2 == 1 mod n, or 1 if no such number exists.
 * @author Georg Fischer
 */
public class A070667 implements Sequence {

  private int mN;
  private int mPow;

  /** Construct the sequence. */
  public A070667() {
    this(2);
  }

  /**
   * Generic constructor with parameter
   * @param pow take m to this power
   */
  public A070667(final int pow) {
    mN = 0;
    mPow = pow;
  }

  @Override
  public Z next() {
    ++mN;
    int m = 2;
    final Z n = Z.valueOf(mN);
    while (m < mN) {
      final Z mz = Z.valueOf(m);
      if (mz.pow(mPow).mod(n).equals(Z.ONE)) {
        return mz;
      }
      ++m;
    }
    return Z.ONE;
  }
}
