package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A019308 Number of "bifix-free" words of length n over a three-letter alphabet.
 * @author Sean A. Irvine
 */
public class A019308 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    return a(n - 1).multiply(3).subtract((n & 1) == 0 ? a(n / 2) : Z.ZERO);
  }
}
