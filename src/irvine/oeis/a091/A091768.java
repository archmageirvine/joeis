package irvine.oeis.a091;
// Generated by gen_seq4.pl 2025-04-30.ack/multrar at 2025-04-30 23:37

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A091768 Similar to Bell numbers (A000110).
 * @author Georg Fischer
 */
public class A091768 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A091768() {
    super(0, (self, n) -> Functions.CATALAN.z(n).add(Rationals.SINGLETON.sum(0, n - 1, k -> new Q(self.a(k)).multiply(Binomial.binomial(2 * n - k - 1, n - k - 1)).multiply(k + 2).divide(n + 1)).num()), "1");
  }
}
