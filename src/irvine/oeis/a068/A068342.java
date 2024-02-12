package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A068342 a(1) = 1; a(n+1) = (product{k|n} a(k)) (sum{j|n} 1/a(j)), where both the product and sum are over the positive divisors of n.
 * @author Sean A. Irvine
 */
public class A068342 extends CachedSequence {

  /** Construct the sequence. */
  public A068342() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      } else {
        Z prod = Z.ONE;
        Q sum = Q.ZERO;
        for (final Z d : Jaguar.factor(n - 1).divisors()) {
          prod = prod.multiply(self.a(d));
          sum = sum.add(new Q(Z.ONE, self.a(d)));
        }
        return sum.multiply(prod).toZ();
      }
    });
  }
}
