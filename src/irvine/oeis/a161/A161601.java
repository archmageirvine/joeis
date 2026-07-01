package irvine.oeis.a161;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A161601 Positive integers k that are less than the value of the reversal of k's representation in binary.
 * @author Sean A. Irvine
 */
public class A161601 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A161601() {
    super(1, 1, 2, k -> k < Functions.REVERSE.l(2, k));
  }
}
