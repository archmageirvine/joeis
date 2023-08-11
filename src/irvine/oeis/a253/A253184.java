package irvine.oeis.a253;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A253184 Triangle T(n,m) = Sum_{k=1..(n-m)/2} C(m, k)*T((n-m)/2, k), T(n,n)=1.
 * A253190 Triangle T(n, m)=Sum_{k=1..(n-m)/2} C(m+k-1, k)*T((n-m)/2, k)), T(n,n)=1.
 * @author Georg Fischer
 */
public class A253184 extends Triangle {

  /** Construct the sequence. */
  public A253184() {
    setOffset(1);
    hasRAM(true);
  }

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == m) {
        return Z.ONE;
      }
      if (((n - m) & 1) == 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int kmax = (n - m) / 2;
      for (int k = 1; k <= kmax; ++k) {
        sum = sum.add(Binomial.binomial(m, k).multiply(get(kmax, k)));
      }
      return sum;
    }
  };

  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return mB.get(n, k);
  }
}
