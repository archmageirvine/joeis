package irvine.oeis.a097;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A097408 Initial decimal digit of n^4.
 * @author Georg Fischer
 */
public class A097408 extends AbstractSequence {

  protected int mN;
  protected int mExpon;

  /** Construct the sequence. */
  public A097408() {
    this(1, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param expon exponent
   */
  public A097408(final int offset, final int expon) {
    super(offset);
    mN = offset - 1;
    mExpon = expon;
  }

  @Override
  public Z next() {
    return new Z(Z.valueOf(++mN).pow(mExpon).toString().substring(0, 1));
  }
}
