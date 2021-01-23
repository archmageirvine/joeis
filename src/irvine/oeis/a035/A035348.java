package irvine.oeis.a035;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035348 Triangle of a(n,k) = number of k-member minimal covers of an n-set (n &gt;= k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A035348 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int k) {
    Z sum = Z.ZERO;
    final Z top = Z.ONE.shiftLeft(k).subtract(k + 1);
    final int lim = Z.valueOf(n).min(Z.ONE.shiftLeft(k).subtract(1)).intValueExact();
    for (int m = k; m <= lim; ++m) {
      sum = sum.add(Stirling.secondKind(n, m).multiply(mF.factorial(m)).multiply(Binomial.binomial(top, Z.valueOf(m - k))));
    }
    return sum.divide(mF.factorial(k));
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

