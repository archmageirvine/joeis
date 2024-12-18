package irvine.oeis.a104;
// Generated by gen_seq4.pl 2024-11-01.ack/sintrif at 2024-11-01 22:07

import irvine.math.function.Functions;
import irvine.oeis.a019.A019519;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A104239 Number of distinct prime factors of 135...(2n-1) (concatenation of n odd numbers).
 * @author Georg Fischer
 */
public class A104239 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A104239() {
    super(1, (term, n) -> Functions.OMEGA.z(term), "", new A019519());
  }
}
