package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005257.
 * @author Sean A. Irvine
 */
public class A005257 extends MemorySequence {

  // Using conjectured formulas of Layman

  {
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
      return get(n - 1).multiply(3).subtract(get(n - 2).multiply2());
    } else {
      return get(n - 1).add(get(n - 2).multiply2()).subtract(get((n - 1) / 2 - 1));
    }
  }
}

