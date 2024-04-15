package irvine.oeis.a152;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A152235 Largest squarefree number dividing the number of divisors n.
 * @author Sean A. Irvine
 */
public class A152235 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z p = Z.ONE;
    for (final Z z : Jaguar.factor(Functions.SIGMA0.z(++mN)).toZArray()) {
      p = p.multiply(z);
    }
    return p;
  }
}

