package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A005256 Number of weighted voting procedures.
 * @author Sean A. Irvine
 */
public class A005256 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    if (n == 2) {
      return Z.THREE;
    }
    return a(n - 1).multiply2().subtract(a((n - 3) / 2));
  }
}

