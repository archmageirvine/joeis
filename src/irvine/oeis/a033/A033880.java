package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A033880 Abundance of n, or (sum of divisors of n) - 2n.
 * @author Sean A. Irvine
 */
public class A033880 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A033880(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A033880() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA1.z(++mN).subtract(2 * mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.SIGMA1.z(n).subtract(n.multiply2());
  }

  @Override
  public Z a(final int n) {
    return Functions.SIGMA1.z(n).subtract(2L * n);
  }

}
