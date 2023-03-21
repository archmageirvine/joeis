package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A062170.
 * @author Sean A. Irvine
 */
public class A062186 extends MemorySequence {

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 1 ? Z.ONE : a(n - 1).subtract(a(n / 2));
  }
}
