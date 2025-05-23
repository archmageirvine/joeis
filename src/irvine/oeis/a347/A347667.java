package irvine.oeis.a347;
// Generated by gen_seq4.pl 2025-04-09.ack/trilambn at 2025-04-09 21:37

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A347667 Triangle read by rows: T(n,k) = Sum_{j=0..k} binomial(n,j) * j! (0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A347667 extends LambdaTriangle {

  /** Construct the sequence. */
  public A347667() {
    super(0, 0, 0, (n, k) -> Integers.SINGLETON.sum(0, k, j -> Binomial.binomial(n, j).multiply(Functions.FACTORIAL.z(j))));
  }
}
