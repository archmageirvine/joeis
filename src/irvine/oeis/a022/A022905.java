package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022905 a(n) = M(n) + m(n) for n &gt;= 2, where M(n) = max{ a(i) + a(n-i): i = 1..n-1 }, m(n) = min{ a(i) + a(n-i): i = 1..n-1 }.
 * @author Sean A. Irvine
 */
public class A022905 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    return get(n - 1).add(1).add(get((n - 1) / 2)).add(get(n / 2));
  }
}
