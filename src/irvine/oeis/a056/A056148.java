package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A056148 a(0) = 1, a(n) = number of a(k), for 0 &lt;= k &lt;= n-1, that divide n.
 * @author Sean A. Irvine
 */
public class A056148 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    final Z m = Z.valueOf(n);
    long cnt = 0;
    for (final Z z : this) {
      if (m.mod(z).isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
