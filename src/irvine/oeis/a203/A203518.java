package irvine.oeis.a203;
// manually prodsi2 at 2021-11-25

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A203518 a(n) = Product_{2 &lt;= i &lt; j &lt;= n+1} (F(i) + F(j)), where F = A000045 (Fibonacci numbers).
 * @author Georg Fischer
 */
public class A203518 extends Sequence1 {

  protected int mN = 0;
  private final MemorySequence mA000045 = MemorySequence.cachedSequence(new A000045());

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(mA000045.a(k + 1).add(mA000045.a(j + 1)));
      }
    }
    return prod;
  }
}
