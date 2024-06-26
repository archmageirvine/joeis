package irvine.oeis.a342;
// Generated by gen_seq4.pl 2024-05-14/multrafd at 2024-05-14 21:53

import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005940;
import irvine.oeis.a324.A324104;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A342654 a(n) = A005940(1+A324104(n)); Euler totient phi conjugated by A156552.
 * @author Georg Fischer
 */
public class A342654 extends MultiTransformSequence {

  private static final DirectSequence SEQ = new A005940();

  /** Construct the sequence. */
  public A342654() {
    super(1, (self, n) -> SEQ.a(self.s(0).add(1)), "", new A324104());
  }
}
