package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A000699 Number of irreducible chord diagrams with 2n nodes.
 * @author Sean A. Irvine
 */
public class A000699 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    } else {
      Z s = Z.ZERO;
      for (int k = 0; k < n; ++k) {
        s = s.add(get(k).multiply(get(n - 1 - k)));
      }
      return s.multiply(n);
    }
  }
}
