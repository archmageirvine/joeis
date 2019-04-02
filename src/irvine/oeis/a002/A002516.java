package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A002516 Earliest sequence with a(a(n)) = 2n.
 * @author Sean A. Irvine
 */
public class A002516 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 1) {
      return Z.ZERO;
    }
    final int t = n / 2;
    if ((n & 1) == 0) {
      return get(t).multiply2();
    }
    // Note t == (n-1)/2
    final long v = 2 * t - 5;
    final long u = 6L * t + 1;
    final long w;
    if ((t & 1) == 0) {
      w = u - v;
    } else {
      w = u + v;
    }
    return Z.valueOf(w / 2);
  }
}
