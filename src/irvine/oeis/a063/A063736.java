package irvine.oeis.a063;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063736 Patterns of possible squarefree triples of 3 consecutive numbers {4k+1, 4k+2, 4k+3} are coded as follows: compute A008966(x) getting one of {000, 001, 010, 011, 100, 101, 110, 111} and convert to decimal.
 * @author Sean A. Irvine
 */
public class A063736 extends Sequence0 {

  private long mN = -3;

  @Override
  public Z next() {
    mN += 4;
    return Z.valueOf(
      (Predicates.SQUARE_FREE.is(mN) ? 4 : 0)
        + (Predicates.SQUARE_FREE.is(mN + 1) ? 2 : 0)
        + (Predicates.SQUARE_FREE.is(mN + 2) ? 1 : 0)
    );
  }
}
