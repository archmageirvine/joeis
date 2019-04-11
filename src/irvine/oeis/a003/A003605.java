package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A003605 Unique monotonic sequence of nonnegative integers satisfying <code>a(a(n)) = 3n</code>.
 * @author Sean A. Irvine
 */
public class A003605 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return n == 0 ? Z.ZERO : Z.valueOf(n + 1);
    }
    return get(n / 3).multiply(3 - n % 3).add(get(n / 3 + 1).multiply(n % 3));
  }
}
