package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033485 a(n) = a(n-1) + a(floor(n/2)), a(1) = 1.
 * @author Sean A. Irvine
 */
public class A033485 extends MemorySequence {

  {
    add(null); // 0 unused
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 1 ? Z.ONE : get(n - 1).add(get(n / 2));
  }
}

