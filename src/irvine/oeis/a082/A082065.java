package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082065 Greatest common prime-divisor of phi(n)=A000010(n) and sigma(2,n) = A001157(n); a(n) = 1 if no common prime-divisor exists.
 * @author Sean A. Irvine
 */
public class A082065 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.GPF.z(Functions.GCD.z(Functions.PHI.l(++mN), Functions.SIGMA.z(2, mN)));
  }
}
