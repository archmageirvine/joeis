package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A030067 The <code>"Semi-Fibonacci</code> sequence": <code>a(1) = 1; a(n) = a(n/2) (n</code> even); <code>a(n) = a(n-1) + a(n-2) (n</code> odd).
 * @author Sean A. Irvine
 */
public class A030067 extends MemorySequence {

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    if ((n & 1) == 0) {
      return get(n / 2);
    }
    return get(n - 1).add(get(n - 2));
  }
}
