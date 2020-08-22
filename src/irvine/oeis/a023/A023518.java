package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A023518 Greatest exponent in prime-power factorization of prime(n)*prime(n-1) - 1.
 * @author Sean A. Irvine
 */
public class A023518 extends A023515 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next()).maxExponent());
  }
}
