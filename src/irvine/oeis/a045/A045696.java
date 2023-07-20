package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A045696 Number of ternary words of length n (beginning 0) with autocorrelation function 2^(n-1)+2.
 * @author Sean A. Irvine
 */
public class A045696 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 4) {
      return n == 4 ? Z.TWO : Z.ZERO;
    }
    final Z t = a(n - 1).multiply(3);
    return (n & 1) == 0 ? t.subtract(a(n / 2)).subtract(a(n / 2 + 1)) : t.add(a((n + 1) / 2).multiply(3));
  }
}

