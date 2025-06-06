package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077672 a(1) = 1; for n &gt; 1, a(n) = smallest triangular number which is n times another triangular number &gt; 1, or -1 if no such number exists.
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
