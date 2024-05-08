package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A048724 Write n and 2n in binary and add them mod 2.
 * @author Georg Fischer
 */
public class A048724 extends AbstractSequence implements DirectSequence {

  private int mN;
  private final long mMult;

  /** Construct the sequence. */
  public A048724() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param mult multiplicative factor
   */
  public A048724(final int offset, final int mult) {
    super(offset);
    mMult = mult;
    mN = offset - 1;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN ^ (mN * mMult));
  }

  @Override
  public Z a(final Z n) {
    return n.xor(n.multiply(mMult));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
