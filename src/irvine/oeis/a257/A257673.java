package irvine.oeis.a257;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A257673 Triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows: row n is the inverse binomial transform of the n-th row of array A255961, which has the Euler transform of (j-&gt;j*k) in column k.
 * @author Georg Fischer
 */
public class A257673 extends BaseTriangle {

  /** Construct the sequence. */
  public A257673() {
    super(0, 0, 0);
    hasRAM(true);
  }

  /* Maple:
    A:= proc(n, k) option remember; `if`(n=0, 1, k*add(
          A(n-j, k)*numtheory[sigma][2](j), j=1..n)/n)
        end:
    T:= (n, k)-> add(A(n, k-i)*(-1)^i*binomial(k, i), i=0..k):
    seq(seq(T(n, k), k=0..n), n=0..12);
  */
  private final MemoryFunctionInt2<Z> mA = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= n; ++j) {
        sum = sum.add(get(n - j, k).multiply(Jaguar.factor(j).sigma2()));
      }
      return sum.multiply(k).divide(n);
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = 0; i <= k; ++i) {
      sum = sum.add(mA.get(n, k - i).multiply(((i & 1) == 1) ? -1 : 1).multiply(Binomial.binomial(k, i)));
    }
    return sum;
  }
}
