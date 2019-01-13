package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A014011.
 * @author Sean A. Irvine
 */
public class A014011 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z res = Z.ZERO;
    final Z zn = Z.valueOf(n + 1);
    for (int k = 0; k < n; ++k) {
      res = res.max(zn.subtract(get(k)).multiply(k + 2));
    }
    return res;
  }
}

