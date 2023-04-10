package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062770 n/[largest power of squarefree kernel] equals 1; perfect powers of sqf-kernels (or sqf-numbers).
 * @author Sean A. Irvine
 */
public class A062770 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.maxExponent() == fs.minExponent();
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
