package irvine.oeis.a356;
// Generated by gen_seq4.pl 2023-09-19/triuple at 2023-09-19 18:32

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A356124 Square array T(n,k), n &gt;= 1, k &gt;= 0, read by antidiagonals downwards, where T(n,k) = Sum_{j=1..n} j^k * binomial(floor(n/j)+1,2).
 * @author Georg Fischer
 */
public class A356124 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A356124() {
    super(1, 1, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sum(1, n, j -> Z.valueOf(j).pow(k).multiply(Binomial.binomial(n / j + 1, 2)));
  }
}
