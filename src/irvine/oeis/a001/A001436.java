package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001436 Number of connected graphs with n nodes, n+2 edges.
 * @author Sean A. Irvine
 */
public class A001436 extends A001435 {

  @Override
  public Z next() {
    return numberConnectedGraphs(++mN, mN + 2);
  }
}
