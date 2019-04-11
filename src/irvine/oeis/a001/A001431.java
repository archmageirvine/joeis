package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001431 Number of graphs with n nodes and <code>n-3</code> edges.
 * @author Sean A. Irvine
 */
public class A001431 extends A001430 {

  @Override
  public Z next() {
    return numberLinearGraphs(++mN, mN - 3);
  }
}
