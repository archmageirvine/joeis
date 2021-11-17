package irvine.oeis.a115;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A115422 Integers n &gt; 0 such that n XOR 20*n = 21*n.
 * @author Georg Fischer
 */
public class A115422 implements Sequence {

  protected long mN;
  protected long mF1;
  protected long mF2;
  protected long mF3;

  /** Construct the sequence. */
  public A115422() {
    this(1, 1, 20, 21);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param f1
   * @param f2
   * @param f3
   */
  public A115422(final long offset, final long f1, final long f2, final long f3) {
    mN = offset - 1;
    mF1 = f1;
    mF2 = f2;
    mF3 = f3;
  }

  @Override
  public Z next() {
    ++mN;
    while (((mF1 * mN) ^ (mF2 * mN)) != mF3 * mN) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
