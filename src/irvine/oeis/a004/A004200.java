package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A004200 Continued fraction for Sum_{k&gt;=0} 1/3^(2^k).
 * @author Sean A. Irvine
 */
public class A004200 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      if (n == 0) {
        return Z.ZERO;
      } else if (n == 1) {
        return Z.TWO;
      } else {
        return Z.FIVE;
      }
    }
    final int q = n & 7;
    final int r = n & 15;
    final int s = n & 31;
    if (r == 5 || r == 12 || s == 9 || s == 24) {
      return Z.ONE;
    } else if (q == 3 || q == 6 || r == 4 || r == 13 || s == 8 || s == 25) {
      return Z.THREE;
    } else if (r == 0 || r == 1) {
      return a((n + 1) / 2);
    } else {
      return Z.FIVE;
    }
  }
}
