package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A056149 a(0) = 1, a(m) = number of a(k), 0 &lt;= k &lt;= m-1, where gcd(m, a(k)) = 1.
 * @author Sean A. Irvine
 */
public class A056149 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    final Z m = Z.valueOf(n);
    long cnt = 0;
    for (final Z z : this) {
      if (Z.ONE.equals(m.gcd(z))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
