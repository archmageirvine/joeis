package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007989 Slowest increasing sequence with property that a(n) does not divide any term of form a(n+m*a(n)) for any m; this is the slowest increasing "non-difference-divisible" sequence.
 * @author Sean A. Irvine
 */
public class A007989 extends MemorySequence {

  private boolean isAcceptable(final int n, final Z m) {
    // We are trying to find a(n), m is the current candidate
    for (int k = 0; k < n; ++k) {
      final Z ak = get(k);
      if (Z.valueOf(n - k).mod(ak).isZero() && m.mod(ak).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
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

