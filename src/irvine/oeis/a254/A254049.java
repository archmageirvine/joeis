package irvine.oeis.a254;
// manually 2023-10-24q4.pl bisect at 2021-07-05 22:21

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003961;

/**
 * A254049 Odd bisection of A048673: a(n) = A048673(2*n-1).
 * @author Georg Fischer
 */
public class A254049 extends AbstractSequence implements DirectSequence {

  private int mN = 0;
  private final A003961 mSeq = new A003961();

  /** Construct the sequence. */
  public A254049() {
    super(1);
  }

  @Override
  public final Z a(final int n) {
    return mSeq.a(2 * n - 1).add(1).divide2();
  }

  @Override
  public final Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
