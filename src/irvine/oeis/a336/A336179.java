package irvine.oeis.a336;
// Generated by gen_seq4.pl 2023-09-19/triuple at 2023-09-19 18:32

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A336179 Square array T(n,k), n &gt;= 0, k &gt;= 0, read by antidiagonals, where T(n,k) = Sum_{j=0..n} (-k)^j * binomial(n,j)^3.
 * @author Georg Fischer
 */
public class A336179 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A336179() {
    super(0, 0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sum(0, n, j -> Z.valueOf(-k).pow(j).multiply(Binomial.binomial(n, j).pow(3)));
  }
}
