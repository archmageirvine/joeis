package irvine.oeis.a013;

import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A013928 Number of (positive) squarefree numbers &lt; n.
 * @author Sean A. Irvine
 */
public class A013928 extends AbstractSequence implements DirectSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A013928() {
    super(1);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Integers.SINGLETON.sum(1, n - 1, k -> Predicates.SQUARE_FREE.is(k) ? Z.ONE : Z.ZERO);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

