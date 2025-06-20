package irvine.oeis.a078;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A078180 a(n) = smallest integer that can't be written as p*a(i)+1, for any prime p and 0&lt;i&lt;n, where a(1)=1 and a(n) &gt; a(n-1).
 * @author Sean A. Irvine
 */
public class A078180 extends CachedSequence {

  /** Construct the sequence. */
  public A078180() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      long v = self.a(n - 1).longValueExact();
      while (true) {
        boolean ok = true;
        for (int k = 1; k < n; ++k) {
          final long ak = self.a(k).longValue();
          if (v % ak == 0 && Predicates.PRIME.is(v / ak)) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return Z.valueOf(v + 1);
        }
        ++v;
      }
    });
  }
}
