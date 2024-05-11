package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066567 Numbers that when incremented by the product of their digits produce a square.
 * @author Sean A. Irvine
 */
public class A066567 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN + Functions.DIGIT_PRODUCT.l(mN);
      if (Predicates.SQUARE.is(n)) {
        return Z.valueOf(mN);
      }
    }
  }
}
