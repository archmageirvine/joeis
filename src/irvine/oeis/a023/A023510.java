package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023510 Greatest exponent in prime-power factorization of <code>prime(n) + 1</code>.
 * @author Sean A. Irvine
 */
public class A023510 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next().add(1)).maxExponent());
  }
}
