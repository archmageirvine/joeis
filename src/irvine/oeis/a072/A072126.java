package irvine.oeis.a072;
// Generated by gen_seq4.pl 2024-08-16.ack/prepend at 2024-08-16 19:15

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002162;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A072126 Parity of the decimal digits of log(2).
 * @author Georg Fischer
 */
public class A072126 extends PrependSequence {

  /** Construct the sequence. */
  public A072126() {
    super(0, new SingleTransformSequence(0, (term, n) -> term.testBit(0) ? Z.ONE : Z.ZERO, new A002162()), 0);
  }
}
