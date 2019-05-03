package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004001 <code>Hofstadter-Conway $10000</code> sequence: <code>a(n) = a(a(n-1)) + a(n-a(n-1))</code> with <code>a(1) = a(2) = 1</code>.
 * @author Sean A. Irvine
 */
public class A004001 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    } else {
      final int m = get(n - 1).intValueExact();
      return get(m - 1).add(get(n - m));
    }
  }
}

