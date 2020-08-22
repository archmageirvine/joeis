package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023591 Greatest exponent in prime-power factorization of 2*prime(n)+1.
 * @author Sean A. Irvine
 */
public class A023591 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next().multiply2().add(1)).maxExponent());
  }
}
