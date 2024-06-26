package irvine.oeis.a003;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003658 Fundamental discriminants of real quadratic fields; indices of primitive positive Dirichlet L-series.
 * @author Sean A. Irvine
 */
public class A003658 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A003658(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A003658() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long r = mN & 3;
      if (r == 1) {
        if (Predicates.SQUARE_FREE.is(mN)) {
          return Z.valueOf(mN);
        }
      } else if (r == 0 && ((mN / 4) & 3) > 1 && Predicates.SQUARE_FREE.is(mN / 4)) {
        return Z.valueOf(mN);
      }
    }
  }
}
