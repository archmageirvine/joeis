package irvine.oeis.a038;

import irvine.oeis.DifferenceSequence;

/**
 * A038012 Differences of A038011.
 * @author Sean A. Irvine
 */
public class A038012 extends DifferenceSequence {

  /** Construct the sequence. */
  public A038012() {
    super(1, new A038011());
  }
}
