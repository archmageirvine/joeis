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
    if (n <= 1) {
      return Z.ONE;
    } else {
      Z s = Z.ZERO;
      for (int k = 1; k < n; ++k) {
        s = s.add(a(k).multiply(a(n - k)));
      }
      return s.multiply(n - 1);
    }
  }
}
