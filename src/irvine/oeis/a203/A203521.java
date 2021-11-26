package irvine.oeis.a203;
// manually prodsi2 at 2021-11-25

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A203521 a(n) = Product_{1 &lt;= i &lt; j &lt;= n} (prime(i) + prime(j)).
 * @author Georg Fischer
 */
public class A203521 implements Sequence {

  private int mN = -1;
  private final MemorySequence mA000040 = MemorySequence.cachedSequence(new PrependSequence(new A000040(), 1));

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(mA000040.a(k).add(mA000040.a(j)));
      }
    }
    return prod;
  }
}
