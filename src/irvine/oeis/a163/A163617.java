package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A163617 a(2*n) = 2*a(n), a(2*n + 1) = 2*a(n) + 2 + (-1)^n, for all n in Z.
 * @author Georg Fischer
 */
public class A163617 implements SequenceWithOffset {

  private int mN;
  private int mOffset;
  private int mMult;

  /** Construct the sequence. */
  public A163617() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param mult multiplicative factor
   */
  public A163617(final int offset, final int mult) {
    mOffset = offset;
    mMult = mult;
    mN = offset - 1;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN | (mN * mMult));
  }
}
