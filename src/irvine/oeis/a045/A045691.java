package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A045691 Number of binary words of length n with autocorrelation function 2^(n-1)+1.
 * @author Sean A. Irvine
 */
public class A045691 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return n == 0 ? Z.ZERO : Z.ONE;
    }
    return a(n - 1).multiply2().signedAdd((n & 1) == 1, a(n / 2));
  }
}

