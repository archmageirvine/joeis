package irvine.oeis.a028;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A028233 If n = p_1^e_1 * ... * p_k^e_k, p_1 &lt; ... &lt; p_k primes, then a(n) = p_1^e_1, with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A028233 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.equals(Z.ONE)) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    final Z p = fs.leastPrimeFactor();
    return p.pow(fs.getExponent(p));
  }

  @Override
  public Z a(final int n) {
    if (n == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    final Z p = fs.leastPrimeFactor();
    return p.pow(fs.getExponent(p));
  }

}
