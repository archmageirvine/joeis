package irvine.oeis.a049;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049218 Triangle T(n,k) of arctangent numbers: expansion of arctan(x)^n/n!.
 * @author Sean A. Irvine
 */
public class A049218 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = k; i <= n; ++i) {
      sum = sum.add(Binomial.binomial(n - 1, i - 1).multiply(Stirling.firstKind(i, k)).shiftLeft(i).multiply(mF.factorial(n).divide(mF.factorial(i))));
    }
    sum = sum.shiftRight(k);
    if ((((3 * n + k) / 2) & 1) == 1) {
      sum = sum.negate();
    }
    return sum;
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
