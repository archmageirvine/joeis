package irvine.oeis.a119;
// Generated by gen_seq4.pl 2023-10-16/trilambn at 2023-10-16 19:26

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A119335 Number triangle T(n,k) = Sum_{j=0..n-k} C(k,3j)*C(n-k,3j).
 * @author Georg Fischer
 */
public class A119335 extends LambdaTriangle {

  /** Construct the sequence. */
  public A119335() {
    super(0, 0, 0, (n, k) -> Integers.SINGLETON.sum(0, n - k, j -> Binomial.binomial(k, 3L * j).multiply(Binomial.binomial(n - k, 3L * j))));
  }
}
