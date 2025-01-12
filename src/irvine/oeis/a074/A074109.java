package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074109 Smallest n-digit squarefree number.
 * @author Sean A. Irvine
 */
public class A074109 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.TWO;
    }
    mA = mA.multiply(10);
    long k = -1;
    while (true) {
      final Z t = mA.add(++k);
      if (Predicates.SQUARE_FREE.is(t)) {
        return t;
      }
    }
  }
}
