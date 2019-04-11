package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A003314 Binary entropy function: <code>a(1)=0</code>; for <code>n &gt; 1, a(n) = n +</code> min { a(k)+a(n-k) : <code>1 &lt;=</code> k <code>&lt;= n-1 }</code>.
 * @author Sean A. Irvine
 */
public class A003314 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    return get((n + 1) / 2 - 1).add(get(n - (n + 1) / 2)).add(n + 1);
  }
}
