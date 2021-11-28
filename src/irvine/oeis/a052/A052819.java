package irvine.oeis.a052;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052819 E.g.f. equals the series reversion of x + x*log(1-x).
 * @author Sean A. Irvine
 */
public class A052819 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k < mN; f = f.multiply(++k)) {
      sum = sum.signedAdd(((mN + k) & 1) == 1, Stirling.firstKind(mN - 1, k).multiply(Binomial.binomial(mN + k - 1, mN - 1)).multiply(f));
    }
    return sum;
  }
}

