package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004148 Generalized Catalan numbers: a(n+1) = a(n) + Sum_{k=1..n-1} a(k)*a(n-1-k).
 * @author Sean A. Irvine
 */
public class A004148 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    Z s = get(n - 1);
    for (int k = 1; k < n - 1; ++k) {
      s = s.add(get(k).multiply(get(n - 2 - k)));
    }
    return s;
  }
}
