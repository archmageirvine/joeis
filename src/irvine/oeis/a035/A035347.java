package irvine.oeis.a035;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035347 Triangle of a(n,k) = number of minimal covers of an n-set that cover k points of that set uniquely (n &gt;= 1, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A035347 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int j = 0; j <= k; ++j) {
      sum = sum.add(Stirling.secondKind(k, j).multiply(Z.ONE.shiftLeft(j).subtract(j + 1).pow(n - k)));
    }
    return sum.multiply(Binomial.binomial(n, k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}

