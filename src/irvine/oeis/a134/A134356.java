package irvine.oeis.a134;
// manually prodsim/prodsif at 2021-11-18 21:27

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A134356 a(n) = Product_{k=1..n-1} (3k+1)!/(n+k)!.
 * @author Georg Fischer
 */
public class A134356 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int k = 1; k <= mN - 1; ++k) {
      prod = prod.multiply(new Q(Functions.FACTORIAL.z(3 * k + 1), Functions.FACTORIAL.z(mN + k)));
    }
    return prod.toZ();
  }
}
