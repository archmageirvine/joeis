package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070820 Difference between n-th prime and the value of commutator[phi,gpf] = commutator[A000010, A006530] at the same prime argument.
 * @author Sean A. Irvine
 */
public class A070820 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.subtract(Functions.PHI.z(Functions.GPF.z(p)).subtract(Functions.GPF.z(Functions.PHI.z(p))));
  }
}
