package irvine.oeis.a135;
// Generated by gen_seq4.pl 2024-06-14/multraf at 2024-06-14 23:07

import irvine.oeis.a000.A000045;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A135686 a(n) = a(n-1) + A000045(n)*a(n-2), a(1) = 1, a(2) = 1.
 * @author Georg Fischer
 */
public class A135686 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A135686() {
    super(1, (self, n) -> self.a(n - 1).add(self.s(0).multiply(self.a(n - 2))), "1, 1", new A000045());
  }
}
