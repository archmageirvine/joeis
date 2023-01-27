package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061200 tau_5(n) = number of ordered 5-factorizations of n.
 * @author Sean A. Irvine
 */
public class A061200 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      for (final Z e : Jaguar.factor(d).divisors()) {
        for (final Z f : Jaguar.factor(e).divisors()) {
          sum = sum.add(Jaguar.factor(f).sigma0());
        }
      }
    }
    return sum;
  }
}
