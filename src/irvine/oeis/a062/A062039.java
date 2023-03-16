package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A061850.
 * @author Sean A. Irvine
 */
public class A062039 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    final int a = a(n - 1).intValueExact();
    return a >= n ? Z.valueOf(a - n + 1) : a(a).add(a);
  }
}

