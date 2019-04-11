package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006949 A well-behaved cousin of the Hofstadter sequence: <code>a(n) = a(n - 1 - a(n-1)) + a(n - 2 - a(n-2))</code> for <code>n &gt; 2</code> with <code>a(0) = a(1) = a(2) = 1</code>.
 * @author Sean A. Irvine
 */
public class A006949 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    }
    return get(n - 1 - get(n - 1).intValueExact()).add(get(n - 2 - get(n - 2).intValueExact()));
  }
}
