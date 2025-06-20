package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A381056 Product of row n of A329708.
 * @author Georg Fischer
 */
public class A381056 extends LambdaSequence {

  /** Construct the sequence. */
  public A381056() {
    super(0, n -> new Q(n + 1).multiply(n + 2).multiply(n + 3).multiply(new Q(1).divide(6)).multiply(Rationals.SINGLETON.product(1, n, k -> new Q(k).multiply(k + 1).multiply(k + 2).multiply(new Q(n + k + 1).multiply(n + k + 2).multiply(n + k + 3).subtract(new Q(2).multiply(k).multiply(k + 1).multiply(3 * n + k + 5))).divide(36))).num());
  }
}
