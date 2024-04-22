package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001358;

/**
 * A048623 Binary encoding of semiprimes (A001358).
 * @author Sean A. Irvine
 */
public class A048623 extends A001358 {

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(super.next()).toZArray();
    if (p.length == 1) {
      return Z.ONE.shiftLeft(Functions.PRIME_PI.l(p[0]));
    } else {
      return Z.ONE.shiftLeft(Functions.PRIME_PI.l(p[1]) - 1)
        .or(Z.ONE.shiftLeft(Functions.PRIME_PI.l(p[0]) - 1));
    }
  }
}

