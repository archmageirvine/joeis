package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a143.A143324;

/**
 * A074650 Table T(n,k) read by downward antidiagonals: number of Lyndon words (aperiodic necklaces) with n beads of k colors, n &gt;= 1, k &gt;= 1.
 * @author Georg Fischer
 */
public class A074650 extends A143324 {

  @Override
  public Z matrixElement(final int n, final int k) {
    return super.matrixElement(n, k).divide(n);
  }
}
