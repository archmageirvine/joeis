package irvine.oeis.a132;
// Generated by gen_seq4.pl 2025-06-16.ack/sintrif at 2025-06-16 21:55

import irvine.math.z.Z;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A132189 Number of non-constant 3-term geometric progressions with no term exceeding n.
 * @author Georg Fischer
 */
public class A132189 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A132189() {
    super(1, (term, n) -> Z.TWO.multiply(term), "", new A132345());
  }
}
