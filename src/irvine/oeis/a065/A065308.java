package irvine.oeis.a065;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A065308 Prime(n - PrimePi(n)).
 * @author Sean A. Irvine
 */
public class A065308 extends A000720 {

  @Override
  public Z next() {
    final Z pi = super.next();
    return Puma.primeZ(mN.subtract(pi));
  }
}
