package irvine.oeis.a100;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A100549 Let n = 2^e_2 * 3^e_ * 5^e_ * ... be the prime factorization of n; then a(n) = largest prime &lt;= 1 + max{e_2, e_3, e_5, ...}; a(1) = 1 by convention.
 * @author Sean A. Irvine
 */
public class A100549 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Functions.PREV_PRIME.z(Jaguar.factor(mN).maxExponent() + 2);
  }
}
