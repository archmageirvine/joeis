package irvine.oeis.a334;
// Generated by gen_seq4.pl 2024-08-09.ack/lambdan at 2024-08-10 19:00

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A334066 a(n) = (2n-1)!!*(Sum_{k=1..n}k/(2*k-1)).
 * @author Georg Fischer
 */
public class A334066 extends LambdaSequence {

  /** Construct the sequence. */
  public A334066() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(k, 2L * k - 1)).multiply(Functions.MULTIFACTORIAL.z(2, 2L * n - 1)).num());
  }
}
