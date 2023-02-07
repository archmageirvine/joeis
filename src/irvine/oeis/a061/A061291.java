package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A061291 a(1) = 1; a(n+1) = a(1) + a(2)*(a(2) + a(3)*(a(3) +...+a(n-1)*(a(n-1) + a(n))...)).
 * @author Sean A. Irvine
 */
public class A061291 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z t = a(n - 1);
    for (int k = n - 2; k >= 0; --k) {
      t = t.add(a(k)).multiply(a(k));
    }
    return t;
  }
}
