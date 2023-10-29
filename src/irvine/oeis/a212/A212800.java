package irvine.oeis.a212;

import irvine.math.z.Z;

/**
 * A212800 Number of spanning trees of the (n,n)-torus grid graph.
 * @author Sean A. Irvine
 */
public class A212800 extends A212796 {

  private long mN = 0;

  @Override
  public Z next() {
    return numberOfSpanningTrees(++mN, mN);
  }
}
