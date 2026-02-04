package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392694 allocated for Gus Wiseman.
 * @author Sean A. Irvine
 */
public class A392694 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    long prev = 0;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      final long pi = Functions.PRIME_PI.l(p);
      for (int k = 0; k < fs.getExponent(p); ++k) {
        final long t = pi - prev;
        if (t < prev) {
          return false;
        }
        prev = t;
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
