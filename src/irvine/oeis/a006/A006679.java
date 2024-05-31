package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006679 Number of planted binary phylogenetic trees with n labels.
 * @author Sean A. Irvine
 */
public class A006679 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int j = 0; j <= mN; ++j) {
      Z s = Z.ZERO;
      for (int k = 1; k <= j; ++k) {
        final Z zk = Z.valueOf(k);
        Z t = Z.ZERO;
        for (int i = 0; i <= j; ++i) {
          t = t.add(Functions.STIRLING2.z(i, k).multiply(zk.pow(j - i)).multiply(Binomial.binomial(j, i)));
        }
        s = s.add(t.multiply(Functions.FACTORIAL.z(2 * k - 2)).divide(Functions.FACTORIAL.z(k - 1)).shiftLeft(1 - k));
      }
      sum = sum.signedAdd(((mN - j) & 1) == 0, s.multiply(Binomial.binomial(mN, j)));
    }
    return sum;
  }
}
