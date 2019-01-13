package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A003314.
 * @author Sean A. Irvine
 */
public class A003314 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    return get((n + 1) / 2 - 1).add(get(n - (n + 1) / 2)).add(n + 1);
  }
}
