package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391024 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A391024 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ZERO;
    }
    if (Predicates.PRIME.is(mN)) {
      return Z.ONE;
    }
    if (Functions.OMEGA.i(mN) == 1) {
      return Z.TWO;
    }
    if (Functions.OMEGA.i(mN) == Functions.BIG_OMEGA.l(mN)) {
      return Z.THREE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    if (fs.minExponent() == 1) {
      return Z.FOUR;
    }
    long g = fs.minExponent();
    for (final Z p : fs.toZArray()) {
      g = Functions.GCD.l(g, fs.getExponent(p));
    }
    return g == 1 ? Z.FIVE : Z.SIX;
  }
}
