package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A038057 a(n) = 2^n*n^(n-1).
 * @author Sean A. Irvine
 */
public class A038057 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A038057(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A038057() {
    super(1);
  }

  protected int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN - 1).shiftLeft(mN);
  }
}
