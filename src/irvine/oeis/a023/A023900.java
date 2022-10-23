package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023900 Dirichlet inverse of Euler totient function (A000010).
 * @author Sean A. Irvine
 */
public class A023900 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(d.multiply(Mobius.mobius(d.longValue())));
    }
    return sum;
  }
}

