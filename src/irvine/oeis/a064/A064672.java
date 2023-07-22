package irvine.oeis.a064;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A064672 a(0) = 0, a(1) = 1; for a(n), n &gt;= 2, write n = x^2 + y with y &gt;= 0 as small as possible, then a(n) = a(x) + a(y).
 * @author Sean A. Irvine
 */
public class A064672 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.valueOf(n);
    }
    final int s = IntegerUtils.sqrt(n);
    return a(s).add(a(n - s * s));
  }
}
