package irvine.oeis.a308;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A308984 If <code>a(n)</code> is not a term of <code>a(0)..a(n-1)</code>, then <code>a(n+1) = |a(n) - a(n-1)|</code>, otherwise <code>a(n+1) = a(n) + n -</code> m, where <code>a(m) = a(n), m &lt</code>; n, and m is maximal. <code>a(0)=0, a(1)=1</code>.
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
