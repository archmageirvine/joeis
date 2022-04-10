package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A055934 a(0) = 1; a(n) = sum of a(j)'s, j&lt;n, where n is divisible by a(j).
 * @author Sean A. Irvine
 */
public class A055934 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    } else if ((n & 1) == 1) {
      return Z.TWO;
    }
    Z sum = Z.ZERO;
    for (final Z a : this) {
      if (n % a.intValueExact() == 0) {
        sum = sum.add(a);
      }
    }
    return sum;
  }
}
