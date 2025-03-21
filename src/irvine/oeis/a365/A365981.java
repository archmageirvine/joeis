package irvine.oeis.a365;
// Generated by gen_seq4.pl 2024-12-14.ack/multrar at 2024-12-14 16:31

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A365981 Expansion of e.g.f. 1 / ( 1 - Sum_{k&gt;=0} x^(4*k+3) / (4*k+3) ).
 * @author Georg Fischer
 */
public class A365981 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A365981() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, (n - 3) / 4, k -> Functions.FACTORIAL.z(4 * k + 2).multiply(Binomial.binomial(n, 4L * k + 3)).multiply(self.a(n - 4 * k - 3))), "1,0,0,2,0,0");
  }
}
