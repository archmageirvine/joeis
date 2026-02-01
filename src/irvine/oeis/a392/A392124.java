package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a008.A008303;

/**
 * A008303 Triangle read by rows: T(n,k) (n &gt;= 1, 0 &lt;= k &lt;= ceiling(n/2)-1) = number of permutations of [n] with k peaks.
 * @author Sean A. Irvine
 */
public class A392124 extends A008303 {

  private int mN = 0;
  private int mM = 1;

  @Override
  public Z next() {
    if (--mM < 0) {
      ++mN;
      mM = (mN + 1) / 2 - 1;
    }
    return get(mN, 0, 1).coeff(mM);
  }
}
