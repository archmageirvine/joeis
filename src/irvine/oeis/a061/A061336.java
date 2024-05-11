package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061336 Smallest number of triangular numbers which sum to n.
 * @author Sean A. Irvine
 */
public class A061336 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long m = ++mN % 9;
    if (m == 5 || m == 8) {
      return Z.THREE;
    }
    final FactorSequence f = Jaguar.factor(4 * mN + 1);
    for (final Z p : f.toZArray()) {
      if ((f.getExponent(p) & 1) == 1 && p.mod(4) == 3) {
        return Z.THREE;
      }
    }
    if (Predicates.TRIANGULAR.is(mN)) {
      return mN > 0 ? Z.ONE : Z.ZERO;
    }
    return Z.TWO;
  }
}
