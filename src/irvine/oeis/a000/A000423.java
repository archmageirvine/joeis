package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A000423 a(n) is smallest number &gt; a(n-1) of form a(i)*a(j), i &lt; j &lt; n.
 * @author Sean A. Irvine
 */
public class A000423 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.TWO;
    } else if (n == 1) {
      return Z.THREE;
    } else {
      final Z prev = a(n - 1);
      Z biggest = prev.square();
      for (int k = 0; k < n; ++k) {
        for (int j = k + 1; j < n; ++j) {
          final Z p = a(k).multiply(a(j));
          if (p.compareTo(prev) > 0 && p.compareTo(biggest) < 0) {
            biggest = p;
          }
        }
      }
      return biggest;
    }
  }
}

