package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048767 If n = Product (p_j^k_j) then a(n) = Product ( prime(k_j)^pi(p_j) ) where pi is A000720.
 * @author Sean A. Irvine
 */
public class A048767 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Functions.PRIME.z(fs.getExponent(p)).pow(Functions.PRIME_PI.l(p)));
    }
    return prod;
  }
}
