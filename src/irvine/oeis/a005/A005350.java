package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005350 a(1) = a(2) = a(3) = 1, a(n) = a(a(n-1))+a(n-a(n-1)) for n &gt;= 4.
 * @author Sean A. Irvine
 */
public class A005350 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    final int prev = get(n - 1).intValueExact();
    return n <= 3 ? Z.ONE : get(prev).add(get(n - prev));
  }
}

