package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007989 Slowest increasing sequence with property that <code>a(n)</code> does not divide <code>any</code> term of form a(n+m*a(n)) for <code>any</code> m; this is the slowest increasing "non-difference-divisible" sequence.
 * @author Sean A. Irvine
 */
public class A007989 extends MemorySequence {

  private boolean isAcceptable(final int n, final Z m) {
    // We are trying to find a(n), m is the current candidate
    for (int k = 0; k < n; ++k) {
      final Z ak = get(k);
      if (Z.ZERO.equals(Z.valueOf(n - k).mod(ak)) && Z.ZERO.equals(m.mod(ak))) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.TWO;
    }
    final int n = size();
    Z m = get(n - 1);
    while (true) {
      m = m.add(1);
      if (isAcceptable(n, m)) {
        return m;
      }
    }
  }
}

