package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052526 Number of labeled rooted trees with n leaves in which the degrees of the root and all internal nodes are &gt;= 3.
 * @author Sean A. Irvine
 */
public class A052526 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j <= k; ++j) {
        Z t = Z.ZERO;
        for (int l = 0; l <= j; ++l) {
          for (int i = 0; i <= l; ++i) {
            t = t.signedAdd((l & 1) == 0, Functions.FACTORIAL.z(mN + k - 1).multiply(Functions.STIRLING2.z(mN + j - i - l - 1, j - l)).shiftLeft(l - 2L * i).divide(Functions.FACTORIAL.z(mN + j - i - l - 1)).divide(Functions.FACTORIAL.z(i)).divide(Functions.FACTORIAL.z(l - i)));
          }
        }
        sum = sum.add(t.divide(Functions.FACTORIAL.z(k - j)));
      }
    }
    return sum;
  }
}
