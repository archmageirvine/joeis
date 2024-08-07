package irvine.oeis.a113;
// Generated by gen_seq4.pl 2024-07-27.ack/sintrif at 2024-07-27 22:17

import irvine.oeis.PrependSequence;
import irvine.oeis.a014.A014684;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A113638 In the sequence of nonnegative integers subtract 1 from each prime number.
 * @author Georg Fischer
 */
public class A113638 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A113638() {
    super(0, (term, n) -> term, "", new PrependSequence(0, new A014684(), 0));
  }
}
