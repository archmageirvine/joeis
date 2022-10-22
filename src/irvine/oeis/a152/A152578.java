package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A152578 Numbers of the form 5^(2^n) + 2.
 * @author Georg Fischer
 */
public class A152578 extends AbstractSequence {

  private int mN;
  private final Z mBase;

  /** Construct the sequence. */
  public A152578() {
    this(1, 5);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base number base to be exponentiated
   */
  public A152578(final int offset, final int base) {
    super(offset);
    mN = -1;
    mBase = Z.valueOf(base);
  }

  @Override
  public Z next() {
    return mBase.pow(1L << ++mN).add(2);
  }
}
