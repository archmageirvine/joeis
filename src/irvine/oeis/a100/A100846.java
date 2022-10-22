package irvine.oeis.a100;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A100846 Concatenate (1,n,n,1).
 * @author Georg Fischer
 */
public class A100846 extends AbstractSequence {

  private int mN;
  private final String mDigit;

  /** Construct the sequence. */
  public A100846() {
    this(0, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param digit leading and trailing digit
   */
  public A100846(final int offset, final int digit) {
    super(offset);
    mN = -1;
    mDigit = String.valueOf(digit);
  }

  @Override
  public Z next() {
    ++mN;
    final String nz = Z.valueOf(mN).toString();
    return new Z(mDigit + nz + nz + mDigit);
  }
}
