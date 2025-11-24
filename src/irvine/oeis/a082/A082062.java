package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082062 Greatest common prime-divisor of n and sigma(n)=A000203(n); a(n)=1 if no common prime-divisor exists.
 * @author Sean A. Irvine
 */
public class A082062 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.GPF.z(Functions.GCD.z(++mN, Functions.SIGMA1.z(mN)));
  }
}
