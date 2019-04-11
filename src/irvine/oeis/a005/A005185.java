package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005185 Hofstadter Q-sequence: <code>a(1) = a(2) = 1</code>; <code>a(n) = a(n-a(n-1)) + a(n-a(n-2))</code> for <code>n &gt; 2</code>.
 * @author Sean A. Irvine
 */
public class A005185 extends MemorySequence {

  {
    add(null); // no 0th term
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 2 ? Z.ONE : get(n - get(n - 1).intValueExact()).add(get(n - get(n - 2).intValueExact()));
  }
}
