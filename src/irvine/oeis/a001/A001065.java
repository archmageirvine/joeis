package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001065 Sum of proper divisors (or aliquot parts) of n: sum of divisors of n that are less than n.
 * @author Sean A. Irvine
 */
public class A001065 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001065(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001065() {
    super(1);
  }

  protected long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA1.z(++mN).subtract(mN);
  }
}
