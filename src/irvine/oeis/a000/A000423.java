package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A000423 <code>a(n)</code> is smallest number <code>&gt; a(n-1)</code> of form <code>a(i)a(j), i&lt;j&lt;n</code>.
 * @author Sean A. Irvine
 */
public class A000423 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.TWO;
    } else if (n == 1) {
      return Z.THREE;
    } else {
      final Z prev = get(n - 1);
      Z biggest = prev.square();
      for (int k = 0; k < n; ++k) {
        for (int j = k + 1; j < n; ++j) {
          final Z p = get(k).multiply(get(j));
          if (p.compareTo(prev) > 0 && p.compareTo(biggest) < 0) {
            biggest = p;
          }
        }
      }
      return biggest;
    }
  }
}

