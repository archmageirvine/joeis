package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A000423 a(n) is smallest number &gt; a(n-1) of form a(i)*a(j), i &lt; j &lt; n.
 * @author Sean A. Irvine
 */
public class A000423 extends CachedSequence {

  /** Construct the sequence. */
  public A000423() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.TWO;
      } else if (n == 2) {
        return Z.THREE;
      } else {
        final Z prev = self.a(n - 1);
        Z biggest = prev.square();
        for (int k = 1; k < n; ++k) {
          for (int j = k + 1; j < n; ++j) {
            final Z p = self.a(k).multiply(self.a(j));
            if (p.compareTo(prev) > 0 && p.compareTo(biggest) < 0) {
              biggest = p;
            }
          }
        }
        return biggest;
      }
    });
  }
}

