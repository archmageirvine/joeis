package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A033489 a(1) = 1, a(n) = 2*a(n-1) + a([n/2]).
 * @author Sean A. Irvine
 */
public class A033489 extends MemorySequence {

  {
    setOffset(1);
    add(null); // 0 unused
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 1 ? Z.ONE : a(n - 1).multiply2().add(a(n / 2));
  }
}

