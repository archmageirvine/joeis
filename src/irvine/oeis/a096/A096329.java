package irvine.oeis.a096;
// Generated by gen_seq4.pl 2025-07-13.ack/sintrif at 2025-07-13 21:23

import irvine.math.function.Functions;
import irvine.oeis.a030.A030629;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A096329 Prime(p^10) where p is the n-th prime.
 * @author Georg Fischer
 */
public class A096329 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A096329() {
    super(1, (term, n) -> Functions.PRIME.z(term), "", new A030629());
  }
}
