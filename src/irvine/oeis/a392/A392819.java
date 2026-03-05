package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392819 Numbers k such that p + e divides k for every prime power p^e in the canonical prime factorization of k.
 * @author Sean A. Irvine
 */
public class A392819 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (n % (p.longValue() + e) != 0) {
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
