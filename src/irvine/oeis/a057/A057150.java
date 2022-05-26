package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057150 Triangle read by rows: T(n,k) = number of k X k binary matrices with n ones, with no zero rows or columns, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A057150 extends A057149 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mM, mN);
  }
}
