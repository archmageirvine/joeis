package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000005 d(n) (also called tau(n) or sigma_0(n)), the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A000005 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000005(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000005() {
    super(1);
  }

  protected long mN = 0;

  @Override
  public Z a(final Z n) {
    return Functions.SIGMA0.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.SIGMA0.z(n);
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(++mN);
  }
}

