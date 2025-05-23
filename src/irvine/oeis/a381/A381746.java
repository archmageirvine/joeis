package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-09.ack/multrar at 2025-03-09 21:42

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A381746 Expansion of exp( Sum_{k&gt;=1} binomial(10*k-1,2*k) * x^k/k ).
 * @author Georg Fischer
 */
public class A381746 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A381746() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> self.a(n - k).multiply(Binomial.binomial(10 * k - 1, 2 * k))).divide(n), "1");
  }
}
