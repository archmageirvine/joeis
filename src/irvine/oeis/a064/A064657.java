package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A064657 a(n) = a(|n - a(n-3)|) + a(|n - a(n-4)|) for n &gt; 3, a(n)=1 otherwise.
 * @author Sean A. Irvine
 */
public class A064657 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return Z.ONE;
    }
    if (n > 866) {
      return null;
    }
    return a(Math.abs(n - a(n - 3).intValueExact())).add(a(Math.abs(n - a(n - 4).intValueExact())));
  }
}

