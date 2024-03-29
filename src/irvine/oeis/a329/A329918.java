package irvine.oeis.a329;
// Generated by gen_seq4.pl tricut2

import irvine.oeis.a000.A000007;
import irvine.oeis.a136.A136688;
import irvine.oeis.triangle.PrependColumn;

/**
 * A329918 Coefficients of orthogonal polynomials related to the Jacobsthal numbers A152046, triangle read by rows, T(n, k) for 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A329918 extends PrependColumn {

  /** Construct the sequence. */
  public A329918() {
    super(0, new A136688(), new A000007());
  }
}

