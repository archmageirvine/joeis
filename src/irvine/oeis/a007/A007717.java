package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a318.A318951;

/**
 * A007717 Number of symmetric polynomial functions of degree n of a symmetric matrix (of indefinitely large size) under joint row and column permutations. Also number of multigraphs with n edges (allowing loops) on an infinite set of nodes.
 * @author Sean A. Irvine
 */
public class A007717 extends A318951 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : rowSumMats(mN, 2 * mN, 2);
  }
}
