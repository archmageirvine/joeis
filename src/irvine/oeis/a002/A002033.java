package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A002033 Number of perfect partitions of n.
 * @author Sean A. Irvine
 */
public class A002033 extends CachedSequence {

  /** Construct the sequence. */
  public A002033() {
    super(0, Long.class, (self, n) -> {
      if (n <= 2) {
        return Z.ONE;
      } else {
        Z s = Z.ZERO;
        for (final Z d : Jaguar.factor(n + 1).divisors()) {
          final int dd = d.intValue();
          if (dd != n + 1) {
            s = s.add(self.a(dd - 1));
          }
        }
        return s;
      }
    });
  }
}
