package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A065548 a(1) = 1 and, for n &gt; 0, a(2*n) = sum{a(i) | 0 &lt; i &lt;= n}, a(2*n+1) = a(n)^2.
 * @author Sean A. Irvine
 */
public class A065548 extends MemorySequence {

  {
    add(null);
    setOffset(1);
  }
  private Z mSum = Z.ZERO;

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    } else if ((n & 1) == 0) {
      mSum = mSum.add(a(n / 2));
      return mSum;
    } else {
      return a((n - 1) / 2).square();
    }
  }
}

