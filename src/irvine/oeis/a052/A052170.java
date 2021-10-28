package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a333.A333361;

/**
 * A052170 Number of directed loopless multigraphs with n arcs.
 * @author Sean A. Irvine
 */
public class A052170 extends A333361 {

  private int mN = -1;

  @Override
  public Z next() {
    return g(2 * ++mN, mN).coeff(mN);
  }
}
