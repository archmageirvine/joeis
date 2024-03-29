package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A020944 a(2n+1) = |a(2n) - a(2n-1)|, a(2n) = a(n) + a(n-1), a(0) = -1.
 * @author Sean A. Irvine
 */
public class A020944 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return n == 0 ? Z.NEG_ONE : Z.ONE;
    }
    if ((n & 1) == 0) {
      return a(n / 2).add(a(n / 2 - 1));
    } else {
      return a(n - 1).subtract(a(n - 2)).abs();
    }
  }
}
