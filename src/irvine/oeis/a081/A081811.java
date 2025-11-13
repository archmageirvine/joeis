package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081811 If n = p_1^e_1 * ... * p_k^e_k, p_1 &lt; ... &lt; p_k primes, then a(n) = min{ p_i*e_i }.
 * @author Sean A. Irvine
 */
public class A081811 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    Z min = Z.valueOf(mN);
    for (final Z p : fs.toZArray()) {
      final Z q = p.multiply(fs.getExponent(p));
      if (q.compareTo(min) < 0) {
        if (q.equals(Z.TWO)) {
          return Z.TWO; // We will not get smaller
        }
        min = q;
      }
    }
    return min;
  }
}
