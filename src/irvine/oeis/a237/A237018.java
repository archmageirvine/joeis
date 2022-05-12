package irvine.oeis.a237;

import irvine.math.MemoryFunction2;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A237018 Number A(n,k) of partitions of the k-dimensional hypercube resulting from a sequence of n bisections, each of which splits any part perpendicular to any of the axes; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A237018 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A237018() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, k, t) option remember; `if`(t=0, 1, `if`(t=1,
           A(n-1, k), add(A(j, k)*b(n-j-1, k, t-1), j=0..n-2)))
        end:
    A:= proc(n, k) option remember; `if`(n=0, 1,
          -add(binomial(k, j)*(-1)^j*b(n+1, k, 2^j), j=1..k))
        end:
    seq(seq(A(n, d-n), n=0..d), d=0..10);
  */
  public final class ProcA extends MemoryFunction2<Integer, Z> {
    @Override
    protected Z compute(final Integer n, final Integer k) {
      final class ProcB extends MemoryFunctionInt3<Z> {
        @Override
        protected Z compute(final int n, final int k, final int t) {
          if (t == 0) {
            return Z.ONE;
          }
          if (t == 1) {
            return mProcA.get(n - 1, k);
          }
          Z sum = Z.ZERO;
          final int jmax = n - 2;
          for (int j = 0; j <= jmax; ++j) {
            sum = sum.add(mProcA.get(j, k).multiply(get(n - j - 1, k, t - 1)));
          }
          return sum;
        }
      }
      final ProcB mProcB = new ProcB();

      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= k; ++j) {
        sum = sum.subtract(Binomial.binomial(k, j).multiply(((j & 1) == 0) ? 1 : -1).multiply(mProcB.get(n + 1, k, 1 << j)));
      }
      return sum;
    }
  }

  public final ProcA mProcA = new ProcA();

  @Override
  public Z matrixElement(final int n, final int k) {
    return mProcA.get(n, k);
  }
}
