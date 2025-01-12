package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074110 Largest n-digit squarefree number.
 * @author Sean A. Irvine
 */
public class A074110 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    long k = 0;
    while (true) {
      final Z t = mA.subtract(++k);
      if (Predicates.SQUARE_FREE.is(t)) {
        return t;
      }
    }
  }
}
