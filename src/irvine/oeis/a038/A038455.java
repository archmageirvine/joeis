package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038455 Triangle read by rows: T(n, k) = [x^k] x*Pochhammer(n + x, n)/(n + x).
 * @author Sean A. Irvine
 */
public class A038455 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (int k = mM; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING1.z(k, mM).multiply(Binomial.binomial(2L * mN, mN - k)).multiply(Functions.FACTORIAL.z(mN - 1)).divide(Functions.FACTORIAL.z(k - 1)));
    }
    return sum;
  }
}
