package irvine.oeis.a125;
// manually egfu at 2021-12-03 20:06

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;
import irvine.oeis.PrependSequence;

/**
 * A125307 Number of increasing trees with branches of height 1.
 * E.g.f.: (x-1+log(1-x)) / ( (x-1)^2 (log(1-x)-1) )
 * @author Georg Fischer
 */
public class A125307 extends PrependSequence {

  /** Construct the sequence. */
  public A125307() {
    super(new ExponentialGeneratingFunction(1) {
            @Override
            public Polynomial<Q> compute(final int n) {
              return RING.series(RING.add(RING.subtract(RING.x(), RING.one()), RING.log(RING.oneMinusXToTheN(1), n)), RING.multiply(RING.pow(RING.subtract(RING.x(), RING.one()), 2, n), RING.subtract(RING.log(RING.oneMinusXToTheN(1), n), RING.one()), n), n);
            }
          }
      , 1);
  }
}
