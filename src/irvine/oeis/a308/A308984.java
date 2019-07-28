package irvine.oeis.a308;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A308984 allocated for Marc Morgenegg.
 * @author Sean A. Irvine
 */
public class A308984 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.valueOf(n);
    }
    final Z prev = get(n - 1);
    for (int m = n - 2; m >= 0; --m) {
      if (get(m).equals(prev)) {
        return prev.add(n - 1).subtract(m);
      }
    }
    // prev did not occur any earlier
    return prev.subtract(get(n - 2)).abs();
  }
}
