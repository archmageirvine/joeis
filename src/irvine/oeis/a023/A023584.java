package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023584 Greatest exponent in prime-power factorization of 2*p(n)-1.
 * @author Sean A. Irvine
 */
public class A023584 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next().multiply2().subtract(1)).maxExponent());
  }
}
