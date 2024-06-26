package irvine.oeis.a354;
// Generated by gen_seq4.pl 2024-05-24/multrad at 2024-05-24 21:50

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A354504 Expansion of e.g.f. ( Product_{k&gt;0} (1 + x^k)^k )^exp(x).
 * @author Georg Fischer
 */
public class A354504 extends MultiTransformSequence {

  private static final DirectSequence SEQ = new A354508();

  /** Construct the sequence. */
  public A354504() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> SEQ.a(k).multiply(Binomial.binomial(n - 1, k - 1)).multiply(self.a(n - k))), "1");
  }
}
