package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066566 Numbers that when decremented by the sum of their digits produce a square.
 * @author Sean A. Irvine
 */
public class A066566 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN - Functions.DIGIT_SUM.l(mN);
      if (Predicates.SQUARE.is(n)) {
        return Z.valueOf(mN);
      }
    }
  }
}
