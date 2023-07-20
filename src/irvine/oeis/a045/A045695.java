package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A045695 Number of ternary words of length n (beginning 0) with autocorrelation function 2^(n-1)+1.
 * @author Sean A. Irvine
 */
public class A045695 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return n == 1 ? Z.ZERO : Z.ONE;
    }
    final Z t = a(n - 1).multiply(3);
    return (n & 1) == 0 ? t.add(a(n / 2).multiply2()) : t.subtract(a((n + 1) / 2));
  }
}
