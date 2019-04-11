package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001433 Number of graphs with n nodes and <code>n-1</code> edges.
 * @author Sean A. Irvine
 */
public class A001433 extends A001430 {

  @Override
  public Z next() {
    return numberLinearGraphs(++mN, mN - 1);
  }
}
