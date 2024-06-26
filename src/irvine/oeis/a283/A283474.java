package irvine.oeis.a283;
// Generated by gen_seq4.pl 2024-04-25/multraf at 2024-04-25 23:20

import irvine.oeis.a002.A002487;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A283474 a(0) = 0, a(1) = 1, for n &gt; 1, a(n) = a(n-1) + a(n-A002487(n)).
 * @author Georg Fischer
 */
public class A283474 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A283474() {
    super(0, (self, n) -> self.a(n - 1).add(self.a(n - self.s(0).intValueExact())), "0, 1", new A002487());
  }
}
