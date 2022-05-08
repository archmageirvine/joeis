package irvine.oeis.a226;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.triangle.MemoryUpperLeftTriangle;

/**
 * A226873 Number A(n,k) of n-length words w over a k-ary alphabet {a1,a2,...,ak} such that #(w,a1) &gt;= #(w,a2) &gt;= ... &gt;= #(w,ak) &gt;= 0, where #(w,x) counts the letters x in word w; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * #(w,a1) &gt;= #(w,a2) &gt;= ... &gt;= #(w,ak) &gt;= 0, where #(w,x) counts the letters x in word w;
 * square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A226873 extends MemoryUpperLeftTriangle<Q> {

  /** Construct the sequence. */
  public A226873() {
    super(0, 0, -1);
  }

  /* Maple programs:
    b:= proc(n, i, t) option remember;
      `if`(t=1, 1/n!, add(b(n-j, j, t-1)/j!, j=i..n/t))
    end:
    A:= (n, k)-> `if`(k=0, `if`(n=0, 1, 0), n!*b(n, 0, k)):
    seq(seq(A(n, d-n), n=0..d), d=0..14);
  */
  protected Q calculate(final int n, final int i, final int t) {
    if (t == 1) {
      return new Q(Z.ONE, MemoryFactorial.SINGLETON.factorial(n));
    }
    Q sum = Q.ZERO;
    for (int j = i; j <= n / t; ++j) {
      sum = sum.add(retrieve(n - j, j, t - 1).divide(MemoryFactorial.SINGLETON.factorial(j)));
    }
    return sum;
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    if (k == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    return retrieve(n, 0, k).multiply(MemoryFactorial.SINGLETON.factorial(n)).num();
  }
}
