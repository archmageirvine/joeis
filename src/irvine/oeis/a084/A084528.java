package irvine.oeis.a084;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.FilterPositionSequence;

/**
 * A084528 Partial sums of A084529. Positions of ones in the first differences of A084526.
 * @author Sean A. Irvine
 */
public class A084528 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084528() {
    super(1, new DifferenceSequence(new A084526()), ONE);
  }
}

