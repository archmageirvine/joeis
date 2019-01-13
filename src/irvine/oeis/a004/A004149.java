package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004149.
 * @author Sean A. Irvine
 */
public class A004149 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    Z s = get(n - 1);
    for (int k = 2; k < n - 1; ++k) {
      s = s.add(get(k).multiply(get(n - 2 - k)));
    }
    return s;
  }
}
