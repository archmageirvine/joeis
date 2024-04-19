package irvine.oeis.a266;
// manually prodsim/prodsif at 2021-11-18 21:59

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A266091 a(n) = Product_{k=0..n} (3*k)!/(n+k)!.
 * @author Georg Fischer
 */
public class A266091 extends Sequence0 {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int k = 0; k <= mN; ++k) {
      prod = prod.multiply(new Q(Functions.FACTORIAL.z(3 * k), Functions.FACTORIAL.z(mN + k)));
    }
    return prod.toZ();
  }
}
