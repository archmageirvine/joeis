package irvine.oeis.a084;

import irvine.oeis.DifferenceSequence;

/**
 * A084529 Number of 'prime' ground-state 3-ball juggling sequences of period n.
 * @author Sean A. Irvine
 */
public class A084529 extends DifferenceSequence {

  /** Construct the sequence. */
  public A084529() {
    super(1, new A084528().prepend(0));
  }
}

