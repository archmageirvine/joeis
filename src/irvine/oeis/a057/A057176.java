package irvine.oeis.a057;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A057176 a(0) = 1; for n &gt;= 1, a(n) = Sum_{j=0..a(n-1) mod n} a(j).
 * @author Sean A. Irvine
 */
public class A057176 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, (int) a(n - 1).mod(n), k -> a(k));
  }
}

