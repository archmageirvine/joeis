package irvine.oeis.a120;
// Generated by gen_seq4.pl 2024-03-08/trilamb0 at 2024-03-10 23:05

import irvine.math.z.Binomial;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A120986 Triangle read by rows: T(n,k) is the number of ternary trees with n edges and having k middle edges (n &gt;= 0, k &gt;= 0).
 * @author Georg Fischer
 */
public class A120986 extends LambdaTriangle {

  /** Construct the sequence. */
  public A120986() {
    super(0, 0, 0, (n, k) -> Binomial.binomial(n + 1, k).multiply(Binomial.binomial(2L * (n + 1), n - k)).divide(n + 1));
  }
}
