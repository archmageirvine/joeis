package irvine.oeis.a350;
// Generated by gen_seq4.pl 2023-09-19/triuple at 2023-09-19 18:32

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A350594 Square array T(n,k), n &gt;= 0, k &gt;= 0, read by antidiagonals, where T(n,k) is Sum_{j=0..2*n} (-1)^(n+j) * binomial(2*n,j)^k.
 * @author Georg Fischer
 */
public class A350594 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A350594() {
    super(0, 0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sum(0, 2 * n, j -> Z.NEG_ONE.pow(n + j).multiply(Binomial.binomial(2L * n, j).pow(k)));
  }
}
