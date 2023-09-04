package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A065504 a(n+1) = a(n) + n + the number of a(k)'s &lt;= n, 1 &lt;= k &lt;= n and a(1) = 1.
 * @author Sean A. Irvine
 */
public class A065504 extends MemorySequence {

  private int mM = 1;
  {
    add(null);
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    while (mM < n && a(mM).intValueExact() < n) {
      ++mM;
    }
    return a(n - 1).add(n + mM - 2);
  }
}
