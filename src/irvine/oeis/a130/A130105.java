package irvine.oeis.a130;
// Generated by gen_seq4.pl 2025-06-16.ack/multraf at 2025-06-16 21:55

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.oeis.a027.A027641;
import irvine.oeis.a027.A027642;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A130105 a(n) = (2n)! * B_n, where B_n = n-th Bernoulli number.
 * @author Georg Fischer
 */
public class A130105 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A130105() {
    super(0, (self, n) -> new Q(Functions.FACTORIAL.z(2 * n)).multiply(self.s(0)).divide(self.s(1)).num(), "", new A027641(), new A027642());
  }
}
