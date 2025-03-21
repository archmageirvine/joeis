package irvine.oeis.a106;
// Generated by gen_seq4.pl 2024-11-22.ack/lambdan at 2024-11-22 22:47

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A106474 a(n) = A006579(4n+4)/4.
 * @author Georg Fischer
 */
public class A106474 extends LambdaSequence {

  /** Construct the sequence. */
  public A106474() {
    super(0, n -> Rationals.SINGLETON.sum(0, 4 * n + 2, k -> new Q(Functions.GCD.z(4L * n - k + 3, k + 1)).divide(4)).num());
  }
}
