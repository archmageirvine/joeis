package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
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
    return Z.valueOf(2 * mN).subtract(Jaguar.factor(mN).sigma());
  }

  @Override
  public Z a(final Z n) {
    return n.multiply2().subtract(Jaguar.factor(n).sigma());
  }

  @Override
  public final Z a(final int n) {
    return Z.valueOf(2 * n).subtract(Jaguar.factor(n).sigma());
  }
}

