package irvine.oeis.a121;
// manually egfu at 2021-12-03 20:06

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;
import irvine.oeis.PrependSequence;

/**
 * A121586 Number of columns in all deco polyominoes of height n. A deco polyomino is a directed column-convex polyomino in which the height, measured along the diagonal, is attained only in the last column.
 * E.g.f.: ((x-1)*log(1-x)-x-1)/(x-1)^3
 * @author Georg Fischer
 */
public class A121586 extends PrependSequence {

  /** Construct the sequence. */
  public A121586() {
    super(new ExponentialGeneratingFunction(0) {
            @Override
            public Polynomial<Q> compute(final int n) {
              return RING.series(RING.subtract(RING.subtract(RING.multiply(RING.subtract(RING.x(), RING.one()), RING.log(RING.oneMinusXToTheN(1), n), n), RING.x()), RING.one()), RING.pow(RING.subtract(RING.x(), RING.one()), 3, n), n);
            }
          }
      , 1);
  }
}
