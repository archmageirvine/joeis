package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077668.
 * @author Sean A. Irvine
 */
public class A077672 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (Predicates.SQUARE.is(mN)) {
      return Z.NEG_ONE;
    }
    long k = 1;
    while (true) {
      final Z t = Functions.TRIANGULAR.z(++k);
      final Z tn = t.multiply(mN);
      if (Predicates.TRIANGULAR.is(tn)) {
        return tn;
      }
    }
  }
}
