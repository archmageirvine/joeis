package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392632 Numbers k whose squarefree kernel is the only exponential divisor of k that is a number whose number of divisors is a power of 2.
 * @author Sean A. Irvine
 */
public class A392632 extends Sequence1 {

  private long mN = 0;

  private boolean isExp(final int e) {
    for (int i = IntegerUtils.floorLog2(e + 1); i >= 2; --i) {
      if (e % ((1 << i) - 1) == 0) {
        return false;
      }
    }
    return true;
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
