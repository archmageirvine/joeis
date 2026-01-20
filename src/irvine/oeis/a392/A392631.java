package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390788.
 * @author Sean A. Irvine
 */
public class A392631 extends Sequence1 {

  private long mN = 0;

  private boolean isExp(final int e) {
    return e == 1 || (Predicates.PRIME.is(e) && e + 1 == 1 << Functions.VALUATION.i(e + 1, 2));
  }

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      if (!isExp(fs.getExponent(p))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
