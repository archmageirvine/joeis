package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A033879 Deficiency of n, or 2n - (sum of divisors of n).
 * @author Sean A. Irvine
 */
public class A033879 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A033879(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A033879() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(2 * mN).subtract(Functions.SIGMA1.z(mN));
  }

  @Override
  public Z a(final Z n) {
    return n.multiply2().subtract(Functions.SIGMA1.z(n));
  }

  @Override
  public final Z a(final int n) {
    return Z.valueOf(2L * n).subtract(Functions.SIGMA1.z(n));
  }
}

