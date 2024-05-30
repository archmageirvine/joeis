package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056867 Nilpotent numbers: n such that every group of order n is nilpotent.
 * @author Sean A. Irvine
 */
public class A056867 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      for (int j = 1; j <= fs.getExponent(p); ++j) {
        if (Functions.GCD.l(n, p.pow(j).longValueExact() - 1) > 1) {
          return false;
        }
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

