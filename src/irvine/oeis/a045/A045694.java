package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A045694 Number of ternary words of length n (beginning with 0) with autocorrelation function 2^(n-1).
 * @author Sean A. Irvine
 */
public class A045694 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    final Z t = get(n - 1).multiply(3);
    return (n & 1) == 0 ? t.subtract(get(n / 2)) : t;
  }
}
