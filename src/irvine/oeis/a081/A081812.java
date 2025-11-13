package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A081812 If n = p_1^e_1 * ... * p_k^e_k, p_1 &lt; ... &lt; p_k primes, then a(n) = Max{ Max(p_i, e_i) }.
 * @author Sean A. Irvine
 */
public class A081812 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Functions.GPF.z(++mN).max(Z.valueOf(Jaguar.factor(mN).maxExponent()));
  }
}
