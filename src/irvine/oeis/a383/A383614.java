package irvine.oeis.a383;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A383489.
 * @author Sean A. Irvine
 */
public class A383614 extends CachedSequence {

  /** Construct the sequence. */
  public A383614() {
    super(1, Integer.class, (self, n) -> {
      Z sum = Z.ZERO;
      final FactorSequence fs = Jaguar.factor(n);
      for (final Z dd : fs.divisors()) {
        final int d = dd.intValue();
        if (d != n) {
          sum = sum.add(self.a(d).pow(n / d).multiply(d));
        }
      }
      return fs.sigma().square().subtract(sum).divide(n);
    });
  }
}

