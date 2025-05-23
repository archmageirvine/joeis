package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-05-22.ack/sintrif at 2025-05-22 22:55

import irvine.math.function.Functions;
import irvine.oeis.a005.A005867;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A382789 The number of prime factors of Euler phi of the n-th primorial number, counted with multiplicity.
 * @author Georg Fischer
 */
public class A382789 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A382789() {
    super(0, (term, n) -> Functions.BIG_OMEGA.z(term), "", new A005867());
  }
}
