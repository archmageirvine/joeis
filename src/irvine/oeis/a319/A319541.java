package irvine.oeis.a319;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A319541 Triangle read by rows: T(n,k) is the number of binary rooted trees with n leaves of exactly k colors and all non-leaf nodes having out-degree 2.
 * and all non-leaf nodes having out-degree 2.
 * @author Georg Fischer
 */
public class A319541 extends Triangle {

  /** Construct the sequence. */
  public A319541() {
    super(1);
    setOffset(1);
    hasRAM(true);
  }

  /* Maple:
    A:= proc(n, k) option remember; `if`(n<2, k*n, `if`(n::odd, 0,
          (t-> t*(1-t)/2)(A(n/2, k)))+add(A(i, k)*A(n-i, k), i=1..n/2))
        end:
    T:= (n, k)-> add((-1)^i*binomial(k, i)*A(n, k-i), i=0..k):
    seq(seq(T(n, k), k=1..n), n=1..12);  # _Alois P. Heinz_, Sep 23 2018
  */
  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    Z sum = Z.ZERO;
    for (int i = 0; i <= k; ++i) {
      final Z term = Binomial.binomial(k, i).multiply(A319539.A.get(n, k - i));
      sum = sum.add(((i & 1) == 0) ? term : term.negate());
    }
    return sum;
  }
}
