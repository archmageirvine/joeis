package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001432 Number of graphs with n nodes and n-4 edges.
 * @author Sean A. Irvine
 */
public class A001432 extends A001430 {

  @Override
  public Z next() {
    return numberLinearGraphs(++mN, mN - 4);
  }
}
