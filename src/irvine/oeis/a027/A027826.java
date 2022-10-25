package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A027826 Inverse binomial transform of a_0 = 1, a_1, a_2, etc. is a_0, 0, a_1, 0, a_2, 0, etc.
 * @author Sean A. Irvine
 */
public class A027826 extends MemorySequence {

  // After Alois P. Heinz

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = Z.ONE;
    for (int k = 2; k <= n; k += 2) {
      sum = sum.add(a(k / 2).multiply(Binomial.binomial(n, k)));
    }
    return sum;
  }
}
