package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A020943 a(2n+1) = |a(2n) - a(2n-1)|, a(2n) = a(n) + a(n-1).
 * @author Sean A. Irvine
 */
public class A020943 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.valueOf(n - 1);
    }
    if ((n & 1) == 0) {
      return a(n / 2).add(a(n / 2 - 1));
    } else {
      return a(n - 1).subtract(a(n - 2)).abs();
    }
  }
}
