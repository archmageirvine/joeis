package irvine.oeis.a063;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A063772 a(k^2 + i) = k + a(i) for k &gt;= 0 and 0 &lt;= i &lt;= k * 2; a(0) = 0.
 * @author Sean A. Irvine
 */
public class A063772 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    final int k = IntegerUtils.sqrt(n);
    return a(n - k * k).add(k);
  }
}
