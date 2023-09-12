package irvine.oeis.a182;
// manually prodsim at 2021-11-19 23:05

import irvine.factor.prime.Puma;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A182484 a(n) = Product_{k=1..p-1} k^(2k-p-1), where p = prime(n).
 * @author Georg Fischer
 */
public class A182484 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    final long p = Puma.prime(mN);
    for (int k = 1; k <= p - 1; ++k) {
      prod = prod.multiply(new Q(k).pow(2L * k - p - 1));
    }
    return prod.toZ();
  }
}
