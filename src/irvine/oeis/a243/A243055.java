package irvine.oeis.a243;
// manually 2026-03-07

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A243055 Difference between the indices of the smallest and the largest prime dividing n: If n = p_i * ... * p_k, where p_i &lt;= ... &lt;= p_k, where p_h = A000040(h), then a(n) = (k-i), a(1) = 0 by convention.
 * If n = p_i * ... * p_k, where p_i &lt;= ... &lt;= p_k, where p_h = A000040(h), then a(n) = (k-i), a(1) = 0 by convention.
 * @author Georg Fischer
 */
public class A243055 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    final Z[] f = Jaguar.factor(n).toZArray();
    return f.length == 0 ? Z.ZERO : Functions.PRIME_PI.z(f[f.length - 1]).subtract(Functions.PRIME_PI.z(f[0]));
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }

}
