package irvine.oeis.a080;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080666 Numbers k such that k^2 + 1 and k^2 - 1 are not squarefree.
 * @author Sean A. Irvine
 */
public class A080666 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z n2 = Z.valueOf(++mN).square();
      if (!Predicates.SQUARE_FREE.is(n2.subtract(1)) && !Predicates.SQUARE_FREE.is(n2.add(1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
