package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A046699 a(1) = a(2) = 1, a(n) = a(n - a(n-1)) + a(n-1 - a(n-2)) if n &gt; 2.
 * @author Sean A. Irvine
 */
public class A046699 extends MemorySequence {

  {
    add(null); // 0 unused
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    }
    return get(n - get(n - 1).intValueExact()).add(get(n - 1 - get(n - 2).intValueExact()));
  }
}
