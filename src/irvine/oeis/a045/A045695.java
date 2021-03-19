package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A045695 Number of ternary words of length n (beginning 0) with autocorrelation function 2^(n-1)+1.
 * @author Sean A. Irvine
 */
public class A045695 extends MemorySequence {

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return n == 1 ? Z.ZERO : Z.ONE;
    }
    final Z t = get(n - 1).multiply(3);
    return (n & 1) == 0 ? t.add(get(n / 2).multiply2()) : t.subtract(get((n + 1) / 2));
  }
}
