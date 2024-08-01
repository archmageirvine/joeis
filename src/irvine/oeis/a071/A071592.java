package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071592 Numbers m such that Reversal(m) is not squarefree.
 * @author Sean A. Irvine
 */
public class A071592 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!Predicates.SQUARE_FREE.is(Functions.REVERSE.l(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

