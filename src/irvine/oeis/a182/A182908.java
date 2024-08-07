package irvine.oeis.a182;
// Generated by gen_seq4.pl 2024-07-26/sintrif at 2024-07-27 00:11

import irvine.oeis.a024.A024622;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A182908 Rank of 2^n when all prime powers (A246655) p^n, for n&gt;=1, are jointly ranked.
 * @author Georg Fischer
 */
public class A182908 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A182908() {
    super(1, (term, n) -> term.subtract(1), "1", new A024622());
  }
}
