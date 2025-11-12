package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A389367 Semilengths of the Dyck natural numbers.
 * @author Sean A. Irvine
 */
public class A389367 extends CachedSequence {

  /** Construct the sequence. */
  public A389367() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      if (n == 1) {
        return Z.ONE;
      }
      Z s = Z.ZERO;
      for (long p = 2; p <= Functions.GPF.l(n); p = Functions.NEXT_PRIME.l(p)) {
        final int v = Functions.VALUATION.i(n, p);
        s = s.add(self.a(v)).add(1);
      }
      return s;
    });
  }
}
