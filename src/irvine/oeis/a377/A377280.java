package irvine.oeis.a377;
// Generated by gen_seq4.pl 2025-02-03.ack/sintrif at 2025-02-03 18:14

import irvine.math.z.Z;
import irvine.oeis.a003.A003558;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A377280 Given n cards, each time you reversing the order of the top 1, 2, 3, ..., n-1, n cards, then repeat reversing 1, 2, 3, ... cards. Do reversing at least once. the minimum number of steps required to return all the cards to their original position.
 * @author Georg Fischer
 */
public class A377280 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A377280() {
    super(1, (term, n) -> Z.valueOf(n).multiply(term), "", new A003558());
  }
}
