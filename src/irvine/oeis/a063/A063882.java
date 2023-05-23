package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A063882 a(n) = a(n - a(n - 1)) + a(n - a(n - 4)), with a(1) = ... = a(4) = 1.
 * @author Sean A. Irvine
 */
public class A063882 extends MemorySequence {

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 4) {
      return Z.ONE;
    }
    return a(n - a(n - 1).intValueExact()).add(a(n - a(n - 4).intValueExact()));
  }
}
