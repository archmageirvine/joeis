package irvine.oeis.a356;
// Generated by gen_seq4.pl 2024-05-24/multrad at 2024-05-24 21:50

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A356402 Expansion of e.g.f. ( Product_{k&gt;0} (1+x^k)^(1/k!) )^(1/(1-x)).
 * @author Georg Fischer
 */
public class A356402 extends MultiTransformSequence {

  private static final DirectSequence SEQ = new A356401();

  /** Construct the sequence. */
  public A356402() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> SEQ.a(k).multiply(Binomial.binomial(n - 1, k - 1)).multiply(self.a(n - k))), "1");
  }
}
