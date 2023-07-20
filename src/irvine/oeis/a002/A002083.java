package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A002083 Narayana-Zidek-Capell numbers: a(n) = 1 for n &lt;= 2. Otherwise a(2n) = 2a(2n-1), a(2n+1) = 2a(2n) - a(n).
 * @author Sean A. Irvine
 */
public class A002083 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return Z.ONE;
    } else if ((n & 1) == 0) {
      return a(n - 1).multiply2();
    } else {
      return a(n - 1).multiply2().subtract(a(n / 2));
    }
  }
}
