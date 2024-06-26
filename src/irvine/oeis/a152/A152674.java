package irvine.oeis.a152;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a000.A000037;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A152674 Number of divisors of the numbers that are not squares.
 * @author Georg Fischer
 */
public class A152674 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A152674() {
    super(1, (term, n) -> Functions.SIGMA.z(0, term), "", new A000037());
  }
}
