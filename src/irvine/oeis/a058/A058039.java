package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A058039 a(n) = a(n-1) + 2*a(floor(n/2)) if n &gt; 0, otherwise 1.
 * @author Sean A. Irvine
 */
public class A058039 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 0 ? Z.ONE : a(n - 1).add(a(n / 2).multiply2());
  }
}
