package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A001764 a(n) = binomial(3*n,n)/(2*n+1) (enumerates ternary trees and also noncrossing trees).
 * @author Sean A. Irvine
 */
public class A001764 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001764(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001764() {
    super(0);
  }

  private long mN = -1;

  protected Z a(final long n) {
    return Binomial.binomial(3 * n, n).divide(2 * n + 1);
  }

  @Override
  public Z a(final Z n) {
    return Binomial.binomial(n.multiply(3), n).divide(n.multiply2().add(1));
  }

  @Override
  public Z a(final int n) {
    return Binomial.binomial(3L * n, n).divide(2L * n + 1);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
