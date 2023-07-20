package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A005257 Number of weighted voting procedures.
 * @author Sean A. Irvine
 */
public class A005257 extends MemorySequence {

  // Using conjectured formulas of Layman

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.TWO;
    }
    if (n == 2) {
      return Z.THREE;
    }
    if (n == 3) {
      return Z.FIVE;
    }
    if ((n & 1) == 0) {
      return a(n - 1).multiply(3).subtract(a(n - 2).multiply2());
    } else {
      return a(n - 1).add(a(n - 2).multiply2()).subtract(a((n - 1) / 2 - 1));
    }
  }
}

