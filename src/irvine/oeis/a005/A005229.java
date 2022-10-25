package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005229 a(1) = a(2) = 1; for n &gt; 2, a(n) = a(a(n-2)) + a(n - a(n-2)).
 * @author Sean A. Irvine
 */
public class A005229 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    }
    final int v = get(n - 2).intValueExact();
    return get(v).add(get(n - v));
  }
}
