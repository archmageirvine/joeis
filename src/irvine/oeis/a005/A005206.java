package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005206.
 * @author Sean A. Irvine
 */
public class A005206 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    return Z.valueOf(n).subtract(get(get(n - 1).intValueExact()));
  }
}

