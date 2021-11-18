package irvine.oeis.a266;
// manually prodsim/prodsif at 2021-11-18 21:59

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A266091 a(n) = Product_{k=0..n} (3*k)!/(n+k)!.
 * @author Georg Fischer
 */
public class A266091 implements Sequence {

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int k = 0; k <= mN; ++k) {
      prod = prod.multiply(new Q(FACTORIAL.factorial(3 * k), FACTORIAL.factorial(mN + k)));
    }
    return prod.toZ();
  }
}
