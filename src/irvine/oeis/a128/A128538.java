package irvine.oeis.a128;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a000.A000959;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A128538 Number of prime factors (with multiplicity) of lucky numbers.
 * @author Georg Fischer
 */
public class A128538 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A128538() {
    super(1, (term, n) -> Functions.BIG_OMEGA.z(term), "", new A000959());
  }
}
