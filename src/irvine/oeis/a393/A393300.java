package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A393300 a(1) = 0; for n &gt; 1, a(n) is the smallest unused number k such that k! contains a(1), a(2), ..., a(n-1) as substrings.
 * @author Sean A. Irvine
 */
public class A393300 extends CachedSequence {

  /** Construct the sequence. */
  public A393300() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ZERO;
      }
      long k = self.a(n - 1).longValueExact();
      while (true) {
        final String s = Functions.FACTORIAL.z(++k).toString();
        boolean ok = true;
        for (int j = n - 1; j > 0; --j) {
          if (!s.contains(self.a(j).toString())) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return Z.valueOf(k);
        }
      }
    });
  }
}
