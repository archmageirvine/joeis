package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005388 Number of degree-n permutations of order a power of 2.
 * @author Sean A. Irvine
 */
public class A005388 extends MemorySequence {

  // After Alois P. Heinz

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; j <<= 1) {
      Z t = Z.ONE;
      for (int i = 1; i < j; ++i) {
        t = t.multiply(n - i);
      }
      sum = sum.add(t.multiply(get(n - j)));
    }
    return sum;
  }
}
