package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002737.
 * @author Sean A. Irvine
 */
public class A002737 implements Sequence {

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
