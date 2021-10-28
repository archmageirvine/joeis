package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a138.A138107;

/**
 * A052171 Number of directed multigraphs with loops on an infinite set of nodes containing a total of n arcs.
 * @author Sean A. Irvine
 */
public class A052171 extends A138107 {

  private int mN = -1;

  @Override
  public Z next() {
    return g(2 * ++mN, mN).coeff(mN);
  }
}
