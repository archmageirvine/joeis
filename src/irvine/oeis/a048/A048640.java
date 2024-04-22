package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A048640 Binary encoding of the squarefree numbers, A005117.
 * @author Sean A. Irvine
 */
public class A048640 extends A005117 {

  @Override
  public Z next() {
    Z res = Z.ZERO;
    final Z t = super.next();
    if (Z.ONE.equals(t)) {
      return Z.ONE;
    }
    for (final Z p : Jaguar.factor(t).toZArray()) {
      res = res.or(Z.ONE.shiftLeft(Functions.PRIME_PI.l(p)));
    }
    return res;
  }
}

