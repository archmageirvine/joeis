package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081807 Numbers k such that the largest prime power factor of k equals floor(sqrt(k)).
 * @author Sean A. Irvine
 */
public class A081807 extends Sequence1 {

  private long mN = 29;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    final Z sqrt = Functions.SQRT.z(n);
    Z max = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      final Z q = p.pow(fs.getExponent(p));
      if (q.compareTo(max) > 0) {
        if (q.compareTo(sqrt) > 0) {
          return false;
        }
        max = q;
      }
    }
    return max.equals(sqrt);
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
