package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051377 a(1)=1; for n &gt; 1, a(n) = sum of exponential divisors (or e-divisors) of n.
 * @author Sean A. Irvine
 */
public class A051377 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      Z sum = Z.ZERO;
      for (int d = 1; d <= e; ++d) {
        if (e % d == 0) {
          sum = sum.add(p.pow(d));
        }
      }
      prod = prod.multiply(sum);
    }
    return prod;
  }
}

