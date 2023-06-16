package irvine.oeis.a038;

import irvine.oeis.DifferenceSequence;

/**
 * A038006 Differences of A038005.
 * @author Sean A. Irvine
 */
public class A038006 extends DifferenceSequence {

  /** Construct the sequence. */
  public A038006() {
    super(1, new A038005());
  }
}
