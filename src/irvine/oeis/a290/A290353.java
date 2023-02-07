package irvine.oeis.a290;

import irvine.math.MemoryFunctionInt2;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A290353 Square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals, where column k is the k-th Euler transform of the sequence with g.f. 1+x.
 * @author Georg Fischer
 */
public class A290353 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A290353() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    with(numtheory):
    A:= proc(n, k) option remember; `if`(n<2, 1, `if`(k=0, 0, add(
          add(A(d, k-1)*d, d=divisors(j))*A(n-j, k), j=1..n)/n))
        end:
    seq(seq(A(n, d-n), n=0..d), d=0..14);
  */
  private final MemoryFunctionInt2<Q> mA = new MemoryFunctionInt2<Q>() {
    @Override
    protected Q compute(final int n, final int k) {
      if (n < 2) {
        return Q.ONE;
      }
      if (k == 0) {
        return Q.ZERO;
      }
      Q sum = Q.ZERO;
      for (int j = 1; j <= n; ++j) {
        sum = sum.add(Rationals.SINGLETON.sumdiv(j, d -> get(d, k - 1).multiply(d)).multiply(get(n - j, k)));
      }
      return sum.divide(n);
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mA.get(n, k).num();
  }
}
