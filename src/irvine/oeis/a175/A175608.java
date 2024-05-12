package irvine.oeis.a175;
// manually deris/charfun at 2022-07-01 23:08

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A175608 Characteristic function of squarefree triangular integers: 1 if n(n+1)/2 is squarefree else 0.
 * @author Georg Fischer
 */
public class A175608 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Predicates.SQUARE_FREE.is(mN * (mN + 1) / 2) ? Z.ONE : Z.ZERO;
  }
}
