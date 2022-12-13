package irvine.oeis.a107;
// manually anopan 1,1

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A107473 Sum of numerator and denominator of product{p|n,p=primes} (1 -1/p).
 * @author Georg Fischer
 */
public class A107473 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      prod = prod.multiply(Q.ONE.subtract(new Q(Z.ONE, p)));
    }
    return prod.num().add(prod.den());
  }
}
