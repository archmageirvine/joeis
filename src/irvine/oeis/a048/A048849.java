package irvine.oeis.a048;

import irvine.factor.prime.Puma;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048849 a(n) = prime(phi(n)) + phi(prime(n)).
 * @author Sean A. Irvine
 */
public class A048849 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    return Puma.primeZ(Euler.phi(Z.valueOf(++mN)).intValueExact()).add(Euler.phi(Puma.prime(mN)));
  }
}
