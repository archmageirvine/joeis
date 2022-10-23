package irvine.oeis.a052;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052526 Number of labeled rooted trees with n leaves in which the degrees of the root and all internal nodes are &gt;= 3.
 * @author Sean A. Irvine
 */
public class A052526 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
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
            t = t.signedAdd((l & 1) == 0, mF.factorial(mN + k - 1).multiply(Stirling.secondKind(mN + j - i - l - 1, j - l)).shiftLeft(l - 2 * i).divide(mF.factorial(mN + j - i - l - 1)).divide(mF.factorial(i)).divide(mF.factorial(l - i)));
          }
        }
        sum = sum.add(t.divide(mF.factorial(k - j)));
      }
    }
    return sum;
  }
}
