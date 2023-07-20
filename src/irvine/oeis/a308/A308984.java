package irvine.oeis.a308;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A308984 If a(n) is not a term of a(0)..a(n-1), then a(n+1) = |a(n) - a(n-1)|, otherwise a(n+1) = a(n) + n - m, where a(m) = a(n), m &lt; n, and m is maximal. a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A308984 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.valueOf(n);
    }
    final Z prev = a(n - 1);
    for (int m = n - 2; m >= 0; --m) {
      if (a(m).equals(prev)) {
        return prev.add(n - 1).subtract(m);
      }
    }
    // prev did not occur any earlier
    return prev.subtract(a(n - 2)).abs();
  }
}
