package irvine.oeis.a216;
// Generated by gen_seq4.pl 2025-02-13.ack/trilamb0 at 2025-02-13 23:28

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A216973 Exponential Riordan array [x*exp(x),x].
 * @author Georg Fischer
 */
public class A216973 extends LambdaTriangle {

  /** Construct the sequence. */
  public A216973() {
    super(0, 0, 0, (n, k) -> Z.valueOf(n - k).multiply(Binomial.binomial(n, k)));
  }
}
