package irvine.oeis.a356;
// Generated by gen_seq4.pl 2024-05-24/multrad at 2024-05-24 21:50

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.a355.A355886;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A356458 Expansion of e.g.f. ( Product_{k&gt;0} B(x^k) )^(1/(1-x)) where B(x) = exp(exp(x)-1) = e.g.f. of Bell numbers.
 * @author Georg Fischer
 */
public class A356458 extends MultiTransformSequence {

  private static final DirectSequence SEQ = new A355886();

  /** Construct the sequence. */
  public A356458() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> SEQ.a(k).multiply(Binomial.binomial(n - 1, k - 1)).multiply(self.a(n - k))), "1");
  }
}
