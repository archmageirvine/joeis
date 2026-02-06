package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A083561 a(1) = 1 and for n&gt;1: a(n) = n + Max{a(k): k&lt;n, gcd(n,a(k))=1}.
 * @author Sean A. Irvine
 */
public class A083561 extends CachedSequence {

  /** Construct the sequence. */
  public A083561() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      Z max = Z.ONE;
      for (int k = n - 1; k > 0; --k) {
        if (Functions.GCD.z(self.a(k), n).isOne()) {
          max = max.max(self.a(k));
        }
      }
      return max.add(n);
    });
  }
}
