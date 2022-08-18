package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.a342.A342053;

/**
 * A341923 Array read by antidiagonals: T(n,k) is the number of 3-connected triangulations of a disk up to orientation-preserving isomorphisms with n interior nodes and k nodes on the boundary, n &gt;= 1, k &gt;= 3.
 * @author Sean A. Irvine
 */
public class A341923 extends A342053 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return a341923(mM, mN - mM);
  }
}
