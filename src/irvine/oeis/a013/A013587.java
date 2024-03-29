package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A013587 Number of rational plane curves of degree d passing through 3d-1 general points.
 * @author Sean A. Irvine
 */
public class A013587 extends MemorySequence {

  {
    setOffset(1);
    add(null); // 0th term
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int i = 1; i < n; ++i) {
      final int j = n - i;
      final long i2 = i * (long) i;
      final Z m = Binomial.binomial(3L * n - 4, 3L * i - 2).multiply(i2).multiply(j * (long) j)
        .subtract(Binomial.binomial(3L * n - 4, 3L * i - 1).multiply(j).multiply(i).multiply(i2));
      sum = sum.add(m.multiply(a(i)).multiply(a(j)));
    }
    return sum;
  }
}
