package irvine.oeis.a328;
// Generated by gen_seq4.pl 2023-09-19/triuple at 2023-09-19 18:32

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A328747 Square array T(n,k), n &gt;= 0, k &gt;= 0, read by antidiagonals, where T(n,k) is Sum_{i=0..n} (-1)^(n-i)*binomial(n,i)*Sum_{j=0..i} binomial(i,j)^k.
 * @author Georg Fischer
 */
public class A328747 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A328747() {
    super(0, 0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sum(0, n, i -> Z.NEG_ONE.pow(n - i).multiply(Binomial.binomial(n, i)).multiply(Integers.SINGLETON.sum(0, i, j -> Binomial.binomial(i, j).pow(k))));
  }
}
