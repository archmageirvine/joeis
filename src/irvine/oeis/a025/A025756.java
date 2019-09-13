package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025756 3rd order Vatalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025756 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 1; m < mN; ++m) {
      Z t = Z.ZERO;
      Z b = Z.THREE;
      for (long k = 1; k <= mN - m; ++k, b = b.multiply(3)) {
        t = t.signedAdd(((mN - m - k) & 1) == 0, b.multiply(Binomial.binomial(k, mN - m - k)).multiply(Binomial.binomial(mN + k - 1, mN - 1)));
      }
      sum = sum.add(t.multiply(m));
    }
    return sum.divide(Math.max(1, mN)).add(1);
  }
}
