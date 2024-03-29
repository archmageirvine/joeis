package irvine.oeis.a104;
// Generated by gen_seq4.pl num1dig at 2021-04-28 10:09

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A104320 Number of zeros in ternary representation of 2^n.
 * @author Georg Fischer
 */
public class A104320 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A104320(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A104320() {
    super(0);
  }

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(ZUtils.digitCounts(Z.ONE.shiftLeft(mN), 3)[0]);
  }
}
