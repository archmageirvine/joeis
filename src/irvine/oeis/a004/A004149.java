package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004149 Generalized Catalan numbers: a(n+1) = a(n) + Sum_{k=2..n-1} a(k)a(n-1-k).
 * @author Sean A. Irvine
 */
public class A004149 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    Z s = a(n - 1);
    for (int k = 2; k < n - 1; ++k) {
      s = s.add(a(k).multiply(a(n - 2 - k)));
    }
    return s;
  }
}
