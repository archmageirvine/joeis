package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A045697 Number of ternary words of length n (beginning 0) with autocorrelation function 2^(n-1)+3.
 * @author Sean A. Irvine
 */
public class A045697 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 4) {
      return n == 3 ? Z.ONE : Z.ZERO;
    }
    final Z t = a(n - 1).multiply(3);
    return (n & 1) == 0 ? t.add(a(n / 2).multiply2()).subtract(a(n / 2 + 1)) : t.add(a((n + 1) / 2).multiply2());
  }
}

