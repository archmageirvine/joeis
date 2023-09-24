package irvine.oeis.a163;
// manually diffs/diffseq at 2023-09-23 21:26

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a033.A033308;

/**
 * A163119 Absolute values of the first differences in the digit chain of the concatenated primes.
 * @author Georg Fischer
 */
public class A163119 extends DifferenceSequence {

  /** Construct the sequence. */
  public A163119() {
    super(1, new A033308(), true);
  }
}
