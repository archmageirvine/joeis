package irvine.oeis.a025;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025229 a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-1)*a(1) for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A025229 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.CATALAN.z(k).multiply(Binomial.binomial(k + 1, mN - k)).shiftLeft(mN - k));
    }
    return sum;
  }
}
