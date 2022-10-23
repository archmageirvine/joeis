package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002737 a(n) = Sum_{j=0..n} (n+j)*binomial(n+j,j).
 * @author Sean A. Irvine
 */
public class A002737 extends Sequence0 {

  // Using conjectured formula of Zerinvary Lajos

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long j = 0; j <= mN; ++j) {
      sum = sum.add(Binomial.binomial(mN + j, j).multiply(mN + j));
    }
    return sum;
  }
}
