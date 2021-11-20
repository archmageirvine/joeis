package irvine.oeis.a231;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A231503 a(n) = Sum_{i=0..n} digsum_3(i)^2, where digsum_3(i) = A053735(i).
 * @author Georg Fischer
 */
public class A231503 implements Sequence {

  protected long mBase;
  protected int mPow;
  protected long mN; // current index

  /** Construct the sequence. */
  public A231503() {
    this(3, 2);
  }

  /**
   * Generic constructor with parameters
   * @param base
   * @param pow
   */
  public A231503(final long base, final int pow) {
    mN = -1;
    mBase = base;
    mPow = pow;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int i = 0; i <= mN; ++i) {
      sum = sum.add(Z.valueOf(ZUtils.digitSum(i, mBase)).pow(mPow));
    }
    return sum;
  }
}
