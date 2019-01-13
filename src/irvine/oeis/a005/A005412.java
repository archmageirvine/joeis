package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005412.
 * @author Sean A. Irvine
 */
public class A005412 extends MemorySequence {

  // After Michael Somos

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int j = 1; j < n; ++j) {
      s = s.add(get(j).multiply(get(n - j)));
    }
    return s.add(get(n - 1).multiply(2 * n - 2));
  }
}
