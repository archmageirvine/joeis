package irvine.oeis.a282;
// manually at 2024-03-28

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A282011 Number T(n,k) of k-element subsets of [n] having an even sum; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A282011 extends LambdaTriangle {

  /** Construct the sequence. */
  public A282011() {
    super(0, (n, k) -> Integers.SINGLETON.sum(0, (n + 1) / 4, j -> Binomial.binomial(((n & 1) == 0) ? n / 2 : n / 2 + 1, 2L * j)
      .multiply(Binomial.binomial(n / 2, k - 2L * j))));
  }
}
