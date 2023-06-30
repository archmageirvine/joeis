package irvine.oeis.a363;
// manually partsum at 2023-06-30 09:12

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a246.A246655;

/**
 * A363459 Sum of the first n prime powers A246655.
 * @author Georg Fischer
 */
public class A363459 extends PartialSumSequence {

  /** Construct the sequence. */
  public A363459() {
    super(1, new A246655());
  }
}
