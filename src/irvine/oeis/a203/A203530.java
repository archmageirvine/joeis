package irvine.oeis.a203;
// manually prodsi2 at 2021-11-25

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a018.A018252;

/**
 * A203530 a(n) = Product_{1 &lt;= i &lt; j &lt;= n} (c(i) + c(j)); c = A002808 = composite numbers.
 * @author Georg Fischer
 */
public class A203530 extends Sequence1 {

  protected int mN = 0;
  private final MemorySequence mA018252 = MemorySequence.cachedSequence(new A018252());

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(mA018252.a(k).add(mA018252.a(j)));
      }
    }
    return prod;
  }
}
