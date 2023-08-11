package irvine.oeis.a346;

import irvine.math.MemoryFunction2;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A346520 Number A(n,k) of partitions of the (n+k)-multiset {0,...,0,1,2,...,k} with n 0's into distinct multisets; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A346520 extends UpperLeftTriangle {

  private MemorySequence mA000009;

  /** Construct the sequence. */
  public A346520() {
    super(0, 0, -1);
    hasRAM(true);
    mA000009 = MemorySequence.cachedSequence(new A000009());
  }

  /* Maple:
    g:= proc(n) option remember; `if`(n=0, 1, add(g(n-j)*add(
         `if`(d::odd, d, 0), d=numtheory[divisors](j)), j=1..n)/n)
        end: # A000009
    s:= proc(n) option remember; expand(`if`(n=0, 1,
          x*add(s(n-j)*binomial(n-1, j-1), j=1..n)))
        end:
    S:= proc(n, k) option remember; coeff(s(n), x, k) end: # Stirling2
    b:= proc(n, i) option remember; `if`(n=0, 1,
         `if`(i=0, g(n), add(b(n-j, i-1), j=0..n)))
        end:
    A:= (n, k)-> add(S(k, j)*b(n, j), j=0..k):
    seq(seq(A(n, d-n), n=0..d), d=0..12);
  */
  private final MemoryFunction2<Integer, Z> mB = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer n, final Integer i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i == 0) {
        return mA000009.a(n);
      }
      Z sum = Z.ZERO;
      for (int j = 0; j <= n; ++j) {
        sum = sum.add(get(n - j, i - 1));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int j = 0; j <= k; ++j) {
      sum = sum.add(Stirling.secondKind(k, j).multiply(mB.get(n, j)));
    }
    return sum;
  }
}
