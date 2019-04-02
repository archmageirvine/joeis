package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000699;

/**
 * A004300 Number of symmetric irreducible diagrams with 2n nodes.
 * @author Sean A. Irvine
 */
public class A004300 extends MemorySequence {

  {
    add(Z.NEG_ONE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    }
    Z t = Z.ZERO;
    for (int k = 1; k <= n - 2; ++k) {
      t = t.add(get(k).multiply(get(n - k)));
    }
    final A000699 s = new A000699();
    for (int k = 1; k <= n / 2; ++k) {
      t = t.add(get(n - 2 * k).multiply(s.next()).multiply(2L * n - 4L * k - 1));
    }
    return t;
  }
}
