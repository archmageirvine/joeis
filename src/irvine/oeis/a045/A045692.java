package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A045692 Number of binary words of length n (beginning 0) with autocorrelation function 2^(n-1)+2.
 * @author Sean A. Irvine
 */
public class A045692 extends MemorySequence {

  {
    setOffset(1);
    add(null); // 0th not used
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 4) {
      return n <= 3 ? Z.ZERO : Z.ONE;
    }
    final Z t = a(n - 1).multiply2();
    return (n & 1) == 0 ? t.subtract(a(n / 2)).subtract(a(n / 2 + 1)) : t.add(a((n + 1) / 2).multiply2());
  }
}
