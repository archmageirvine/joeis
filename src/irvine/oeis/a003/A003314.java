package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A003314 Binary entropy function: a(1)=0; for n &gt; 1, a(n) = n + min { a(k)+a(n-k) : 1 &lt;= k &lt;= n-1 }.
 * @author Sean A. Irvine
 */
public class A003314 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    return get((n + 1) / 2 - 1).add(get(n - (n + 1) / 2)).add(n + 1);
  }
}
