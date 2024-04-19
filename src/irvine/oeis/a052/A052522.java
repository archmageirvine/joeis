package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052522 Number of labeled mobiles with cycles of length at least 3.
 * @author Sean A. Irvine
 */
public class A052522 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j <= k; ++j) {
        Z t = Z.ZERO;
        for (int l = 0; l <= j; ++l) {
          Z u = Z.ZERO;
          for (int i = 0; i <= l; ++i) {
            u = u.signedAdd(((i + mN + l - 1) & 1) == 0, Functions.FACTORIAL.z(mN + k - 1).multiply(Binomial.binomial(l, i)).multiply(Stirling.firstKind(mN + j - i - l - 1, j - l)).shiftLeft(l - 2L * i).divide(Functions.FACTORIAL.z(mN + j - i - l - 1)));
          }
          t = t.add(u.divide(Functions.FACTORIAL.z(l)));
        }
        sum = sum.add(t.divide(Functions.FACTORIAL.z(k - j)));
      }
    }
    return sum;
  }
}
