package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005185 Hofstadter Q-sequence: a(1) = a(2) = 1; a(n) = a(n-a(n-1)) + a(n-a(n-2)) for n &gt; 2.
 * @author Sean A. Irvine
 */
public class A005185 extends MemorySequence {

  {
    setOffset(1);
    add(null); // no 0th term
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 2 ? Z.ONE : a(n - a(n - 1).intValueExact()).add(a(n - a(n - 2).intValueExact()));
  }
}
