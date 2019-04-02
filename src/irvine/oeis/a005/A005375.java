package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005375 a(0) = 0; a(n) = n - a(a(a(a(n-1)))) for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A005375 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 0 ? Z.ZERO : Z.valueOf(n - get(get(get(get(n - 1).intValueExact()).intValueExact()).intValueExact()).intValueExact());
  }
}
