package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005114;

/**
 * A048188 a(n) = phi(n-th untouchable number).
 * @author Sean A. Irvine
 */
public class A048188 extends A005114 {

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}
