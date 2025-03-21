package irvine.oeis.a120;
// Generated by gen_seq4.pl 2024-11-21.ack/trilambn at 2024-11-21 23:03

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A120730 Another version of Catalan triangle A009766.
 * @author Georg Fischer
 */
public class A120730 extends LambdaTriangle {

  /** Construct the sequence. */
  public A120730() {
    super(0, 0, 0, (n, k) -> (n > 2 * k) ? Z.ZERO : Binomial.binomial(n, k).multiply(2L * k - n + 1).divide(k + 1));
  }
}
