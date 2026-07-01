package irvine.oeis.a161;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A161602 Positive integers k that are greater than the value of the reversal of k's binary representation.
 * @author Sean A. Irvine
 */
public class A161602 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A161602() {
    super(1, k -> Functions.REVERSE.l(2, k) < k);
  }
}
