package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A068108 a(1) = 1; a(n+1) = sum{k|n k&lt;=sqrt(n)} a(k) where sum is over the positive divisors k of n with k &lt;= sqrt(n).
 * @author Sean A. Irvine
 */
public class A068108 extends CachedSequence {

  /** Construct the sequence. */
  public A068108() {
    super(1, Integer.class, (self, k) -> {
      if (k == 1) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (final Z d : Jaguar.factor(k - 1).divisors()) {
        final int dd = d.intValue();
        if (dd * dd < k) {
          sum = sum.add(self.a(dd));
        }
      }
      return sum;
    });
  }
}

