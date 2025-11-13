package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081810 If n = p_1^e_1 * ... * p_k^e_k, p_1 &lt; ... &lt; p_k primes, then a(n) = Max{ p_i*e_i }.
 * @author Sean A. Irvine
 */
public class A081810 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z max = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      final Z q = p.multiply(fs.getExponent(p));
      if (q.compareTo(max) > 0) {
        max = q;
      }
    }
    return max;
  }
}
