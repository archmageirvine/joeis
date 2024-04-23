package irvine.oeis.a048;

import irvine.math.function.Functions;
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
    final Z n = Z.valueOf(++mN);
    return Functions.PRIME.z(Functions.PHI.i(n)).add(Functions.PHI.z(Functions.PRIME.l(mN)));
  }
}
