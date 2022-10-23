package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034684 If n = p_1^e_1 * ... * p_k^e_k, p_1 &lt; ... &lt; p_k primes, then a(n) = min { p_i^e_i }.
 * @author Sean A. Irvine
 */
public class A034684 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z min = Z.valueOf(++mN);
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      min = min.min(p.pow(fs.getExponent(p)));
    }
    return min;
  }
}
