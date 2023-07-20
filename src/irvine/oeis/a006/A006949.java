package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A006949 A well-behaved cousin of the Hofstadter sequence: a(n) = a(n - 1 - a(n-1)) + a(n - 2 - a(n-2)) for n &gt; 2 with a(0) = a(1) = a(2) = 1.
 * @author Sean A. Irvine
 */
public class A006949 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    }
    return a(n - 1 - a(n - 1).intValueExact()).add(a(n - 2 - a(n - 2).intValueExact()));
  }
}
