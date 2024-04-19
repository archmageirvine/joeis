package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A060055 Denominators of nonzero numbers appearing in the Euler-Maclaurin summation formula. (See A060054 for the definition of these numbers.).
 * @author Sean A. Irvine
 */
public class A060055 extends FilterSequence {

  /** Construct the sequence. */
  public A060055() {
    super(new A060054() {
      @Override
      protected Z select(final Q n) {
        return n.isZero() ? Z.ZERO : n.den().multiply(Functions.FACTORIAL.z(mN));
      }
    }, NONZERO);
  }
}
