package irvine.oeis.a341;
// Generated by gen_seq4.pl 2024-11-24.ack/sintrif at 2024-11-24 22:15

import irvine.oeis.PrependSequence;
import irvine.oeis.a057.A057661;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A341316 Row sums in A341315.
 * @author Georg Fischer
 */
public class A341316 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A341316() {
    super(0, (term, n) -> term.multiply(3), "", new PrependSequence(0, new A057661(), 0));
  }
}
