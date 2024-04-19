package irvine.oeis.a308;
// manually prodsim/prodsif at 2021-11-18 23:07

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A308820 a(n) = Product_{k=1..n} ceiling(n/k)!.
 * @author Georg Fischer
 */
public class A308820 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(new Q(mN, k).ceiling()));
    }
    return prod;
  }
}
