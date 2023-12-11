package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000699;
import irvine.oeis.memory.MemorySequence;

/**
 * A004300 Number of symmetric irreducible diagrams with 2n nodes.
 * @author Sean A. Irvine
 */
public class A004300 extends MemorySequence {

  {
    setOffset(1);
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
      t = t.add(a(k).multiply(a(n - k)));
    }
    final Sequence s = new A000699().skip(1);
    for (int k = 1; k <= n / 2; ++k) {
      t = t.add(a(n - 2 * k).multiply(s.next()).multiply(2L * n - 4L * k - 1));
    }
    return t;
  }
}
