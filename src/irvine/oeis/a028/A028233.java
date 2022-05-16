package irvine.oeis.a028;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028233 If n = p_1^e_1 * ... * p_k^e_k, p_1 &lt; ... &lt; p_k primes, then a(n) = p_1^e_1, with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A028233 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final Z p = fs.toZArray()[0];
    return p.pow(fs.getExponent(p));
  }
}
