package irvine.oeis.a282;
// Generated by gen_seq4.pl 2025-04-20.ack/multrar at 2025-04-20 22:06

import irvine.oeis.DirectSequence;
import irvine.oeis.a034.A034699;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A282184 a(n) = A034699(a(n-1) + a(n-2) + a(n-3)) with a(0) = a(1) = a(2) = 1.
 * @author Georg Fischer
 */
public class A282184 extends MultiTransformSequence {

  private static final DirectSequence A034699 = new A034699();

  /** Construct the sequence. */
  public A282184() {
    super(0, (self, n) -> A034699.a(self.a(n - 1).add(self.a(n - 2)).add(self.a(n - 3))), "1,1,1");
  }
}
