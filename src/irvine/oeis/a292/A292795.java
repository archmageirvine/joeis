package irvine.oeis.a292;

import irvine.math.MemoryFunctionInt2;
import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A292795 Number A(n,k) of sets of nonempty words with a total of n letters over k-ary alphabet such that within each word every letter of the alphabet is at least as frequent as the subsequent alphabet letter; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A292795 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A292795() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, t) option remember; `if`(t=1, 1/n!,
          add(b(n-j, j, t-1)/j!, j=i..n/t))
        end:
    g:= (n, k)-> `if`(k=0, `if`(n=0, 1, 0), n!*b(n, 0, k)):
    h:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0,
          add(h(n-i*j, i-1, k)*binomial(g(i, k), j), j=0..n/i)))
        end:
    A:= (n, k)-> h(n$2, min(n, k)):
    seq(seq(A(n, d-n), n=0..d), d=0..14);
  */
  private final MemoryFunctionInt3<Q> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Q compute(final int n, final int i, final int t) {
      if (t == 1) {
        return new Q(Z.ONE, Functions.FACTORIAL.z(n));
      }
      Q sum = Q.ZERO;
      final int jmax = n / t;
      for (int j = i; j <= jmax; ++j) {
        sum = sum.add(get(n - j, j, t - 1).divide(Functions.FACTORIAL.z(j)));
      }
      return sum;
    }
  };

  private final MemoryFunctionInt2<Z> mG = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k == 0) {
        return n == 0 ? Z.ONE : Z.ZERO;
      }
      return mB.get(n, 0, k).multiply(Functions.FACTORIAL.z(n)).num();
    }
  };

  private final MemoryFunctionInt3<Z> mH = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int jmax = n / i;
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(get(n - i * j, i - 1, k).multiply(Binomial.binomial(mG.get(i, k), Z.valueOf(j))));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mH.get(n, n, n < k ? n : k);
  }
}
