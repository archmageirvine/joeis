package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070819 Values of commutator[phi,gpf] = commutator[A000010, A006530] at prime arguments; a(1)=0 by convention.
 * @author Sean A. Irvine
 */
public class A070819 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Functions.PHI.z(Functions.GPF.z(p)).subtract(Functions.GPF.z(Functions.PHI.z(p)));
  }
}
