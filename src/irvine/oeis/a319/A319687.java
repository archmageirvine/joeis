package irvine.oeis.a319;
// Generated by gen_seq4.pl 2024-05-09/multraf at 2024-05-09 22:36

import irvine.oeis.a002.A002487;
import irvine.oeis.a318.A318509;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A319687 a(n) = A318509(n) - A002487(n).
 * @author Georg Fischer
 */
public class A319687 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A319687() {
    super(1, (self, n) -> self.s(0).subtract(self.s(1)), "", new A318509(), new A002487());
  }
}
