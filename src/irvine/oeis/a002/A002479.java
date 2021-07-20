package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002479 Numbers of form x^2 + 2y^2.
 * @author Sean A. Irvine
 */
public class A002479 implements Sequence {

  private long mN = -1;

  private boolean is(final long n) {
    final FactorSequence fs = Cheetah.factor(n);
    for (final Z p : fs.toZArray()) {
      if (p.mod(8) > 4 && fs.getExponent(p) % 2 != 0) {
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
