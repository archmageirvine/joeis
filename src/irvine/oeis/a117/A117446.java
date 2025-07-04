package irvine.oeis.a117;
// Generated by gen_seq4.pl 2025-05-29.ack/trilambn at 2025-05-29 22:38

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A117446 Triangle T(n, k) = binomial(L(k/3), n-k) where L(j/p) is the Legendre symbol of j and p, read by rows.
 * @author Georg Fischer
 */
public class A117446 extends LambdaTriangle {

  /** Construct the sequence. */
  public A117446() {
    super(0, 0, 0, (n, k) -> Binomial.binomial(Functions.JACOBI.i(k, 3), n - k));
  }
}
