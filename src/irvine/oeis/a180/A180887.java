package irvine.oeis.a180;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A180887 Array read by antidiagonals: T(n,k)=number of permutations p() of 1..n+k with centered difference p(i+1)-p(i-1) &lt; 0 exactly k-1 times.
 * @author Georg Fischer
 */
public class A180887 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A180887() {
    super(1, 1, -1);
    hasRAM(true);
  }

  private final MemoryFunction2<Integer, Z> mR = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer n, final Integer k) {
      Z sum = Z.ZERO;
      for (int j = 0; j <= k + 1; ++j) {
        sum = sum.add(Binomial.binomial(n + 1, j).multiply(Z.valueOf(k + 1 - j).pow(n)).multiply(((j & 1) == 0) ? 1 : -1));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = 0; i < k; ++i) {
      sum = sum.add(mR.get((n + k) / 2, i).multiply(mR.get((n + k) - (n + k) / 2, k - 1 - i)));
    }
    return sum.multiply(Binomial.binomial(n + k, (n + k) / 2));
  }
}
