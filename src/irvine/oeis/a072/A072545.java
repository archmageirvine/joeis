package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A072545 a(0) = 1, a(n) for n &gt; 0 is the smallest number &gt; a(n-1) such that a(n)-a(k) is nonprime for 0 &lt;= k &lt; n.
 * @author Sean A. Irvine
 */
public class A072545 extends CachedSequence {

  /** Construct the sequence. */
  public A072545() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      Z t = self.a(n - 1);
      outer:
      while (true) {
        t = t.add(1);
        for (int k = 0; k < n; ++k) {
          if (t.subtract(self.a(k)).isProbablePrime()) {
            continue outer;
          }
        }
        return t;
      }
    });
  }
}
