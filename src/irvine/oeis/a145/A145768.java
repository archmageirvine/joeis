package irvine.oeis.a145;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A145768 a(n) = the bitwise XOR of squares of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A145768 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A145768(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A145768() {
    super(0);
  }

  protected long mN = -1;
  private Z mXor = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    mXor = mXor.xor(Z.valueOf(mN).square());
    return mXor;
  }

}

